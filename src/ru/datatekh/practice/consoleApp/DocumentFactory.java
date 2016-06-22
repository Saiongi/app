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

        task.setId(1);
        task.setNameDoc("имя документа");
        task.setText("текст поручения");
        task.setAuthor("Батырханов");

        //задаем дату  выдачи поручения
            Calendar cal = Calendar.getInstance();
            cal.set(2014, 00, 11);
        task.setData(cal.getTime());

            cal.set(2014, 00, 12);
        task.setPeriod(cal.getTime());
        task.setExecutor("Овсянкин");
        task.setControl(true);
        task.setControllerName("Булкин");

        return task;
    }

    public Incoming createIncoming() {
        Incoming incoming=new Incoming();

        incoming.setId(1);
        incoming.setNameDoc("имя входящего документа");
        incoming.setText("текст входящего документа");
        incoming.setAuthor("Барышников");

        incoming.setSender("Бубликов");
        incoming.setDestination("Пирожков");
        incoming.setIncomeNumber(13);
        //задаем дату  исходящей  регистрации
        Calendar cal = Calendar.getInstance();
        cal.set(2014, 01, 11);
        incoming.setIncomeDateOfRegistration(cal.getTime());

        return incoming;
    }

    public Outgoing createOutgoing() {
        Outgoing outgoing=new Outgoing();

        outgoing.setId(1);
        outgoing.setNameDoc("имя исходящего документа");
        outgoing.setText("текст исходящего документа");
        outgoing.setAuthor("Борзилов");

        outgoing.setDeliveryMethod("Пуговкин");
        outgoing.setDestination("почта");


        return outgoing;
    }

}

