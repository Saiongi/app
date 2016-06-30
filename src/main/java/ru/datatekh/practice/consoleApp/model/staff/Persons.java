package ru.datatekh.practice.consoleApp.model.staff;

/**
 * Created by Света on 27.06.2016.
 */
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "Persons")
@XmlRootElement
public class Persons {
    @XmlElementWrapper(name="person", nillable = true)
    public List<Person> persons = new ArrayList<Person>();

}
