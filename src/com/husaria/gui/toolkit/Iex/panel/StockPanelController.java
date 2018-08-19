package com.husaria.gui.toolkit.Iex.panel;

import com.husaria.application.tradable.position.Company;
import com.husaria.application.tradable.position.Earnings;
import com.husaria.application.tradable.position.Quote;
import com.husaria.application.tradable.position.Stock;
import com.husaria.toolkit.Singleton;

/**
 * Created by Owner on 8/19/2018.
 */
public class StockPanelController{


    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================
    private static StockPanelController instance = new StockPanelController();

    private StockPanel stockPanel;
    private Stock stock;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================


    private StockPanelController() {
    }



    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public StockPanel getStockPanel() {
        return stockPanel;
    }

    public void setStockPanel(StockPanel stockPanel) {
        this.stockPanel = stockPanel;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public static StockPanelController getInstance() {
        return instance;
    }



    public void searchSymbol()
    {
        String symbol = stockPanel.getSearchTextField().parseSymbol();

        stock = new Stock(symbol);

        stock.generateData();

        updateCompanyPanel(stock.getCompany());
        updateQuotePanel(stock.getQuote());

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

    private void updateQuotePanel(Quote quote)
    {

        double open = quote.getOpen();
        double high = quote.getHigh();
        double low = quote.getLow();
        double _52wkHigh = quote.getWeek52High();
        double _52wkLow = quote.getWeek52Low();
        long volume = quote.getLatestVolume();
        long avgVolume = quote.getAvgTotalVolume();
        long mktCap = quote.getMarketCap();
        double peRatio = quote.getPeRatio();

        stockPanel.getQuotePanel().setAllLabelText(open, high, low, _52wkHigh, _52wkLow, volume, avgVolume, mktCap, peRatio);

    }

    private void updateCompanyPanel(Company company)
    {

        String companyName = company.getCompanyName();
        String exchange = company.getExchange();
        String industry = company.getIndustry();
        String website = company.getWebsite();
        String ceo = company.getCeo();
        String issueType = company.getIssueType();
        String sector = company.getSector();

        stockPanel.getCompanyPanel().setAllLabelText(companyName, exchange, industry, website, ceo, issueType, sector);

    }

    private void updateEarningsPanel(Earnings[] earnings)
    {

        //stockPanel.getQuotePanel().setAllLabelText(companyName, exchange, industry, website, ceo, issueType, sector);

    }



}//****************************************************END OF FILE*****************************************************/

