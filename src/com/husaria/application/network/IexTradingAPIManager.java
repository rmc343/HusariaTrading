package com.husaria.application.network;

import com.husaria.application.network.http.HttpConnectionManager;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 8/12/2018.
 */
public class IexTradingAPIManager {

    public static final String IEX_API_URL = "https://api.iextrading.com/1.0/";
    public static final String STOCK = "stock";
    public static final String COMPANY = "company";
    public static final String EARNINGS = "earnings";
    public static final String DIVIDENDS = "dividends";
    public static final String CHART = "chart";
    public static final String QUOTE = "quote";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String NEWS = "news";
    public static final String LOGO = "logo";
    public static final String FINANCIALS = "financials";
    public static final String LAST = "last";
    public static final String SPLITS = "splits";

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private HttpConnectionManager connectionManager;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public IexTradingAPIManager() {
        connectionManager = new HttpConnectionManager();
    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public StringBuffer requestCompany(String symbol) throws IOException {

        String request = STOCK + "/" + symbol + "/" + COMPANY;
        return iexAPiRequest(request,null);

    }

    public StringBuffer requestDividend(String symbol, IexDate date) throws IOException {

        String dateString = date.toString().replace("_","");

        String request = STOCK + "/" + symbol + "/" + DIVIDENDS + "/" + dateString;
        return iexAPiRequest(request,null);

    }

    public StringBuffer requestSplits(String symbol, IexDate date) throws IOException {

        String dateString = date.toString().replace("_","");

        String request = STOCK + "/" + symbol + "/" + SPLITS + "/" + dateString;
        return iexAPiRequest(request,null);

    }

    public StringBuffer requestEarnings(String symbol) throws IOException {

        String request = STOCK + "/" + symbol + "/" + EARNINGS;
        return iexAPiRequest(request,null);

    }

    public StringBuffer requestChart(String symbol, IexDate range) throws IOException {

        String rangeString  = range.toString().replace("_","");

        String request = STOCK + "/" + symbol + "/" + CHART + "/" + rangeString;
        return iexAPiRequest(request,null);

    }
    public StringBuffer requestChart(String symbol, Date range) throws IOException {

        //String rangeString = range.
        String request = STOCK + "/" + symbol + "/" + CHART + "/" + range;
        return iexAPiRequest(request,null);

    }

    public StringBuffer requestQuote(String symbol, boolean displayPercent) throws IOException {

        Map<String,String> params = new HashMap<>();

        if(displayPercent) {
            params.put("displayPercent", TRUE);
        }else{
            params.put("displayPercent", FALSE);
        }

        String request = STOCK + "/" + symbol + "/" + QUOTE;

        return iexAPiRequest(request,params);
    }


    public StringBuffer requestNews(String symbol, int last) throws IOException {


        if(last < 51) {

            String request = STOCK + "/" + symbol + "/" + NEWS + "/" + LAST  + "/" + last;

            return iexAPiRequest(request, null);

        }

        return null;
    }

    public StringBuffer requestMarketNews(int last) throws IOException {


        if(last < 51) {

            String request = STOCK + "/market/" + NEWS + "/" + LAST  + "/" + last;

            return iexAPiRequest(request, null);

        }

        return null;
    }

    public StringBuffer requestLogo(String symbol) throws IOException {

        String request = STOCK + "/" + symbol + "/" + LOGO;

        return iexAPiRequest(request, null);


    }

    public StringBuffer requestFinicial(String symbol, boolean annual) throws IOException {

        Map<String,String> params = new HashMap<>();

        if(annual) {
            params.put("period", "annual");
        }else{
            params.put("period", "quarter");
        }

        String request = STOCK + "/" + symbol + "/" + FINANCIALS;


        return iexAPiRequest(request, params);

    }

    public StringBuffer requestSupportedSymbols() throws IOException {

        String request = "ref-data/symbols";

        return iexAPiRequest(request, null);

    }





    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

    private StringBuffer iexAPiRequest(String request, Map<String, String> params) throws IOException {

        request = IEX_API_URL +  request;

        return  connectionManager.httpRequest(true,request,params);

    }




}//****************************************************END OF FILE*****************************************************/

