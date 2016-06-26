package ru.datatekh.practice.consoleApp.model.document;

import java.util.ArrayList;

/**
 * Created by Света on 26.06.2016.
 */
public class Department extends Staff {
    private String departName;//полное наименование;
    private String shortName;//краткое наименование;
    private String boss;//руководитель;
    private ArrayList<Integer> telNumbers; //контактные телефоны;//контактные телефоны.

    public String getDepartName(){
        return this.departName;
    }
    public void setDepartName(String departName){
        this.departName=departName;
    }

    public String getShortName(){
        return this.shortName;
    }
    public void setShortName(String shortName){
       this.shortName=shortName;
    }

    public String getBoss(){
        return this.boss;
    }
    public void setBoss(String boss){
        this.boss=boss;
    }
    public ArrayList<Integer> getTelNumbers(){
        return this.telNumbers;
    }
    public void setTelNumbers(ArrayList<Integer> telNumbers){
        this.telNumbers=telNumbers;
    }
}
