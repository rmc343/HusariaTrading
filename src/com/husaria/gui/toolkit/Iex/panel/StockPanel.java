package com.husaria.gui.toolkit.Iex.panel;

import com.husaria.application.tradable.position.Company;
import com.husaria.application.tradable.position.Earnings;
import com.husaria.gui.toolkit.HPanel;
import com.husaria.gui.toolkit.Iex.IexPanel;
import com.husaria.gui.toolkit.Iex.panel.stock.CompanyPanel;
import com.husaria.gui.toolkit.Iex.panel.stock.EarningsPanel;
import com.husaria.gui.toolkit.button.SearchButton;

/**
 * Created by Owner on 8/18/2018.
 */
public class StockPanel extends HPanel {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private CompanyPanel companyPanel;
    private EarningsPanel earningsPanel;
    private SearchButton searchButton;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public StockPanel() {

        companyPanel = new CompanyPanel();
        earningsPanel = new EarningsPanel();
        searchButton = new SearchButton();
    }

    public StockPanel(Company company, Earnings earnings, SearchButton searchButton)
    {
        companyPanel = new CompanyPanel(company);
        earningsPanel = new EarningsPanel();
        searchButton = new SearchButton();
    }



    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    @Override
    public void generateData() {

    }



    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/


