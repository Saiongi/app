package ru.datatekh.practice.consoleApp;

/**
 * Created by Света on 22.06.2016.
 */
import java.util.*;

public class DocumentFactory implements BaseDocumentFactory {

    @Override
    public Document createDocument(String type) {

        if ("Task".equals(type)) {
                return createTask();
        } else if ("Incoming".equals(type)) {
            return createIncoming();
        } else if ("Outgoing".equals(type)) {
            return createOutgoing();
        }
        return null;

    }
    public Task createTask(){
        Task task=new Task();
        return task;
    }
    public Incoming createIncoming() {
        Incoming incoming=new Incoming();
        return incoming;
    }
    public Outgoing createOutgoing() {
        Outgoing outgoing=new Outgoing();
        return outgoing;
    }

}

