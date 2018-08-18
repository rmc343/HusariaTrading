package com.husaria.application.tradable.position;

import com.husaria.toolkit.IPrintable;

import java.util.ArrayList;

/**
 * Created by Owner on 8/11/2018.
 */
public class Company implements IPrintable {

    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private String companyName;
    private String exchange;
    private String industry;
    private String website;
    private String description;
    private String CEO;
    private String issueType;
    private String sector;
    private ArrayList<String> tags;


    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public Company() {
        tags = new ArrayList<>();
    }

    public Company(String companyName, String exchange, String industry, String website, String description, String ceo, String issueType, String sector, ArrayList<String> tags) {
        this.companyName = companyName;
        this.exchange = exchange;
        this.industry = industry;
        this.website = website;
        this.description = description;
        this.CEO = ceo;
        this.issueType = issueType;
        this.sector = sector;
        this.tags = tags;
    }

    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCeo() {
        return CEO;
    }

    public void setCeo(String ceo) {
        this.CEO = ceo;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTag(int i) {
        if(i < tags.size() && tags != null) {
            return tags.get(i);
        }else {
            return "";
        }
    }

    public void setTag(String tag) {
        tags.add(tag);
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================

    @Override
    public String print() {

        String result = "";

        result += "Company Name: " + companyName + "\r\n";
        result += "Exchange: " + exchange+ "\r\n";
        result += "Industry: " + industry+ "\r\n";
        result += "Website: " + website+ "\r\n";
        result += "Description: " + description+ "\r\n";
        result += "CEO: " + CEO+ "\r\n";
        result += "Issue Type: " + issueType+ "\r\n";
        result += "Sector: " + sector+ "\r\n";
        result += "Tags: ";

        for(int i  = 0; i < tags.size(); i++)
        {

            result +=  tags.get(i);

            if(i + 1 != tags.size()){
                result += ", ";
            }

        }
        return result;
    }

    @Override
    public String printPretty() {

        return print();

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================





}//****************************************************END OF FILE*****************************************************/

