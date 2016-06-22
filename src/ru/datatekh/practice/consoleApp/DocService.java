package ru.datatekh.practice.consoleApp;

import java.util.Calendar;

import java.util.HashSet;

/**
 * Created by Света on 22.06.2016.
 */
public class DocService {

    DocumentFactory documentFactory;

    public DocService(){
        documentFactory = new DocumentFactory();
    }

    public void regDoc(Document doc) throws DocumentExistsException{

        HashSet<String> regNumbers = new HashSet<String>();


        String regNom = "ном"+String.valueOf(Math.random()*100);

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
        return documentFactory.createDocument(type);
    }

}