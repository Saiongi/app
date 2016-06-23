package ru.datatekh.practice.consoleApp;

import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;


/**
 * Created by Света on 23.06.2016.
 */
public class DocFieldsStorage {
    private int idStorage = 0;


    HashMap<Integer, String> nameDocStorage = new HashMap<Integer, String>(6);
    HashMap<Integer, String> textStorage = new HashMap<Integer, String>(6);
    HashMap<Integer, String> authorDocStorage = new HashMap<Integer, String>(6);
    HashMap<Integer, String> deliveryMethodStorage = new HashMap<Integer, String>(6);


    public DocFieldsStorage() {


        //создание коллекции для названия документов
        nameDocStorage.put(0, "Первый документ");
        nameDocStorage.put(1, "Второй документ");
        nameDocStorage.put(2, "Третий документ");
        nameDocStorage.put(3, "Приказ");
        nameDocStorage.put(4, "Заявление");
        nameDocStorage.put(5, "Объяснительная");
        //создание коллекции для текста
        textStorage.put(0, "Очень интересный текст документа");
        textStorage.put(1, "Скучный текст документа");
        textStorage.put(2, "Левый текст документа");
        textStorage.put(3, "какойто текст");
        textStorage.put(4, "Занудный текст");
        textStorage.put(5, "текст про котиков");
        //создание коллекции для авторов документов
        authorDocStorage.put(0, "Аксанов");
        authorDocStorage.put(1, "Ахметов");
        authorDocStorage.put(2, "Бабкин");
        authorDocStorage.put(3, "Бадаев");
        authorDocStorage.put(4, "Барышников");
        authorDocStorage.put(5, "Батырханов");
        //создание коллекции для метода доставки
        deliveryMethodStorage.put(0, "Почта России");
        deliveryMethodStorage.put(1, "Экспресс-операторы");
        deliveryMethodStorage.put(2, "Фельдъегерская служба");
        deliveryMethodStorage.put(3, "Факсимильные сообщения");
        deliveryMethodStorage.put(4, "Сообщения по электронной почте");
        deliveryMethodStorage.put(5, "Курьерская доставка");
    }

    //генерируем id
    public int getId() {
        idStorage++;
        return idStorage;
    }

    //генерируем рег номер
    public String getRegisterNumOfDoc() {
        String regNom = "ном" + String.valueOf((int) (Math.random() * 20));
        return regNom;
    }

    //задаем дату
    public Date getDate() {

        Date regDate = Calendar.getInstance().getTime();
        return regDate;
    }

    public Date generateDate(){
        Calendar cal = Calendar.getInstance();
        int month=(int)(Math.random()*12);
        int day=(int)(Math.random()*29+1);
        cal.set(2014, month, day);
        Date date = cal.getTime();
        return date;
    }



    public boolean getControl(){
        Random random = new Random();
        return random.nextBoolean();
    }

        public void saveDocField(Document doc){
            doc.setText(textStorage.get((int)(Math.random()*5)));
            doc.setAuthor(authorDocStorage.get((int)(Math.random()*5)));
           doc.setId(getId());
            doc.setNameDoc(nameDocStorage.get((int)(Math.random()*5)));
            // определяем тип документа, в зависимости от этого заполняем данные
            if (doc instanceof Incoming){
                ((Incoming) doc).setSender(authorDocStorage.get((int)(Math.random()*5)));
                ((Incoming) doc).setDestination(authorDocStorage.get((int)(Math.random()*5)));
                ((Incoming) doc).setIncomeNumber((int)(Math.random()*5));
                ((Incoming) doc).setIncomeDateOfRegistration(generateDate());
            }else if (doc instanceof Outgoing){
                ((Outgoing) doc).setDestination(authorDocStorage.get((int)(Math.random()*5)));
                ((Outgoing) doc).setDeliveryMethod(deliveryMethodStorage.get((int)(Math.random()*5)));
            }else if (doc instanceof Task){
                ((Task) doc).setDate(generateDate());
                ((Task) doc).setPeriod(generateDate());
                ((Task) doc).setExecutor(authorDocStorage.get((int)(Math.random()*5)));
                ((Task) doc).setControl(getControl());
                ((Task) doc).setControllerName(authorDocStorage.get((int)(Math.random()*5)));


            }


        }

    }




