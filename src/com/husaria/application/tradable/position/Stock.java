package com.husaria.application.tradable.position;

import com.husaria.application.network.IexDate;
import com.husaria.application.network.IexTradingAPIManager;
import com.husaria.application.network.json.IexObjectMapper;
import com.husaria.application.tradable.Position;
import com.husaria.toolkit.Printer;

import java.io.IOException;

/**
 * Created by Owner on 8/11/2018.
 */
public class Stock extends Position {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String symbol;
    private Company company;
    private String logo;
    private News news[];
    private Quote quote;
    private Earnings earnings[];
    private Financial financials[];
    private Splits splits[];
    private Chart charts[];

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    public Stock(String symbol, Company company, String logo, News[] news, Quote quote, Earnings[] earnings, Financial[] financials,
                 Splits[] splits, Chart[] charts) {
        this.symbol = symbol;
        this.company = company;
        this.logo = logo;
        this.news = news;
        this.quote = quote;
        this.earnings = earnings;
        this.financials = financials;
        this.splits = splits;
        this.charts = charts;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public News[] getNews() {
        return news;
    }

    public void setNews(News[] news) {
        this.news = news;
    }


    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public Earnings[] getEarnings() {
        return earnings;
    }

    public void setEarnings(Earnings earnings[]) {
        this.earnings = earnings;
    }

    public Financial[] getFinancials() {
        return financials;
    }

    public void setFinancials(Financial[] financials) {
        this.financials = financials;
    }

    public Splits[] getSplits() {
        return splits;
    }

    public void setSplits(Splits[] splits) {
        this.splits = splits;
    }

    public Chart[] getCharts() {
        return charts;
    }

    public void setCharts(Chart[] charts) {
        this.charts = charts;
    }

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public void generateData(){

        IexTradingAPIManager apiManager = new IexTradingAPIManager();
        Printer printer = new Printer();

        try {

            company = IexObjectMapper.createCompany(apiManager.requestCompany(symbol));
            earnings = IexObjectMapper.createEarnings(apiManager.requestEarnings(symbol));
            quote  = IexObjectMapper.createQuote(apiManager.requestQuote(symbol, true));
            logo = IexObjectMapper.createLogo(apiManager.requestLogo(symbol));
            financials  = IexObjectMapper.createFinancial(apiManager.requestFinicial(symbol, true));
            splits = IexObjectMapper.createSplits(apiManager.requestSplits(symbol, IexDate._5Y));
            news = IexObjectMapper.createNews(apiManager.requestNews(symbol, 5));
            charts = IexObjectMapper.createMultiDayChart(apiManager.requestChart(symbol, IexDate._5Y));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================








}//****************************************************END OF FILE*****************************************************/


