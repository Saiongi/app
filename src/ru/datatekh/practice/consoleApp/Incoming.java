package ru.datatekh.practice.consoleApp;

/**
 * Created by Света on 20.06.2016.
 */
import java.util.Date;
public class Incoming extends Document  {
   private String sender;  //отправитель;
   private String destination; //адресат;
   private int incomeNumber; //исходящий номер;
   private Date incomeDateOfRegistration; //исходящая дата регистрации.



   public String getSender(){
      return this.sender;
   }
   public void setSender(String sender) {
      this.sender = sender;
   }


   public String getDestination(){
      return this.destination;
   }
   public void setDestination(String destination) {
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
}
