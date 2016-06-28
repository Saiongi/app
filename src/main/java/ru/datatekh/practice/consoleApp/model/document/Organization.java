package ru.datatekh.practice.consoleApp.model.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

/**
 * Created by Света on 26.06.2016.
 */
@XmlType(name = "organization")
public class Organization extends Staff  {
    private String orgName;//полное наименование;
    private String shortName;//краткое наименование;
    private String orgBoss;//руководитель;
    private ArrayList<Integer> orgTelNumbers; //контактные телефоны;

    public String getOrgName(){
        return this.orgName;
    }
    @XmlElement
    public void setOrgName(String orgName){
        this.orgName=orgName;
    }
    public String getShortName(){
        return this.shortName;
    }
    @XmlElement
    public void setShortName(String shortName){
        this.shortName=shortName;
    }
    public String getOrgBoss(){
        return this.orgBoss;
    }
    @XmlElement
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
