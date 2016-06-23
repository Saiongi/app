package ru.datatekh.practice.consoleApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 * Created by Света on 23.06.2016.
 */
public class DocFieldsStorage {

    private int id;                         //	идентификатор документа;
    private String nameDoc;                 // название документа;
    private String text;                    // текст документа;
  //  private String registerNumOfDoc;    //регистрационный номер документа;
    private String author;                  //автор документа.
    private int idStorage=0;


    HashMap<Integer,String> nameDocStorage = new HashMap<Integer,String>(6);
    HashMap<Integer,String> textStorage = new HashMap<Integer,String>(6);
    HashMap<Integer,String> authorDocStorage = new HashMap<Integer,String>(6);



        public DocFieldsStorage(){

            //создание коллекции для названия документов
            nameDocStorage.put(0,"Первый документ");
            nameDocStorage.put(1,"Второй документ");
            nameDocStorage.put(2,"Третий документ");
            nameDocStorage.put(3,"Приказ");
            nameDocStorage.put(4,"Заявление");
            nameDocStorage.put(5,"Объяснительная");
            //создание коллекции для текста
            textStorage.put(0,"Очень интересный текст документа");
            textStorage.put(1,"Скучный текст документа");
            textStorage.put(2,"Левый текст документа");
            textStorage.put(3,"какойто текст");
            textStorage.put(4,"Занудный текст");
            textStorage.put(5,"текст про котиков");
            //создание коллекции для авторов документов
            authorDocStorage.put(0,"Аксанов");
            authorDocStorage.put(1,"Ахметов");
            authorDocStorage.put(2,"Бабкин");
            authorDocStorage.put(3,"Бадаев");
            authorDocStorage.put(4,"Барышников");
            authorDocStorage.put(5,"Батырханов");

        }
        public int getId(){
            idStorage++;
            return idStorage;
        }

        public void saveDocField(Document doc){
            doc.setText(textStorage.get((int)(Math.random()*5)));
            doc.setAuthor(authorDocStorage.get((int)(Math.random()*5)));
           doc.setId(getId());
            doc.setNameDoc(nameDocStorage.get((int)(Math.random()*5)));
        }

    }




