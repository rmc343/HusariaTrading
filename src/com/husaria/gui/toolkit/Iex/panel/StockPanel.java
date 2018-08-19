package com.husaria.gui.toolkit.Iex.panel;

import com.husaria.application.tradable.position.Company;
import com.husaria.application.tradable.position.Earnings;
import com.husaria.application.tradable.position.Stock;
import com.husaria.gui.toolkit.HPanel;
import com.husaria.gui.toolkit.Iex.IexPanel;
import com.husaria.gui.toolkit.Iex.panel.stock.CompanyPanel;
import com.husaria.gui.toolkit.Iex.panel.stock.EarningsPanel;
import com.husaria.gui.toolkit.Iex.panel.stock.QuotePanel;
import com.husaria.gui.toolkit.button.SearchButton;
import com.husaria.gui.toolkit.textfield.SearchTextField;

import javax.swing.*;

/**
 * Created by Owner on 8/18/2018.
 */
public class StockPanel extends HPanel {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private CompanyPanel companyPanel;
    private EarningsPanel earningsPanel;
    private SearchPanel searchPanel;
    private QuotePanel quotePanel;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public StockPanel() {

        companyPanel = new CompanyPanel();
        earningsPanel = new EarningsPanel();
        quotePanel = new QuotePanel();
        searchPanel = new SearchPanel();
    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public CompanyPanel getCompanyPanel() {
        return companyPanel;
    }

    public void setCompanyPanel(CompanyPanel companyPanel) {
        this.companyPanel = companyPanel;
    }

    public EarningsPanel getEarningsPanel() {
        return earningsPanel;
    }

    public void setEarningsPanel(EarningsPanel earningsPanel) {
        this.earningsPanel = earningsPanel;
    }

    public SearchPanel getSearchPanel() {
        return searchPanel;
    }

    public void setSearchPanel(SearchPanel searchPanel) {
        this.searchPanel = searchPanel;
    }

    public QuotePanel getQuotePanel() {
        return quotePanel;
    }

    public void setQuotePanel(QuotePanel quotePanel) {
        this.quotePanel = quotePanel;
    }

    public SearchTextField getSearchTextField()
    {
        return searchPanel.getSearchTextField();
    }

    public SearchButton getSearchButton()
    {
        return searchPanel.getSearchButton();
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    @Override
    public void generateData() {

        getComponent().setLayout(new BoxLayout(getComponent(), BoxLayout.Y_AXIS));
        companyPanel = (CompanyPanel) addPanel(companyPanel);
        //earningsPanel = (EarningsPanel) addPanel(companyPanel);
        //companyPanel = (CompanyPanel) addPanel(companyPanel);
        quotePanel = (QuotePanel) addPanel(quotePanel);

        searchPanel =  (SearchPanel) addPanel(searchPanel);


    }

    @Override
    public void updateData() {

    }



    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/


