package ru.datatekh.practice.consoleApp.model.document;

/**
 * Created by Света on 22.06.2016.
 */
public class DocumentExistsException extends Exception {


   public DocumentExistsException(String msgText){
        super(msgText);
    }

}
