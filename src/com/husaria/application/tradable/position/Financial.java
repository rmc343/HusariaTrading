package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/11/2018.
 */
public class Financial {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String reportDate;
    private int grossProfit;
    private int costOfRevenue;
    private int operatingRevenue;
    private int totalRevenue;
    private int operatingIncome;
    private int netIncome;
    private int researchAndDevelopment;
    private int operatingExpense;
    private int currentAssets;
    private int totalAssets;
    private int totalLiabilities;
    private int currentCash;
    private int currentDebt;
    private int totalCash;
    private int totalDebt;
    private int shareholderEquity;
    private int cashChange;
    private int cashFlow;
    private String operatingGainsLosses;



    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Financial() {
    }

    public Financial(String reportDate, int grossProfit, int costOfRevenue, int operatingRevenue, int totalRevenue,
                     int operatingIncome, int netIncome, int researchAndDevelopment, int operatingExpense, int currentAssets,
                     int totalAssets, int totalLiabilities, int currentCash, int currentDebt, int totalCash, int totalDebt,
                     int shareholderEquity, int cashChange, int cashFlow, String operatingGainsLosses) {

        this.reportDate = reportDate;
        this.grossProfit = grossProfit;
        this.costOfRevenue = costOfRevenue;
        this.operatingRevenue = operatingRevenue;
        this.totalRevenue = totalRevenue;
        this.operatingIncome = operatingIncome;
        this.netIncome = netIncome;
        this.researchAndDevelopment = researchAndDevelopment;
        this.operatingExpense = operatingExpense;
        this.currentAssets = currentAssets;
        this.totalAssets = totalAssets;
        this.totalLiabilities = totalLiabilities;
        this.currentCash = currentCash;
        this.currentDebt = currentDebt;
        this.totalCash = totalCash;
        this.totalDebt = totalDebt;
        this.shareholderEquity = shareholderEquity;
        this.cashChange = cashChange;
        this.cashFlow = cashFlow;
        this.operatingGainsLosses = operatingGainsLosses;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public int getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(int grossProfit) {
        this.grossProfit = grossProfit;
    }

    public int getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(int costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public int getOperatingRevenue() {
        return operatingRevenue;
    }

    public void setOperatingRevenue(int operatingRevenue) {
        this.operatingRevenue = operatingRevenue;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(int operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public int getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }

    public int getResearchAndDevelopment() {
        return researchAndDevelopment;
    }

    public void setResearchAndDevelopment(int researchAndDevelopment) {
        this.researchAndDevelopment = researchAndDevelopment;
    }

    public int getOperatingExpense() {
        return operatingExpense;
    }

    public void setOperatingExpense(int operatingExpense) {
        this.operatingExpense = operatingExpense;
    }

    public int getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(int currentAssets) {
        this.currentAssets = currentAssets;
    }

    public int getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(int totalAssets) {
        this.totalAssets = totalAssets;
    }

    public int getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(int totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public int getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(int currentCash) {
        this.currentCash = currentCash;
    }

    public int getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(int currentDebt) {
        this.currentDebt = currentDebt;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }

    public int getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(int totalDebt) {
        this.totalDebt = totalDebt;
    }

    public int getShareholderEquity() {
        return shareholderEquity;
    }

    public void setShareholderEquity(int shareholderEquity) {
        this.shareholderEquity = shareholderEquity;
    }

    public int getCashChange() {
        return cashChange;
    }

    public void setCashChange(int cashChange) {
        this.cashChange = cashChange;
    }

    public int getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(int cashFlow) {
        this.cashFlow = cashFlow;
    }

    public String getOperatingGainsLosses() {
        return operatingGainsLosses;
    }

    public void setOperatingGainsLosses(String operatingGainsLosses) {
        this.operatingGainsLosses = operatingGainsLosses;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/
