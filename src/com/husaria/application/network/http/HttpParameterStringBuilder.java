package com.husaria.application.network.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by Owner on 8/12/2018.
 */
public class HttpParameterStringBuilder {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public static String getParameterString(Map<String,String> params) throws UnsupportedEncodingException {

        if(params != null) {
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                sb.append("&");
            }

            String result = "?" + sb.toString();
            return result.length() > 0
                    ? result.substring(0, result.length() - 1)
                    : result;
        }else {

            return "";

        }

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/
