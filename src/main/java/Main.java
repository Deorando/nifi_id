import ReadProcessGroupSpec.ReadProcessGroupsSpec;
import com.google.gson.Gson;
import model.NifiRequest;
import model_ProcessGroupRead.ProcessGroupRead;
import model_consumer_create.ConsumerCreate;
import process_groups.ProcessGroups;
import view.DwhServiceList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 01.12.2017.
 */
public class Main {

    static ProcessGroups pg= null;
    static ProcessGroupRead pgr= null;
    static ProcessGroupRead pgr_sub= null;

    static ReadProcessGroupsSpec pgrs=null;


    static DwhServiceList dwhServiceList= new DwhServiceList();
    static List<String> a_l= dwhServiceList.DwhServiceList();
    static List<String> a_l_group= dwhServiceList.ListofGroups();

    public static void main(String[] args) throws Exception {

        CreateProcessGroupMain();
        CreateSubProcessGroup();

        ConsumerCreate consumerCreate=null;
        List<String> list_name= dwhServiceList.SchemaName();
        Gson gson= new Gson();

        URL oracle = new URL("http://localhost:8080/nifi-api/process-groups/ce925d3e-015f-1000-931d-115a32beb33a/process-groups");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String response="";
        String inputLine = "";
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }

        in.close();
        pgr=gson.fromJson(response, ProcessGroupRead.class);
        URL oracle_sub=null;
        String data="";
        System.out.println(pgr.getProcessGroups().size());
        for(int i=0;i<pgr.getProcessGroups().size();i++) {
            //System.out.println(pgr.getProcessGroups().get(i).getComponent().getName() +" "+ pgr.getProcessGroups().get(i).getComponent().getId());//mail,user,purchase
            System.out.println(pgr.getProcessGroups().get(i).getComponent().getId()+" "+pgr.getProcessGroups().get(i).getComponent().getName());
            data=ReadUrl(pgr.getProcessGroups().get(i).getComponent().getId());
            //List<ReadProcessGroupsSpec> l_pgrs= (List<ReadProcessGroupsSpec>) gson.fromJson(data, ReadProcessGroupsSpec.class);
            //System.out.println(l_pgrs.size());
            //System.out.println("data: "+data);//mail,user,purchase
        }

        String test = "";
        String sub_response="";
        int y=0;
        String process_name="";
        String schema_name="";
        for(int i=0;i<pgr.getProcessGroups().size();i++) {
            sub_response=ReadUrl(pgr.getProcessGroups().get(i).getComponent().getId());
            pgr_sub=gson.fromJson(sub_response, ProcessGroupRead.class);
            for(int k=0;k<pgr_sub.getProcessGroups().size();k++) {
                for(int n=0;n<dwhServiceList.SchemaName().size();n++) {
                    //System.out.println("sub_response: " + pgr_sub.getProcessGroups().get(k).getComponent().getName());
                    //if(dwhServiceList.SchemaName().get(n).equals())
                    schema_name=dwhServiceList.SchemaName().get(n).substring(0,dwhServiceList.SchemaName().get(n).indexOf("_"));
                    process_name=pgr_sub.getProcessGroups().get(k).getComponent().getName().substring(0,pgr_sub.getProcessGroups().get(k).getComponent().getName().indexOf("_"));
                    System.out.println("schema_name: "+pgr_sub.getProcessGroups().get(k).getComponent().getName().substring(pgr_sub.getProcessGroups().get(k).getComponent().getName().indexOf("_")+1));
                    if(process_name.equals(schema_name)) {

                            consumerCreate = new ConsumerCreate(0l, y, "Consume_" + dwhServiceList.SchemaName().get(n) + "_" + y, "stg_" + dwhServiceList.SchemaName().get(n) + "_batch", pgr_sub.getProcessGroups().get(k).getComponent().getName().substring(pgr_sub.getProcessGroups().get(k).getComponent().getName().indexOf("_")+1));
                            test = gson.toJson(consumerCreate);
                            NifiRequest nifiRequest = new NifiRequest();
                            nifiRequest.SendRequestPost("http://localhost:8080/nifi-api/process-groups/" + pgr_sub.getProcessGroups().get(k).getComponent().getId() + "/processors", test);
                            //System.out.println(test);
                            y = y + 200;

                    }
                }
                y=0;
                process_name="";
                schema_name="";
            }
            y=0;

        }
















    }

    private static String ReadUrl(String id) throws IOException {
        String data="";
        URL oracle = new URL("http://localhost:8080/nifi-api/process-groups/"+id+"/process-groups");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String response="";
        String inputLine = "";
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }

        in.close();
        return response;
    }

    public static void CreateProcessGroupMain() throws Exception {


        CreateProcessGroups cpg= new CreateProcessGroups();



        a_l=dwhServiceList.DwhServiceList();//mail_tp,usage_tp etc...
        //a_l_group=dwhServiceList.ListofGroups();
        System.out.println(a_l.size());
        System.out.println(a_l_group.size());

        int y = 0;
        int z = 0;

        Gson gson = new Gson();
        String data = "";

        for(int l=0;z<a_l_group.size();l++) {
            data = gson.toJson(cpg.CreateProcessGroups(0, y, a_l_group.get(z)));
            NifiRequest nifiRequest = new NifiRequest();
            nifiRequest.SendRequestPost("http://localhost:8080/nifi-api/process-groups/ce925d3e-015f-1000-931d-115a32beb33a/process-groups", data);
            z=z+1;
            y = y + 200;
        }

    }

    public static void CreateSubProcessGroup()throws Exception{
        Gson gson = new Gson();
        int y = 0;
        int z = 0;
        String data="";

        URL oracle = new URL("http://localhost:8080/nifi-api/process-groups/ce925d3e-015f-1000-931d-115a32beb33a/process-groups");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String response="";
        String inputLine = "";
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }
        in.close();
        pgr=gson.fromJson(response, ProcessGroupRead.class);
        //Read Process_group_Main

        z = z + 1;
        for(int i=0;i<a_l_group.size();i++) {
            for (int k = 0; k < a_l.size(); k++) {


                if (pgr.getProcessGroups().get(i).getComponent().getName().equals(a_l.get(k).substring(0,a_l.get(k).indexOf("_")))) {

                        CreateProcessGroups cpg = new CreateProcessGroups();
                        data = gson.toJson(cpg.CreateProcessGroups(0, y, a_l.get(k)));
                        NifiRequest nifiRequest = new NifiRequest();
                        nifiRequest.SendRequestPost("http://localhost:8080/nifi-api/process-groups/" + pgr.getProcessGroups().get(i).getComponent().getId() + "/process-groups", data);
                        y = y + 200;


                }
                else{

                }
            }
        }

    }


}
