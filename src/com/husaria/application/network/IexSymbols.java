package com.husaria.application.network;

/**
 * Created by Owner on 8/18/2018.
 */
public class IexSymbols {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String symbol;
    private String name;
    private String date;
    private boolean isEnabled;
    private String type;
    private int iexId;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public IexSymbols() {
    }

    public IexSymbols(String symbol, String name, String date, boolean isEnabled, String type, int iexId) {
        this.symbol = symbol;
        this.name = name;
        this.date = date;
        this.isEnabled = isEnabled;
        this.type = type;
        this.iexId = iexId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIexId() {
        return iexId;
    }

    public void setIexId(int iexId) {
        this.iexId = iexId;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================


}//****************************************************END OF FILE*****************************************************/

