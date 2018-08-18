package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/11/2018.
 */
public class Earnings {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private double actualEPS;
    private double consensusEPS;
    private double estimatedEPS;
    private String announceTime;
    private int numberOfEstimates;
    private double EPSSurpriseDollar;
    private String EPSReportDate;
    private String fiscalPeriod;
    private String fiscalEndDate;
    private double yearAgo;
    private double yearAgoChangePercent;
    private double estimatedChangePercent;
    private String symbolId;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Earnings() {
    }

    public Earnings(double actualEPS, double consensusEPS, double estimatedEPS, String announceTime, int numberOfEstimates,
                    double EPSSurpriseDollar, String EPSReportDate, String fiscalPeriod, String fiscalEndDate,
                    double yearAgo, double yearAgoChangePercent, double estimatedChangePercent, String symbolId) {

        this.actualEPS = actualEPS;
        this.consensusEPS = consensusEPS;
        this.estimatedEPS = estimatedEPS;
        this.announceTime = announceTime;
        this.numberOfEstimates = numberOfEstimates;
        this.EPSSurpriseDollar = EPSSurpriseDollar;
        this.EPSReportDate = EPSReportDate;
        this.fiscalPeriod = fiscalPeriod;
        this.fiscalEndDate = fiscalEndDate;
        this.yearAgo = yearAgo;
        this.yearAgoChangePercent = yearAgoChangePercent;
        this.estimatedChangePercent = estimatedChangePercent;
        this.symbolId = symbolId;
    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public double getActualEPS() {
        return actualEPS;
    }

    public void setActualEPS(double actualEPS) {
        this.actualEPS = actualEPS;
    }

    public double getConsensusEPS() {
        return consensusEPS;
    }

    public void setConsensusEPS(double consensusEPS) {
        this.consensusEPS = consensusEPS;
    }

    public double getEstimatedEPS() {
        return estimatedEPS;
    }

    public void setEstimatedEPS(double estimatedEPS) {
        this.estimatedEPS = estimatedEPS;
    }

    public String getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(String announceTime) {
        this.announceTime = announceTime;
    }

    public int getNumberOfEstimates() {
        return numberOfEstimates;
    }

    public void setNumberOfEstimates(int numberOfEstimates) {
        this.numberOfEstimates = numberOfEstimates;
    }

    public double getEPSSurpriseDollar() {
        return EPSSurpriseDollar;
    }

    public void setEPSSurpriseDollar(double EPSSurpriseDollar) {
        this.EPSSurpriseDollar = EPSSurpriseDollar;
    }

    public String getEPSReportDate() {
        return EPSReportDate;
    }

    public void setEPSReportDate(String EPSReportDate) {
        this.EPSReportDate = EPSReportDate;
    }

    public String getFiscalPeriod() {
        return fiscalPeriod;
    }

    public void setFiscalPeriod(String fiscalPeriod) {
        this.fiscalPeriod = fiscalPeriod;
    }

    public String getFiscalEndDate() {
        return fiscalEndDate;
    }

    public void setFiscalEndDate(String fiscalEndDate) {
        this.fiscalEndDate = fiscalEndDate;
    }

    public double getYearAgo() {
        return yearAgo;
    }

    public void setYearAgo(double yearAgo) {
        this.yearAgo = yearAgo;
    }

    public double getYearAgoChangePercent() {
        return yearAgoChangePercent;
    }

    public void setYearAgoChangePercent(double yearAgoChangePercent) {
        this.yearAgoChangePercent = yearAgoChangePercent;
    }

    public double getEstimatedChangePercent() {
        return estimatedChangePercent;
    }

    public void setEstimatedChangePercent(double estimatedChangePercent) {
        this.estimatedChangePercent = estimatedChangePercent;
    }

    public String getSymbolId() {
        return symbolId;
    }

    public void setSymbolId(String symbolId) {
        this.symbolId = symbolId;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/
