package com.husaria.gui.toolkit.button;
import com.husaria.application.tradable.position.Stock;
import com.husaria.gui.toolkit.HButton;
import com.husaria.gui.toolkit.Iex.panel.StockPanelController;
import com.husaria.gui.toolkit.textfield.SearchTextField;
import com.husaria.toolkit.Printer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchButton extends HButton{


    public final static String SEARCH = "Search";

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================



    public SearchButton() {

        super(SEARCH);


    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================



    private void searchAction() {

        StockPanelController.getInstance().searchSymbol();

    }


    @Override
    public void generateActions() {

        addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {


                searchAction();

            }
        });

    }
}//****************************************************END OF FILE*****************************************************/

