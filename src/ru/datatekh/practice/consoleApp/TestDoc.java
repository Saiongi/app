package ru.datatekh.practice.consoleApp;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Света on 21.06.2016.
 */

public class TestDoc {

    public static void main(String[] args){

// factory method
        String [] typeDoc = new String[3];
        typeDoc[0]="Task";
        typeDoc[1]="Outgoing";
        typeDoc[2]="Incoming";

        //BaseDocumentFactory docs = new DocumentFactory();

        DocService docService = new DocService();


        HashSet<Document> allDoc = new HashSet<Document>();
        int p;
        for (int i=0; i<10;i++) {
            p = (int) (Math.random() * 3);
            Document doc= docService.createDoc(typeDoc[p]);
            if(doc!=null){
                allDoc.add(doc);

            }
            //allDoc[i] = docs.createDocument(typeDoc[p]);
            p = 0;
        }
        for (Document d: allDoc) System.out.println(d.getClass());
    }




}
