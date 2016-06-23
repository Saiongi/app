package ru.datatekh.practice.consoleApp;

import java.util.Calendar;

import java.util.HashSet;

/**
 * Created by Света on 22.06.2016.
 */
public class DocService {

    DocumentFactory documentFactory;

    String[] regNums;

    int globalIterator;

    HashSet<String> regNumbers = new HashSet<String>();

    public DocService(){
        documentFactory = new DocumentFactory();
        regNums = new String[10];
        for (int i=0;i<10;i++) regNums[i]="ном"+String.valueOf((int)(Math.random()*5));
        globalIterator = 0;

    }

    public void regDoc(Document doc) throws DocumentExistsException{




       // String regNom = "ном"+String.valueOf(Math.random()*10);
            String regNom = regNums[globalIterator];
            globalIterator++;
        if (regNumbers.contains(regNom)){

            throw new DocumentExistsException("Exception! Document with this number already exists!");

        } else{

            doc.setRegisterNumOfDoc(regNom);
            regNumbers.add(regNom);

            //задаем дату

            Calendar cal = Calendar.getInstance();
            cal.set(2014, 01, 10);

            doc.setDateOfRegistration(cal.getTime());
        }
    }

    public Document createDoc(String type){
       Document doc = documentFactory.createDocument(type);

            fillDoc();


        try {
            regDoc(doc);
            return doc;
        } catch (DocumentExistsException e) {
            e.printStackTrace();
        }
        return null;

    }

}