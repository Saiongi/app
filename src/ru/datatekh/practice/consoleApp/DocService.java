package ru.datatekh.practice.consoleApp;

import java.util.HashSet;

/**
 * Created by Света on 22.06.2016.
 */
public class DocService {

    DocumentFactory documentFactory;
    DocFieldsStorage docFieldsStorage;

    String[] regNums;

    int globalIterator;

    HashSet<String> regNumbers = new HashSet<String>();

    public DocService(){
        documentFactory = new DocumentFactory();

        docFieldsStorage = new DocFieldsStorage();
    }

    public void regDoc(Document doc) throws DocumentExistsException{

        String regNom = docFieldsStorage.getRegisterNumOfDoc();
        if (regNumbers.contains(regNom)){

            throw new DocumentExistsException("Exception! Document with this number already exists!");

        } else{

            doc.setRegisterNumOfDoc(regNom);//добавляем документу рег номер
            regNumbers.add(regNom);// добавляем рег номер в коллекцию уже существующих рег номеров
            doc.setDateOfRegistration(docFieldsStorage.getDate());//задаем дату

        }
    }

    public Document createDoc(String type){
        Document doc = documentFactory.createDocument(type);
        docFieldsStorage.saveDocField(doc);



        try {
            regDoc(doc);
            return doc;
        } catch (DocumentExistsException e) {
            e.printStackTrace();
        }
        return null;

    }

}