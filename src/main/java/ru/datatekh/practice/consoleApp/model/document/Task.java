package ru.datatekh.practice.consoleApp.model.document;

/**
 * Created by Света on 20.06.2016.
 */

import ru.datatekh.practice.consoleApp.model.document.Document;

import java.util.Date;
 public class Task extends Document {
    private Date date;  //дата выдачи поручения;
    private Date  period; //срок исполнения поручения; - до такой то даты
    private String executor; // ответственный исполнитель;
    private boolean control; // признак контрольности;
    private String controllerName;// контролер поручения.

     @Override
     public String getTable() {
         return null;
     }

     public Date getDate(){
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getPeriod(){
        return this.period;
    }
    public void setPeriod(Date period) {
        this.period = period;
    }

    public String getExecutor(){
        return this.executor;
    }
    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public boolean getControl(){
        return this.control;
    }
    public void setControl(boolean control) {
        this.control = control;
    }

    public String getControllerName(){
        return this.controllerName;
    }
    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

     @Override
     public String toString() {
         String cont;
         if(control) {
             cont = "Контрольный";
         }else {
             cont = "Неконтрольный";
         }
         String str ="\n\n"+"идентификатор документа:"+this.getId()+"\nНазвание документа:"+this.getNameDoc()+"\nТекст документа:"+
                 this.getText()+"\nРегистрационный номер документа:"+this.getRegisterNumOfDoc()+"\nДата регистрации документа:"+
                 this.getDateOfRegistration()+"\nАвтор:"+this.getAuthor()+"\nДата выдачи поручения:"+date+
                 "\nСрок исполнения получения:"+period+"\nОтветственный исполнитель:"+executor+"\nПризнак контрольности:"+cont+
                 "\nКонтроллер поручения:"+controllerName;
         return str;
     }

    /*
     @Override
     public int compareTo(Object obj) {
         Document entry = (Document) obj;
         int result = getAuthor().compareTo(entry.getAuthor());
         if (result!=0){
             return result;
         }
         result = getDateOfRegistration().compareTo(entry.getDateOfRegistration());
         if(result != 0) {
             return result;
         }
         result = getRegisterNumOfDoc().compareTo(entry.getRegisterNumOfDoc());
         if(result != 0) {
             return result;
         }

         return 0;
     }
    */


 }