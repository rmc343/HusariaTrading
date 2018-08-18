package com.husaria.application.tradable.position;

/**
 * Created by Owner on 8/12/2018.
 */
public class News {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String dateTime;
    private String headline;
    private String source;
    private String url;
    private String summary;
    private String related;
    private String image;

    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public News() {
    }

    public News(String dateTime, String headline, String source, String url, String summary, String related,
                String image) {

        this.dateTime = dateTime;
        this.headline = headline;
        this.source = source;
        this.url = url;
        this.summary = summary;
        this.related = related;
        this.image = image;

    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

