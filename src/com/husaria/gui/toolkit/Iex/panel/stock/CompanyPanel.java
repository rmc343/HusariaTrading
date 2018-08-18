package com.husaria.gui.toolkit.Iex.panel.stock;

import com.husaria.application.tradable.position.Company;
import com.husaria.gui.toolkit.HLabel;
import com.husaria.gui.toolkit.HTextArea;
import com.husaria.gui.toolkit.Iex.IexPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Owner on 8/18/2018.
 */
public class CompanyPanel extends IexPanel {

    public static final String COMPANY_NAME = "Company Name: ";
    public static final String EXCHANGE = "Exchange: ";
    public static final String INDUSTRY = "Industry: ";
    public static final String WEBSITE = "Website: ";
    public static final String CEO = "CEO:";
    public static final String ISSUE_TYPE = "Issue Type: ";
    public static final String SECTOR = "Sector: ";


    //==================================================================================================================
    // Instance Variable(s)
    //==================================================================================================================

    private HLabel companyNameLabel, exChangeLabel,industryLabel, websiteLabel, ceoLabel, issueTypeLabel, sectorLabel;
    private HTextArea descriptionTextArea;


    //==================================================================================================================
    // Constructor(s)
    //==================================================================================================================

    public CompanyPanel(Company company) {


        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        companyNameLabel = new HLabel(COMPANY_NAME + company.getCompanyName());
        exChangeLabel = new HLabel(EXCHANGE + company.getExchange());
        industryLabel = new HLabel(INDUSTRY + company.getIndustry());
        websiteLabel = new HLabel(WEBSITE + company.getWebsite());
        ceoLabel = new HLabel(CEO +company.getCeo());
        issueTypeLabel = new HLabel(ISSUE_TYPE + company.getIssueType());
        sectorLabel = new HLabel(SECTOR + company.getSector());

        descriptionTextArea = new HTextArea(company.getDescription());

        add(companyNameLabel, BorderLayout.CENTER);
        add(exChangeLabel,BorderLayout.CENTER);
        add(industryLabel,BorderLayout.CENTER);
        add(websiteLabel,BorderLayout.CENTER);
        add(ceoLabel,BorderLayout.CENTER);
        add(issueTypeLabel,BorderLayout.CENTER);
        add(sectorLabel,BorderLayout.CENTER);
        add(descriptionTextArea,BorderLayout.CENTER);

    }


    //==================================================================================================================
    // Getter(s)& Setter(s)
    //==================================================================================================================

    public HLabel getCompanyNameLabel() {
        return companyNameLabel;
    }

    public void setCompanyNameLabel(HLabel companyNameLabel) {
        this.companyNameLabel = companyNameLabel;
    }

    public HLabel getExChangeLabel() {
        return exChangeLabel;
    }

    public void setExChangeLabel(HLabel exChangeLabel) {
        this.exChangeLabel = exChangeLabel;
    }

    public HLabel getIndustryLabel() {
        return industryLabel;
    }

    public void setIndustryLabel(HLabel industryLabel) {
        this.industryLabel = industryLabel;
    }

    public HLabel getWebsiteLabel() {
        return websiteLabel;
    }

    public void setWebsiteLabel(HLabel websiteLabel) {
        this.websiteLabel = websiteLabel;
    }

    public HLabel getCeoLabel() {
        return ceoLabel;
    }

    public void setCeoLabel(HLabel ceoLabel) {
        this.ceoLabel = ceoLabel;
    }

    public HLabel getIssueTypeLabel() {
        return issueTypeLabel;
    }

    public void setIssueTypeLabel(HLabel issueTypeLabel) {
        this.issueTypeLabel = issueTypeLabel;
    }

    public JLabel getSectorLabel() {
        return sectorLabel;
    }

    public void setSectorLabel(HLabel sectorLabel) {
        this.sectorLabel = sectorLabel;
    }

    public HTextArea getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(HTextArea descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }


    //==================================================================================================================
    // Public Functions(s)
    //==================================================================================================================


    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================

    private void addHLabel(String text, HLabel label){

        label = new HLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label);


    }


}//****************************************************END OF FILE*****************************************************/


