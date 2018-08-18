package com.husaria.application.tradable.position.stock;

import com.husaria.application.network.IexDate;
import com.husaria.application.network.IexTradingAPIManager;
import com.husaria.application.network.json.IexObjectMapper;
import com.husaria.application.tradable.position.*;
import com.husaria.toolkit.Printer;

import java.io.IOException;

/**
 * Created by Owner on 8/11/2018.
 */
public class DividendStock extends Stock {


    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private Dividend[] dividend;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public DividendStock(String symbol) {
        super(symbol);
    }

    public DividendStock(String symbol, Company company, String logo, News[] news, Quote quote, Earnings earnings[],
                         Financial financials[], Dividend[] dividend, Splits[] splits, Chart[] charts) {

        super(symbol, company, logo, news, quote, earnings, financials, splits,charts);
        this.dividend = dividend;

    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public Dividend[] getDividend() {
        return dividend;
    }

    public void setDividend(Dividend[] dividend) {
        this.dividend = dividend;
    }

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public void generateData(){

        IexTradingAPIManager apiManager = new IexTradingAPIManager();
        Printer printer = new Printer();


        super.generateData();

        try {

            dividend = IexObjectMapper.createDividend(apiManager.requestDividend(getSymbol(), IexDate._1Y));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

