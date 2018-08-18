package com.husaria.application.tradable.position.chart;

import com.husaria.application.tradable.position.Chart;

/**
 * Created by Owner on 8/18/2018.
 */
public class MultiDayChart extends Chart {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private long unadjustedVolume;
    private double change;
    private double changePercentage;
    private double vwap;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public MultiDayChart() {
    }

    public MultiDayChart(double open, double high, double low, double close, long volume, double unadjustedClose,
                         String label, String date, long unadjustedVolume, double change, double changePercentage, double vwap) {

        super(open, high, low, close, volume, unadjustedClose, label, date);
        this.unadjustedVolume = unadjustedVolume;
        this.change = change;
        this.changePercentage = changePercentage;
        this.vwap = vwap;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public long getUnadjustedVolume() {
        return unadjustedVolume;
    }

    public void setUnadjustedVolume(long unadjustedVolume) {
        this.unadjustedVolume = unadjustedVolume;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(double changePercentage) {
        this.changePercentage = changePercentage;
    }

    public double getVwap() {
        return vwap;
    }

    public void setVwap(double vwap) {
        this.vwap = vwap;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

