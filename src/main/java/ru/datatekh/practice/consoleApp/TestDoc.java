package ru.datatekh.practice.consoleApp;

import ru.datatekh.practice.consoleApp.model.document.*;
import ru.datatekh.practice.consoleApp.serveces.DocService;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Света on 21.06.2016.
 */

public class TestDoc {

    public static void main(String[] args){
        Persons persons = null;
        Departments departments;
        Organizations organizations;
        File file;
        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "persons.xml");
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
             persons = (Persons) unmarshaller.unmarshal(file);
            System.out.println(persons);
        } catch (JAXBException ex) {
            Logger.getLogger(TestMarshal.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "departments.xml");
            JAXBContext context = JAXBContext.newInstance(Departments.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            departments = (Departments) unmarshaller.unmarshal(file);
            System.out.println(departments);
        } catch (JAXBException ex) {
            Logger.getLogger(TestMarshal.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "organizations.xml");
            JAXBContext context = JAXBContext.newInstance(Organizations.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            organizations = (Organizations) unmarshaller.unmarshal(file);
            System.out.println(organizations);
        } catch (JAXBException ex) {
            Logger.getLogger(TestMarshal.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        //создаем экземпляр DocService
        DocService docService = new DocService();
        docService.savePersons(persons);




        Class[] classDoc = new Class[3];
        classDoc[0] = Task.class;
        classDoc[1] = Outgoing.class;
        classDoc[2] = Incoming.class;



        TreeSet<Document> allDoc = new TreeSet<Document>();
        int p;
        for (int i=0; i<30;i++) {
            p = (int) (Math.random() * 3);
            Document doc = docService.createDoc(classDoc[p]);
            if(doc != null){
                allDoc.add(doc);
            }
        }
        for (Document d: allDoc) {
            System.out.println(d.toString());
        }
        Map<Person, TreeSet<Document>> docsByPersonMap = new TreeMap<Person, TreeSet<Document>>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        for (Document d: allDoc) {
            if (! docsByPersonMap.containsKey(d.getAuthor())){
                docsByPersonMap.put(d.getAuthor(), new TreeSet<Document>());
            }
            docsByPersonMap.get(d.getAuthor()).add(d);
        }

        for (Person author : docsByPersonMap.keySet()){
            System.out.println("Document list by " + author);
            for (Document d: docsByPersonMap.get(author)) {
                System.out.println(dateFormat.format(d.getDateOfRegistration())
                        + " " + d.getRegisterNumOfDoc());

            }




        }




    }









}
