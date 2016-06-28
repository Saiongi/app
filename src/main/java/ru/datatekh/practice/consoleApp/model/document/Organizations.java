package ru.datatekh.practice.consoleApp.model.document;

/**
 * Created by Света on 28.06.2016.
 */
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlType(name = "Organizations")
@XmlRootElement
public class Organizations {
    @XmlElementWrapper(name="organization", nillable = true)
    public List<Organization> organization = new ArrayList<Organization>();
}
