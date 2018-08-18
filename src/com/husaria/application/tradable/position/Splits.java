package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/11/2018.
 */
public class Splits {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String exDate;
    private String declaredDate;
    private String recordDate;
    private String paymentDate;
    private double ratio;
    private String toFactor;
    private String forFactor;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Splits() {
    }

    public Splits(String exDate, String declaredDate, String recordDate, String paymentDate, double ratio, String toFactor,
                  String forFactor) {
        this.exDate = exDate;
        this.declaredDate = declaredDate;
        this.recordDate = recordDate;
        this.paymentDate = paymentDate;
        this.ratio = ratio;
        this.toFactor = toFactor;
        this.forFactor = forFactor;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getDeclaredDate() {
        return declaredDate;
    }

    public void setDeclaredDate(String declaredDate) {
        this.declaredDate = declaredDate;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public String getToFactor() {
        return toFactor;
    }

    public void setToFactor(String toFactor) {
        this.toFactor = toFactor;
    }

    public String getForFactor() {
        return forFactor;
    }

    public void setForFactor(String forFactor) {
        this.forFactor = forFactor;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

