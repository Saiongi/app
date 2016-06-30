package ru.datatekh.practice.consoleApp;

import ru.datatekh.practice.consoleApp.model.document.Persons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Света on 28.06.2016.
 */
public class TestMarshal {

    public static void main(String[] args) {

      /*
        try {
            File file = new File(System.getProperty("user.dir")
                    + File.separator + "persons.xml");
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Persons persons = (Persons) unmarshaller.unmarshal(file);
            System.out.println(persons);
        } catch (JAXBException ex) {
            Logger.getLogger(TestMarshal.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    */
    }



}
