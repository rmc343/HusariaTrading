package com.husaria.gui.toolkit;

import javax.swing.*;
import java.awt.*;

public abstract class HPanel extends HComponent {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private JPanel panel;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public HPanel() {

        super(new JPanel());


    }



    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public JPanel getComponent()
    {

        return  (JPanel)super.getComponent();

    }

    public void setComponent(JPanel panel)
    {

        super.setComponent(panel);

    }

    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public HLabel addHLabel(String text){

        HLabel label = new HLabel(text);
        label.getComponent().setAlignmentX(Component.CENTER_ALIGNMENT);
        getComponent().add(label.getComponent());

        return label;

    }

    public HButton addHButton(String text, HButton button){

        button.setText(text);
        button.getComponent().setAlignmentX(Component.CENTER_ALIGNMENT);
        getComponent().add(button.getComponent());

        return button;

    }

    public HTextField addHTextField(HTextField textField){

        textField.getComponent().setAlignmentX(Component.CENTER_ALIGNMENT);
        getComponent().add(textField.getComponent());

        return textField;

    }

    public HPanel addPanel( HPanel panel){

        panel.getComponent().setAlignmentX(Component.CENTER_ALIGNMENT);
        getComponent().add(panel.getComponent());

        return panel;

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================






}//****************************************************END OF FILE*****************************************************/


