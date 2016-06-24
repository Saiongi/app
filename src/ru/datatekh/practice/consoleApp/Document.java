
package ru.datatekh.practice.consoleApp;

/**
 * Created by Света on 20.06.2016.
 */
import java.util.Date;


public abstract class Document implements Comparable   {

    private int id;                         //	идентификатор документа;
    private String nameDoc;                 // название документа;
    private String text;                    // текст документа;
    private String registerNumOfDoc;    //регистрационный номер документа;
    private Date dateOfRegistration;      //дата регистрации документа;
    private String author;                  //автор документа.

    @Override
    public String toString() {
        String str ="идентификатор документа:"+id+"\nНазвание документа:"+nameDoc+"\nТекст документа:"+
                text+"\nРегистрационный номер документа:"+registerNumOfDoc+"\nДата регистрации документа:"+
                dateOfRegistration+"\nАвтор:"+author;
        return str;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getNameDoc(){
        return this.nameDoc;
    }
    public void setNameDoc(String nameDoc){
        this.nameDoc = nameDoc;
    }
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text=text;
    }

    public String getRegisterNumOfDoc(){
        return this.registerNumOfDoc;
    }
    public void setRegisterNumOfDoc(String registerNumOfDoc ){
        this.registerNumOfDoc = registerNumOfDoc;
    }

    public Date getDateOfRegistration(){
        return this.dateOfRegistration;
    }
    public void setDateOfRegistration(Date dateOfRegistration){
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }




 /*
    @Override
    public int compareTo(Object obj) {
        Document entry = (Document) obj;
  // result = registerNumOfDoc - entry.registerNumOfDoc;
    //    if(result != 0) {
      //      return (int) result / Math.abs( result );
      //  }
        int result = registerNumOfDoc.compareTo(entry.registerNumOfDoc);
        if(result != 0) {
            return result;
        }
        result = dateOfRegistration.compareTo(entry.dateOfRegistration);
        if(result != 0) {
            return result;
        }
        return 0;
    }
*/
    @Override
    public int compareTo(Object obj) {
         Document entry = (Document) obj;
        int result = author.compareTo(entry.author);
        if (result!=0){
            return result;
        }
        result = dateOfRegistration.compareTo(entry.dateOfRegistration);
        if(result != 0) {
            return result;
        }
        result = registerNumOfDoc.compareTo(entry.registerNumOfDoc);
        if(result != 0) {
            return result;
        }
        
    return 0;
     }





}
