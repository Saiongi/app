package ru.datatekh.practice.consoleApp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.datatekh.practice.consoleApp.model.document.*;
import ru.datatekh.practice.consoleApp.model.staff.Departments;
import ru.datatekh.practice.consoleApp.model.staff.Organizations;
import ru.datatekh.practice.consoleApp.model.staff.Person;
import ru.datatekh.practice.consoleApp.model.staff.Persons;
import ru.datatekh.practice.consoleApp.serveces.DocService;
import sun.rmi.runtime.Log;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.script.ScriptEngine.FILENAME;

/**
 * Created by Света on 21.06.2016.
 */

public class TestDoc {

    public static void main(String[] args) throws IOException {
        Persons persons = null;
        Departments departments;
        Organizations organizations;
        File file;
        int p;//переменная для хранения случайного значения
        //считываем сохраняем данные из persons.xml
        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "persons.xml");
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
             persons = (Persons) unmarshaller.unmarshal(file);
            System.out.println(persons);
        } catch (JAXBException ex) {
            Logger.getLogger(TestDoc.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        //считываем и сохраняем данные из departments.xml
        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "departments.xml");
            JAXBContext context = JAXBContext.newInstance(Departments.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            departments = (Departments) unmarshaller.unmarshal(file);
            System.out.println(departments);
        } catch (JAXBException ex) {
            Logger.getLogger(TestDoc.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        //считываем и сохраняем данные из organizations.xml
        try {
            file = new File(System.getProperty("user.dir")
                    + File.separator + "organizations.xml");
            JAXBContext context = JAXBContext.newInstance(Organizations.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            organizations = (Organizations) unmarshaller.unmarshal(file);
            System.out.println(organizations);
        } catch (JAXBException ex) {
            Logger.getLogger(TestDoc.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        //создаем экземпляр DocService
        DocService docService = new DocService();
        //сохраняем сотрудников в DocFieldStorage
        docService.savePersons(persons);
        //доп масссив для случайной генерации одного из документов
        Class[] classDoc = new Class[3];
        classDoc[0] = Task.class;
        classDoc[1] = Outgoing.class;
        classDoc[2] = Incoming.class;
        //создаем TreeSet для хранения документов
        TreeSet<Document> allDoc = new TreeSet<Document>();
        //создаем документы
        for (int i=0; i<30;i++) {
            p = (int) (Math.random() * 3);
            Document doc = docService.createDoc(classDoc[p]);
            if(doc != null){
                allDoc.add(doc);
            }
        }
        //выводим документы в консоль
        for (Document d: allDoc) {
            System.out.println(d.toString());
        }
        Map<Person, TreeSet<Document>> docsByPersonMap = new TreeMap<Person, TreeSet<Document>>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        //сортируем документы по авторам
        for (Document d: allDoc) {
            if (! docsByPersonMap.containsKey(d.getAuthor())){
                docsByPersonMap.put(d.getAuthor(), new TreeSet<Document>());
            }
            docsByPersonMap.get(d.getAuthor()).add(d);
        }
        //генерируем отчеты по каждому автору в json файлы
        GsonBuilder builder = new GsonBuilder();
        Gson gson = new Gson();
        String authorStr;
        String string=null;
        String name1 = "e:\\java\\app\\";
        String name2 = ".json";
        // сортировка документов по автору
        for (Person author : docsByPersonMap.keySet()){
            authorStr = author.getSurname()+" "+author.getName()+" "+author.getSecondName();
            //System.out.println("Document list by " + authorStr);
            for (Document d: docsByPersonMap.get(author)) {
                string = string + gson.toJson(d);
                //System.out.println(dateFormat.format(d.getDateOfRegistration())+ " " + d.getRegisterNumOfDoc());
            }
            try (FileWriter fileWriter = new FileWriter(name1+authorStr+name2)) {
                fileWriter.write(string);
            } catch (IOException ex) {
                Logger.getLogger(TestDoc.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }









}
