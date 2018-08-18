package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/18/2018.
 */
public abstract class Chart {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;
    private double unadjustedClose;
    private String label;
    private String date;


    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Chart() {
    }

    public Chart(double open, double high, double low, double close, long volume, double unadjustedClose, String label, String date) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.unadjustedClose = unadjustedClose;
        this.label = label;
        this.date = date;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public double getUnadjustedClose() {
        return unadjustedClose;
    }

    public void setUnadjustedClose(double unadjustedClose) {
        this.unadjustedClose = unadjustedClose;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

