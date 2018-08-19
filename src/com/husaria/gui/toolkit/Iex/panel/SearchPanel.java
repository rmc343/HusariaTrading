package com.husaria.gui.toolkit.Iex.panel;

import com.husaria.application.tradable.position.Stock;
import com.husaria.gui.toolkit.HLabel;
import com.husaria.gui.toolkit.HPanel;
import com.husaria.gui.toolkit.button.SearchButton;
import com.husaria.gui.toolkit.textfield.SearchTextField;

import javax.swing.*;

/**
 * Created by Owner on 8/19/2018.
 */
public class SearchPanel extends HPanel{

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private SearchButton searchButton;
    private SearchTextField searchTextField;


    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public SearchPanel() {

        searchTextField = new SearchTextField();
        searchButton = new SearchButton();
        generateData();

    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public SearchTextField getSearchTextField() {
        return searchTextField;
    }

    public void setSearchTextField(SearchTextField searchTextField) {
        this.searchTextField = searchTextField;
    }

    public SearchButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(SearchButton searchButton) {
        this.searchButton = searchButton;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    @Override
    public void generateData() {

        getComponent().setLayout(new BoxLayout(getComponent(), BoxLayout.Y_AXIS));
        searchTextField =  (SearchTextField) addHTextField(searchTextField);
        searchButton = (SearchButton) addHButton(SearchButton.SEARCH, searchButton);

    }


    @Override
    public void updateData() {

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

