package ru.datatekh.practice.consoleApp.model.document;

import ru.datatekh.practice.consoleApp.model.staff.Person;

/**
 * Created by Света on 20.06.2016.
 */
public class Outgoing extends Document {
  private Person destination;  //адресат
  private String deliveryMethod;  //способ доставки


  @Override
  public String getTable() {
    return null;
  }

  public Person getDestination(){
    return this.destination;
  }
  public void setDestination(Person destination) {
    this.destination = destination;
  }

  public String getDeliveryMethod(){
    return this.deliveryMethod;
  }
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }
  @Override
  public String toString() {

    String str ="\n"+ "Идентификатор документа: "+this.getId()+"\nНазвание документа:"+this.getNameDoc()+
            "\nТекст документа: "+ this.getText()+"\nРегистрационный номер документа: "+this.getRegisterNumOfDoc()+
            "\nДата регистрации документа: "+ this.getDateOfRegistration()+"\nАвтор: "+this.getAuthor().getSurname() +
             " "+ this.getAuthor().getName()+" "+this.getAuthor().getSecondName()+
            "\nАдресат: "+destination.getSurname() + " " + destination.getName() + " " +
            destination.getSecondName()+ "\nСпособ доставки: "+deliveryMethod;

    return str;
  }

}
