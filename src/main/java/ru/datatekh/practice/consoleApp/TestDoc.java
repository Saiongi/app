package ru.datatekh.practice.consoleApp;

import ru.datatekh.practice.consoleApp.model.document.Document;
import ru.datatekh.practice.consoleApp.model.document.Incoming;
import ru.datatekh.practice.consoleApp.model.document.Outgoing;
import ru.datatekh.practice.consoleApp.model.document.Task;
import ru.datatekh.practice.consoleApp.serveces.DocService;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Света on 21.06.2016.
 */

public class TestDoc {


    public static void main(String[] args){

        // factory method
//        String [] typeDoc = new String[3];
//        typeDoc[0]="Task";
//        typeDoc[1]="Outgoing";
//        typeDoc[2]="Incoming";

        Class[] classDoc = new Class[3];
        classDoc[0] = Task.class;
        classDoc[1] = Outgoing.class;
        classDoc[2] = Incoming.class;

        DocService docService = new DocService();

        TreeSet<Document> allDoc = new TreeSet<Document>();
        int p;
        Document docum;
        for (int i=0; i<30;i++) {
            p = (int) (Math.random() * 3);
            //Document doc = docService.createDoc(typeDoc[p]);
            Document doc = docService.createDoc(classDoc[p]);

            if(doc != null){
                allDoc.add(doc);
            }
        }

        Map<String, TreeSet<Document>> docsByPersonMap = new TreeMap<String, TreeSet<Document>>();
        for (Document d: allDoc) {
            System.out.println(d.toString());
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        for (Document d: allDoc) {
            if (! docsByPersonMap.containsKey(d.getAuthor())){
                docsByPersonMap.put(d.getAuthor(), new TreeSet<Document>());
            }
            docsByPersonMap.get(d.getAuthor()).add(d);

            System.out.println(d.getAuthor() + " " + dateFormat.format(d.getDateOfRegistration())
                    + " " + d.getRegisterNumOfDoc());

        }


        for (String author : docsByPersonMap.keySet()){
            System.out.println("Document list by " + author);
            for (Document d: docsByPersonMap.get(author)) {
                System.out.println(dateFormat.format(d.getDateOfRegistration())
                        + " " + d.getRegisterNumOfDoc());

            }
        }


    }




}
