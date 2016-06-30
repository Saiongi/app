package ru.datatekh.practice.consoleApp.model.document;

/**
 * Created by Света on 20.06.2016.
 */
import ru.datatekh.practice.consoleApp.model.document.Document;

import java.util.Date;
public class Incoming extends Document {
   private Person sender;  //отправитель;
   private Person destination; //адресат;
   private int incomeNumber; //исходящий номер;
   private Date incomeDateOfRegistration; //исходящая дата регистрации.


   @Override
   public String getTable() {
      return null;
   }

   public Person getSender(){
      return this.sender;
   }

   public void setSender(Person sender) {
      this.sender = sender;
   }

   public Person getDestination(){
      return this.destination;
   }

   public void setDestination(Person destination) {
      this.destination = destination;
   }

   public int getIncomeNumber(){
      return this.incomeNumber;
   }

   public void setIncomeNumber(int incomeNumber) {
      this.incomeNumber = incomeNumber;
   }

   public Date getIncomeDateOfRegistration(){
      return this.incomeDateOfRegistration;
   }

   public void setIncomeDateOfRegistration(Date incomeDateOfRegistration) {
      this.incomeDateOfRegistration = incomeDateOfRegistration;
   }

   @Override
   public String toString() {
      String str = "\n"+"идентификатор документа: "+this.getId()+"\nНазвание документа: "+this.getNameDoc()+
              "\nТекст документа: "+ this.getText()+"\nРегистрационный номер документа: "+this.getRegisterNumOfDoc()+
              "\nДата регистрации документа: "+ this.getDateOfRegistration()+"\nАвтор: "+this.getAuthor().getSurname()+" "+
              this.getAuthor().getName()+" "+this.getAuthor().getSecondName()+
              "\nОтправитель: "+sender.getSurname()+" "+ sender.getName()+" "+sender.getSecondName()+
              "\nАдресат: "+destination.getSurname()+destination.getName() +
              destination.getSecondName()+ "\nИсходящий номер: "+incomeNumber+
              "\n" + "Исходящая дата регистрации: "+incomeDateOfRegistration;
      return str;
   }



}
