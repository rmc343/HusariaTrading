package com.husaria.application.network.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.husaria.application.network.IexSymbols;
import com.husaria.application.tradable.position.*;
import com.husaria.application.tradable.position.chart.MultiDayChart;
import com.husaria.application.tradable.position.chart.OneDayChart;

/**
 * Created by Owner on 8/12/2018.
 */
public class IexObjectMapper {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private static Gson gson = new Gson();

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public IexObjectMapper() {

    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public static Company createCompany(StringBuffer jsonString){


        Company company;

        company = gson.fromJson(String.valueOf(jsonString), Company.class);

        return company;

    }



    public static Dividend[] createDividend(StringBuffer jsonString){


        Dividend[] dividend;

        dividend = gson.fromJson(String.valueOf(jsonString), Dividend[].class);

        return dividend;

    }

    public static MultiDayChart[] createMultiDayChart(StringBuffer jsonString){

        MultiDayChart[] charts;

        charts = gson.fromJson(String.valueOf(jsonString), MultiDayChart[].class);

        return charts;

    }

    public static OneDayChart[] createOneDayChart(StringBuffer jsonString){

        OneDayChart[] charts;

        charts = gson.fromJson(String.valueOf(jsonString), OneDayChart[].class);

        return charts;

    }


    public static Earnings[] createEarnings(StringBuffer jsonString){


        JsonObject jsonObject = gson.fromJson(String.valueOf(jsonString), JsonObject.class);

        Earnings[] earnings = gson.fromJson(jsonObject.getAsJsonArray("earnings"), Earnings[].class);

        return earnings;

    }

    public static Quote createQuote(StringBuffer jsonString){


        Quote quote;

        quote = gson.fromJson(String.valueOf(jsonString), Quote.class);

        return quote;

    }

    public static News[] createNews(StringBuffer jsonString){

        News news[];

        news = gson.fromJson(String.valueOf(jsonString), News[].class);

        return news;

    }


    public static String createLogo(StringBuffer jsonString){

        String url = jsonString.toString();

        url.replace("}","");

        url.replace("\"","");

        url.replace("{url:","");

        return url;

    }

    public static Financial[] createFinancial(StringBuffer jsonString){


        JsonObject jsonObject = gson.fromJson(String.valueOf(jsonString), JsonObject.class);

        Financial[] financials  = gson.fromJson(jsonObject.getAsJsonArray("financials"), Financial[].class);

        return financials;

    }

    public static Splits[] createSplits(StringBuffer jsonString){

        Splits[] splits  = gson.fromJson(String.valueOf(jsonString), Splits[].class);

        return splits;

    }

    public static IexSymbols[] createIexSymbols(StringBuffer jsonString){

        IexSymbols[] iexSymbols  = gson.fromJson(String.valueOf(jsonString), IexSymbols[].class);

        return iexSymbols;

    }



    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

