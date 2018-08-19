package com.husaria.application;

import com.husaria.application.network.IexTradingAPIManager;
import com.husaria.application.tradable.position.Company;
import com.husaria.application.tradable.position.Dividend;
import com.husaria.application.tradable.position.Stock;
import com.husaria.application.tradable.position.stock.DividendStock;
import com.husaria.gui.toolkit.Iex.panel.StockPanel;
import com.husaria.gui.toolkit.Iex.panel.StockPanelController;
import com.husaria.gui.toolkit.Iex.panel.stock.CompanyPanel;
import com.husaria.toolkit.Printer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Owner on 8/12/2018.
 */
public class Main {

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

    public static void main(String[] argv) throws IOException {


        IexTradingAPIManager apiManager = new IexTradingAPIManager();
        Printer printer = new Printer();

        StockPanelController controller = StockPanelController.getInstance();

        JFrame f = new JFrame();

        f.setLayout(new BorderLayout());

        StockPanel stockPanel = new StockPanel();
        //CompanyPanel companyPanel = new CompanyPanel(stock.getCompany());

        stockPanel.generateData();

        controller.setStockPanel(stockPanel);

        f.add(stockPanel.getComponent(), BorderLayout.CENTER);

        f.pack();
        f.setVisible(true);

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

