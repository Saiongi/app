package ru.datatekh.practice.consoleApp.model.staff;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

/**
 * Created by Света on 26.06.2016.
 */
@XmlType(name = "department")
public class Department extends Staff {
    private String departName;//полное наименование;
    private String shortName;//краткое наименование;
    private String boss;//руководитель;
    private ArrayList<Integer> telNumbers; //контактные телефоны;

    // Геттер departName
    public String getDepartName(){
        return this.departName;
    }
    // Сеттер departName
    @XmlElement
    public void setDepartName(String departName){
        this.departName=departName;
    }

    public String getShortName(){
        return this.shortName;
    }
    @XmlElement
    public void setShortName(String shortName){
       this.shortName=shortName;
    }

    public String getBoss(){
        return this.boss;
    }
    @XmlElement
    public void setBoss(String boss){
        this.boss=boss;
    }
    public ArrayList<Integer> getTelNumbers(){
        return this.telNumbers;
    }
    @XmlElement(name = "telNumbers")
    @XmlElementWrapper
    public void setTelNumbers(ArrayList<Integer> telNumbers){
        this.telNumbers=telNumbers;
    }

    public Department createDep(int id,String departName,String shortName, String boss,
                                  ArrayList<Integer> orgTelNumbers ) {
        Department department = new Department();
        department.setId(id);
        department.setDepartName(departName);
        department.setShortName(shortName);
        department.setBoss(boss);
        department.setTelNumbers(orgTelNumbers);
        return department;

    }
}
