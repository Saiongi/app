package ru.datatekh.practice.consoleApp;

import ru.datatekh.practice.consoleApp.model.document.*;
import ru.datatekh.practice.consoleApp.model.document.Person;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;



/**
 * Created by Света on 23.06.2016.
 */
public class DocFieldsStorage {
    private int idStorage = 0;
    SimpleDateFormat sdf;

    HashMap<Integer, String> nameDocStorage = new HashMap<Integer, String>(6);
    HashMap<Integer, String> textStorage = new HashMap<Integer, String>(6);
    HashMap<Integer, Person> personDocStorage = new HashMap<Integer, Person>(6);
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
        String regNom = String.valueOf((int) (Math.random() * 20)+"ном");
        return regNom;
    }
    //задаем дату
    public Date getDate() {
        Calendar calendar = Calendar.getInstance();
        calendar =Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND,0);
        Date regDate = calendar.getTime();
        return regDate;
    }
        //генерация случайной даты
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
        public void getPerson(Integer i,Person p ){
            personDocStorage.put(i,p);
        }



        public void saveDocField(Document doc){
            doc.setText(textStorage.get((int)(Math.random()*5)));
            doc.setAuthor(personDocStorage.get((int)(Math.random()*5)));
           doc.setId(getId());
            doc.setNameDoc(nameDocStorage.get((int)(Math.random()*5)));
            // определяем тип документа, в зависимости от этого заполняем данные
            if (doc instanceof Incoming){
                ((Incoming) doc).setSender(personDocStorage.get((int)(Math.random()*5)));
                ((Incoming) doc).setDestination(personDocStorage.get((int)(Math.random()*5)));
                ((Incoming) doc).setIncomeNumber((int)(Math.random()*5));
                ((Incoming) doc).setIncomeDateOfRegistration(generateDate());
            }else if (doc instanceof Outgoing){
                ((Outgoing) doc).setDestination(personDocStorage.get((int)(Math.random()*5)));
                ((Outgoing) doc).setDeliveryMethod(deliveryMethodStorage.get((int)(Math.random()*5)));
            }else if (doc instanceof Task){
                ((Task) doc).setDate(generateDate());
                ((Task) doc).setPeriod(generateDate());
                ((Task) doc).setExecutor(personDocStorage.get((int)(Math.random()*5)));
                ((Task) doc).setControl(getControl());
                ((Task) doc).setControllerName(personDocStorage.get((int)(Math.random()*5)));


            }


        }

    }




