package view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 01.12.2017.
 */
public class DwhServiceList {

    public List<String> DwhServiceList () {

        List<String> records = new ArrayList<String>();
        String[] values_groups = {"mail", "user", "usage", "purchase", "commisions", "subscriptions"};
        String[] locations = {"tp", "ddach", "ip", "ac", "ddint"};

        for (int i = 0; i < values_groups.length; i++) {
            for (int k = 0; k < locations.length; k++) {
                records.add(values_groups[i] + "_" + locations[k]);
            }

        }
        //for(int i=0;i<records.size();i++)
        //System.out.println(records.get(i));
        //records.add("a");
        //records.add("b");
        //records.add("c");
        //records.add("d");
        return records;
    }
    public List<String> ListofGroups(){
        List<String> records = new ArrayList<String>();
        records.add("mail");
        records.add("user");
        records.add("purchase");
        records.add("commisions");
        records.add("subscriptions");
        records.add("usage");
        return records;
    }
    public List<String> SchemaName(){
        List<String> records = new ArrayList<String>();
        records.add("mail_hit_id");
        records.add("purchase_name");
        records.add("commission_id");
        records.add("subscription_id");
        records.add("purchase_id");
        records.add("user_id");
        records.add("usage_id");
        for(int i=0;i<10;i++){
            records.add("usage_nummer_"+i);
        }
        return records;
    }
    public List<String> Vhost(){
        List<String> records = new ArrayList<String>();
        records.add("dint");
        records.add("ac");
        records.add("ddach");
        return records;
    }

}
