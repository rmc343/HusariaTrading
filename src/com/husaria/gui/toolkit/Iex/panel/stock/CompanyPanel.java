package com.husaria.gui.toolkit.Iex.panel.stock;

import com.husaria.application.tradable.position.Company;
import com.husaria.gui.toolkit.HLabel;
import com.husaria.gui.toolkit.HPanel;
import com.husaria.gui.toolkit.HTextArea;
import com.husaria.gui.toolkit.Iex.IexPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Owner on 8/18/2018.
 */
public class CompanyPanel extends HPanel {

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

    public CompanyPanel() {

        generateData();

        //descriptionTextArea = new HTextArea(company.getDescription());

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

    public HLabel getSectorLabel() {
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

    public void setAllLabelText(String companyName, String exchange, String industry, String website, String ceo, String issueType, String sector)
    {

        companyNameLabel.setText(COMPANY_NAME + companyName);
        exChangeLabel.setText(EXCHANGE + exchange);
        industryLabel.setText(INDUSTRY + industry);
        websiteLabel.setText(WEBSITE + website);
        ceoLabel.setText(CEO + ceo);
        issueTypeLabel.setText(ISSUE_TYPE + issueType);
        sectorLabel.setText(SECTOR + sector);

    }

    public void generateData()
    {

        getComponent().setLayout(new BoxLayout(getComponent(), BoxLayout.Y_AXIS));
        companyNameLabel = addHLabel(COMPANY_NAME);
        exChangeLabel = addHLabel(EXCHANGE);
        industryLabel = addHLabel(INDUSTRY);
        websiteLabel = addHLabel(WEBSITE);
        ceoLabel = addHLabel(CEO);
        issueTypeLabel = addHLabel(ISSUE_TYPE);
        sectorLabel = addHLabel(SECTOR);

        //descriptionTextArea = new HTextArea(company.getDescription());
    }


    @Override
    public void updateData() {

    }

    //==================================================================================================================
    // Private Functions(s)
    //==================================================================================================================



}//****************************************************END OF FILE*****************************************************/


