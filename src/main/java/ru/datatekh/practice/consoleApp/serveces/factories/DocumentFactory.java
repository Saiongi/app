package ru.datatekh.practice.consoleApp.serveces.factories;

/**
 * Created by Света on 22.06.2016.
 */
import ru.datatekh.practice.consoleApp.model.document.Document;
import ru.datatekh.practice.consoleApp.model.document.Incoming;
import ru.datatekh.practice.consoleApp.model.document.Outgoing;
import ru.datatekh.practice.consoleApp.model.document.Task;

import java.lang.reflect.InvocationTargetException;

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

    public Document createDocument(Class aClass) {
        try {
            return (Document)aClass.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}

