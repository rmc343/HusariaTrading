package com.husaria.application.network.http;

import com.husaria.toolkit.Printer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by Owner on 8/12/2018.
 */
public class HttpConnectionManager {


    public static final String GET = "GET";
    public static final String POST = "POST";

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private URL url;
    private HttpURLConnection connection;
    private DataOutputStream out;
    private BufferedReader in;
    private Printer printer = new Printer();

    private boolean connected;




    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================



    public StringBuffer httpRequest(boolean get,String urlString,Map<String,String> params) throws MalformedURLException, IOException {

        StringBuffer buffer;

        String paramString = HttpParameterStringBuilder.getParameterString(params);

        urlString += paramString;

        connect(urlString);

        if(get) {

            connection.setRequestMethod(GET);
            printer.printLine("HTTP GET:" + url);

        }else {

            connection.setRequestMethod(POST);
            printer.printLine("HTTP POST:" + url);

        }


        //writeHttpParams(params);

        buffer = readHttpResponse();
        disconnect();

        return buffer;


    }




    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================


    private StringBuffer readHttpResponse() throws IOException {

        int status = connection.getResponseCode();

        printer.printLine("HTTP Response Code: " + status);

        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String inputLine;

        StringBuffer content = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        return content;

    }

    private void writeHttpParams(Map<String, String> params) throws IOException {

        if(connected && params != null) {

            String paramString = HttpParameterStringBuilder.getParameterString(params);

            connection.setDoOutput(true);

            out = new DataOutputStream(connection.getOutputStream());
            out.writeBytes(paramString);

            out.flush();
            out.close();


        }
    }

    private void connect(String urlString)throws MalformedURLException, IOException {

        url = new URL(urlString);
        connection =(HttpURLConnection) url.openConnection();
        connected = true;

        printer.printLine("Http Connected: " + urlString);

    }


    private void disconnect()throws MalformedURLException, IOException {

        if(connected) {

            connection.disconnect();
            connected = false;
            printer.printLine("Http Disconnected!");

        }else {

            printer.printLine("No Connection Available");

        }

    }



}//****************************************************END OF FILE*****************************************************/

