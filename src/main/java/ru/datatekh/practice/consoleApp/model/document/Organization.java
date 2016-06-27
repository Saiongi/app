package ru.datatekh.practice.consoleApp.model.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

/**
 * Created by Света on 26.06.2016.
 */
@XmlType(propOrder = { "orgName", "shortName", "orgBoss","orgTelNumbers" }, name = "organisation")
public class Organization {
    private String orgName;//полное наименование;
    private String shortName;//краткое наименование;
    private String orgBoss;//руководитель;
    private ArrayList<Integer> orgTelNumbers; //контактные телефоны;

    public String getOrgName(){
        return this.orgName;
    }
    public void setOrgName(String orgName){
        this.orgName=orgName;
    }
    public String getShortName(){
        return this.shortName;
    }
    public void setShortName(String shortName){
        this.shortName=shortName;
    }
    public String getOrgBoss(){
        return this.orgBoss;
    }
    public void setOrgBoss(String orgBoss){
        this.orgBoss = orgBoss;
    }
    public ArrayList<Integer> getOrgTelNumbers(){
        return this.orgTelNumbers;
    }
    @XmlElement(name = "orgTelNumbers")
    @XmlElementWrapper
    public void setOrgTelNumbers(ArrayList<Integer> orgTelNumbers){
        this.orgTelNumbers = orgTelNumbers;
    }
}
