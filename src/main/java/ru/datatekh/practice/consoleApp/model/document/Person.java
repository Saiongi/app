package ru.datatekh.practice.consoleApp.model.document;

/**
 * Created by Света on 26.06.2016.
 */
public class Person extends Staff {
    private String surname;   //поле фамилия;
    private String  name;     //поле имя;
    private String secondName;//поле отчество;
    private String position; // поле должность.

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname=name;
    }
    public String getName(){
        return this.surname;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public void setSecondName(String secondName){
        this.secondName=secondName;
    }

}
