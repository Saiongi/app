package ru.datatekh.practice.consoleApp;

/**
 * Created by Света on 20.06.2016.
 */
public class Outgoing extends Document{
  private String destination;  //адресат
  private String deliveryMethod;  //способ доставки

  public String getDestination(){
    return this.destination;
  }
  public void setDestination(String destination) {
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

    String str = "Идентификатор документа: "+this.getId()+"\nНазвание документа:"+this.getNameDoc()+
            "\nТекст документа: "+ this.getText()+"\nРегистрационный номер документа: "+this.getRegisterNumOfDoc()+
            "\nДата регистрации документа: "+ this.getDateOfRegistration()+"\nАвтор: "+this.getAuthor()+
            "\nАдресат: "+destination+ "\nСпособ доставки: "+deliveryMethod;

    return str;
  }

}
