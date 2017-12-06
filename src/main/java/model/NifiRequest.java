package model;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Thomas on 01.12.2017.
 */
public class NifiRequest {


    URL url;
    HttpURLConnection connection;
    OutputStreamWriter out;

    public void SendRequestPost(String target_url,String string_json)throws Exception{
        url=new URL(target_url);
        connection=(HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        out=new OutputStreamWriter(connection.getOutputStream());
        out.write(string_json);
        out.flush();
        out.close();
        System.out.println(ResponseCode());
    }
    public int ResponseCode() throws Exception{
        int res=connection.getResponseCode();
        return res;
    }
}
