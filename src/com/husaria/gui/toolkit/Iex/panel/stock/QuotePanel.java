package com.husaria.gui.toolkit.Iex.panel.stock;

import com.husaria.gui.toolkit.HLabel;
import com.husaria.gui.toolkit.HPanel;

import javax.swing.*;

/**
 * Created by Owner on 8/18/2018.
 */
public class QuotePanel extends HPanel {

    public static final String OPEN = "Open: ";
    public static final String HIGH = "High: ";
    public static final String LOW = "Low: ";
    public static final String _52_WEEK_HIGH = "52 Week High: ";
    public static final String _52_WEEK_LOW = "52 Week Low:";
    public static final String VOLUME = "Volume: ";
    public static final String AVG_VOLUME = "Average Volume: ";
    public static final String MKT_CAP = "Market Cap:";
    public static final String P_E_RATIO = "P/E Ratio: ";

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private HLabel openLabel, highLabel, lowLabel, _52wkHighLabel, _52wkLowLabel, volumeLabel, avgVolLabel, mktCapLabel, peRatioLabel;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public QuotePanel() {
        generateData();
    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public HLabel getOpenLabel() {
        return openLabel;
    }

    public void setOpenLabel(HLabel openLabel) {
        this.openLabel = openLabel;
    }

    public HLabel getHighLabel() {
        return highLabel;
    }

    public void setHighLabel(HLabel highLabel) {
        this.highLabel = highLabel;
    }

    public HLabel getLowLabel() {
        return lowLabel;
    }

    public void setLowLabel(HLabel lowLabel) {
        this.lowLabel = lowLabel;
    }

    public HLabel get_52wkHighLabel() {
        return _52wkHighLabel;
    }

    public void set_52wkHighLabel(HLabel _52wkHighLabel) {
        this._52wkHighLabel = _52wkHighLabel;
    }

    public HLabel get_52wkLowLabel() {
        return _52wkLowLabel;
    }

    public void set_52wkLowLabel(HLabel _52wkLowLabel) {
        this._52wkLowLabel = _52wkLowLabel;
    }

    public HLabel getVolumeLabel() {
        return volumeLabel;
    }

    public void setVolumeLabel(HLabel volumeLabel) {
        this.volumeLabel = volumeLabel;
    }

    public HLabel getAvgVolLabel() {
        return avgVolLabel;
    }

    public void setAvgVolLabel(HLabel avgVolLabel) {
        this.avgVolLabel = avgVolLabel;
    }

    public HLabel getMktCapLabel() {
        return mktCapLabel;
    }

    public void setMktCapLabel(HLabel mktCapLabel) {
        this.mktCapLabel = mktCapLabel;
    }

    public HLabel getPeRatioLabel() {
        return peRatioLabel;
    }

    public void setPeRatioLabel(HLabel peRatioLabel) {
        this.peRatioLabel = peRatioLabel;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    public void setAllLabelText(double open, double high, double low, double _52wkHigh, double _52wkLow, long volume,
                                long avgVolume, long mktCap, double peRatio)
    {

        openLabel.setText(OPEN + open);
        highLabel.setText(HIGH + high);
        lowLabel.setText(LOW + low);
        _52wkHighLabel.setText(_52_WEEK_HIGH + _52wkHigh);
        _52wkLowLabel.setText(_52_WEEK_LOW + _52wkLow);
        volumeLabel.setText(VOLUME + volume);
        avgVolLabel.setText(AVG_VOLUME + avgVolume);
        mktCapLabel.setText(MKT_CAP + mktCap);
        peRatioLabel.setText(P_E_RATIO +  peRatio);

    }

    @Override
    public void generateData() {

        getComponent().setLayout(new BoxLayout(getComponent(), BoxLayout.Y_AXIS));
        openLabel = addHLabel(OPEN);
        highLabel = addHLabel(HIGH);
        lowLabel = addHLabel(LOW);
        _52wkHighLabel = addHLabel(_52_WEEK_HIGH);
        _52wkLowLabel = addHLabel(_52_WEEK_LOW);
        volumeLabel = addHLabel(VOLUME);
        avgVolLabel = addHLabel(AVG_VOLUME);
        mktCapLabel = addHLabel(MKT_CAP);
        peRatioLabel = addHLabel(P_E_RATIO);

    }

    @Override
    public void updateData() {

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/


