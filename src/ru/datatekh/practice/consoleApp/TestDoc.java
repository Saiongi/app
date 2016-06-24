package ru.datatekh.practice.consoleApp;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

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



        DocService docService = new DocService();


        TreeSet<Document> allDoc = new TreeSet<Document>();
        int p;
        Document docum;
        for (int i=0; i<30;i++) {
            p = (int) (Math.random() * 3);
            Document doc = docService.createDoc(typeDoc[p]);
            if(doc != null){
                allDoc.add(doc);
            }
        }
      //  for (Document d: allDoc) System.out.println(d);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        for (Document d: allDoc) {
            System.out.println(d.getAuthor() + " " + dateFormat.format(d.getDateOfRegistration())
                    + " " + d.getRegisterNumOfDoc());

        }

 /*       Iterator iter = allDoc.iterator();

        while (iter.hasNext()) {
         docum = (Document)iter.next();
            (Document)iter.previous();
            System.out.println(docum.getAuthor());
            if (docum){
                System.out.println(docum.getAuthor());
            }
        }
*/


    }




}
