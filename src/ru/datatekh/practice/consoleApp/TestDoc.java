package ru.datatekh.practice.consoleApp;

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


        Document[] allDoc = new Document[20];
        int p;
        for (int i=0; i<20;i++) {
            p = (int) (Math.random() * 3);
            allDoc[i] = docService.createDoc(typeDoc[p]);
            //allDoc[i] = docs.createDocument(typeDoc[p]);
            p = 0;
        }
        for (Document d: allDoc) System.out.println(d.getClass());
    }




}
