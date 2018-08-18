package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/12/2018.
 */
public class Quote {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String calculationPrice;
    private double open;
    private long openTime;
    private double close;
    private long closeTime;
    private double high;
    private double low;
    private double latestPrice;
    private String latestSource;
    private String latestTime;
    private long latestUpdate;
    private long latestVolume;
    private double iexRealtimePrice;
    private int iexRealtimeSize;
    private long iexLastUpdated;
    private double delayedPrice;
    private long delayedPriceTime;
    private double extendedPrice;
    private double extendPriceChange;
    private double extendedChangePercent;
    private long extendedPriceTime;
    private double previousClose;
    private double change;
    private double changePercentage;
    private double iexMarketPercent;
    private long iexVolume;
    private long avgTotalVolume;
    private double iexBidPrice;
    private long iexBidSize;
    private double iexAskPrice;
    private long iexAskSize;
    private long marketCap;
    private double peRatio;
    private double week52High;
    private double week52Low;
    private double ytdChange;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Quote() {
    }

    public Quote(String calculationPrice, double open, long openTime, double close, long closeTime, double high,
                 double low, double latestPrice, String latestSource, String latestTime, long latestUpdate, long latestVolume,
                 double iexRealtimePrice, int iexRealtimeSize, long iexLastUpdated, double delayedPrice, long delayedPriceTime,
                 double extendedPrice, double extendPriceChange, double extendedChangePercent, long extendedPriceTime,
                 double previousClose, double change, double changePercentage, double iexMarketPercent, long iexVolume,
                 long avgTotalVolume, double iexBidPrice, long iexBidSize, double iexAskPrice, long iexAskSize, long marketCap,
                 double peRatio, double week52High, double week52Low, double ytdChange) {


        this.calculationPrice = calculationPrice;
        this.open = open;
        this.openTime = openTime;
        this.close = close;
        this.closeTime = closeTime;
        this.high = high;
        this.low = low;
        this.latestPrice = latestPrice;
        this.latestSource = latestSource;
        this.latestTime = latestTime;
        this.latestUpdate = latestUpdate;
        this.latestVolume = latestVolume;
        this.iexRealtimePrice = iexRealtimePrice;
        this.iexRealtimeSize = iexRealtimeSize;
        this.iexLastUpdated = iexLastUpdated;
        this.delayedPrice = delayedPrice;
        this.delayedPriceTime = delayedPriceTime;
        this.extendedPrice = extendedPrice;
        this.extendPriceChange = extendPriceChange;
        this.extendedChangePercent = extendedChangePercent;
        this.extendedPriceTime = extendedPriceTime;
        this.previousClose = previousClose;
        this.change = change;
        this.changePercentage = changePercentage;
        this.iexMarketPercent = iexMarketPercent;
        this.iexVolume = iexVolume;
        this.avgTotalVolume = avgTotalVolume;
        this.iexBidPrice = iexBidPrice;
        this.iexBidSize = iexBidSize;
        this.iexAskPrice = iexAskPrice;
        this.iexAskSize = iexAskSize;
        this.marketCap = marketCap;
        this.peRatio = peRatio;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.ytdChange = ytdChange;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
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

    public double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public long getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(long latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public long getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(long latestVolume) {
        this.latestVolume = latestVolume;
    }

    public double getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(double iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public int getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(int iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public long getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(long iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public double getDelayedPrice() {
        return delayedPrice;
    }

    public void setDelayedPrice(double delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public long getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(long delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public double getExtendPriceChange() {
        return extendPriceChange;
    }

    public void setExtendPriceChange(double extendPriceChange) {
        this.extendPriceChange = extendPriceChange;
    }

    public double getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public void setExtendedChangePercent(double extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public long getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(long extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
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

    public double getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(double iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public long getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(long iexVolume) {
        this.iexVolume = iexVolume;
    }

    public long getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(long avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public double getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(double iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public long getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(long iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public double getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(double iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public long getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(long iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(double peRatio) {
        this.peRatio = peRatio;
    }

    public double getWeek52High() {
        return week52High;
    }

    public void setWeek52High(double week52High) {
        this.week52High = week52High;
    }

    public double getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(double week52Low) {
        this.week52Low = week52Low;
    }

    public double getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(double ytdChange) {
        this.ytdChange = ytdChange;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/
