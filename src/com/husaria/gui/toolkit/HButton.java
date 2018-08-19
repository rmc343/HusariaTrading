package com.husaria.gui.toolkit;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Owner on 8/18/2018.
 */
public abstract class HButton extends HComponent implements IActionable {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String text;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public HButton(String text) {

        super(new JButton());
        this.text = text;
        generateData();
        generateActions();

    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public JButton getComponent()
    {

        return  (JButton)super.getComponent();

    }

    public void setComponent(JButton button)
    {

        super.setComponent(button);

    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public void addActionListener(ActionListener actionListener){

        getComponent().addActionListener(actionListener);

    }

    public void setText(String text)
    {

        getComponent().setText(text);

    }

    @Override
    public void generateData() {

        setText(text);

    }

    @Override
    public void updateData() {

    }
    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================



}//****************************************************END OF FILE*****************************************************/


