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

    //создание коллекции для идентификаторов
    HashMap<Integer,Integer> idStorage = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> nameDocStorage = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> textStorage = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> nameDocStorage = new HashMap<Integer,Integer>();

        public void createFields() {
            for (int i = 0; i < 10; i++) {
                idStorage.put(i,i);
            }




        }



    }




