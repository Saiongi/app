package ru.datatekh.practice.consoleApp.model.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.text.ParseException;

/**
 * Created by Света on 26.06.2016.
 */

@XmlType(name = "person")
public class Person extends Staff {

    private String surname;   //поле фамилия;
    private String  name;     //поле имя;
    private String secondName;//поле отчество;
    private String position; // поле должность.

    public String getSurname(){
        return this.surname;
    }
    @XmlElement
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getName(){
        return this.name;
    }
    @XmlElement
    public void setName(String name){
        this.name=name;
    }
    public String getSecondName(){
        return this.secondName;
    }
    @XmlElement
    public void setSecondName(String secondName){
        this.secondName=secondName;
    }
    public String getPosition(){
        return this.position;
    }
    @XmlElement
    public void setPosition(String position){
        this.position=position;
    }


}
