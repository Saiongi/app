package ru.datatekh.practice.consoleApp.serveces.factories;

/**
 * Created by Света on 27.06.2016.
 */

import ru.datatekh.practice.consoleApp.model.document.Document;
import ru.datatekh.practice.consoleApp.model.document.Person;
import ru.datatekh.practice.consoleApp.model.document.Persons;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
 /*   Person person;
      //  TreeSet<Person> persons = new TreeSet<Person>();
       // persons.add(createPerson(2, "Иванов", "Иван", "Иванович", "директор"));
       // persons.add(createPerson(2, "Иванова", "Анна", "Ивановна", "секретарь"));

    JAXBExample() {
         person = new Person();
        person = createPerson( "Иванов", "Иван", "Иванович", "директор");


        try {
            File file = new File(System.getProperty("user.dir") + File.separator + "person.xml");
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(person, file);
            marshaller.marshal(person, System.out);
        } catch (JAXBException ex) {
            Logger.getLogger(JAXBExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


        private static Person createPerson( String surname, String name, String secondName, String position) {
                Person person = new Person();

                person.setSurname(surname);
                person.setName(name);
                person.setSecondName(secondName);
                person.setPosition(position);
                return person;
        }

        public void marshallExample() {
            try {
                JAXBContext context = JAXBContext.newInstance(Person.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal( person , System.out);
            } catch (JAXBException exception) {
                Logger.getLogger(JAXBExample.class.getName()).
                        log(Level.SEVERE, "marshallExample threw JAXBException", exception);
            }
    }
    public static void main(String[] args) {
    JAXBExample instance = new JAXBExample();
    instance.marshallExample();
   // instance.unmarshallExample();
    System.out.println("Done");

    }
    */
 public static void main(String[] args)throws JAXBException {
    /* Person person = new Person();
     person.setId(1);
     person.setSurname("Захарова");
     person.setName("Светлана");
     person.setSecondName("Сергеевна");
     person.setPosition("практикант");
*/
     //javarush
     Persons pers = new Persons();
     pers.persons.add(createPerson(1, "Крузенштерн", "Иван", "Иванович", "директор"));
     pers.persons.add(createPerson(2, "Арбузова", "Анна", "Ивановна", "секретарь"));
     pers.persons.add(createPerson(3, "Галеев", "Азат", "Рустемович", "бухгалтер"));
     pers.persons.add(createPerson(4, "Бабкина", "Анастасия", "Михайловна", "Главный бухгалтер"));
     pers.persons.add(createPerson(5, "Ахметова", "Алла", "Александровна", "Менеджер"));
     pers.persons.add(createPerson(6, "Гайсин", "Анна", "Ивановна", "Менеджер по персоналу"));
     pers.persons.add(createPerson(7, "Мухаметов", "Эдуард", "Данисович", "заместитель директора"));
     pers.persons.add(createPerson(8, "Дворянинова", "Кристина", "Дмитриевна", "ассистент"));
     pers.persons.add(createPerson(9, "Анянов", "Алексей", "Петрович", "старший менеджер"));
     pers.persons.add(createPerson(10, "Яблочкина", "Екатерина", "Николаевна", "менеджер"));



     try {
         //писать результат сериализации будем в файл
     File file = new File(System.getProperty("user.dir")
             + File.separator + "persons.xml");
     //создание объекта Marshaller, который выполняет сериализацию
     JAXBContext context = JAXBContext.newInstance(Person.class, Persons.class);
     Marshaller marshaller = context.createMarshaller();
     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
     // самосериализация
     marshaller.marshal(pers, file);
     } catch (JAXBException ex) {
         Logger.getLogger(JAXBExample.class.getName())
                 .log(Level.SEVERE, null, ex);
     }
    //javarash finish

/*
     try {
         File file = new File(System.getProperty("user.dir")
                 + File.separator + "person.xml");
         JAXBContext context = JAXBContext.newInstance(Person.class);
         Marshaller marshaller = context.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

             marshaller.marshal(person, file);
             marshaller.marshal(person, System.out);

     } catch (JAXBException ex) {
         Logger.getLogger(JAXBExample.class.getName())
                 .log(Level.SEVERE, null, ex);
     }*/
 }

    public static Person createPerson(int id,String surname, String name, String secondName, String position) {
        Person pers = new Person();
        pers.setId(id);
        pers.setSurname(surname);
        pers.setName(name);
        pers.setSecondName(secondName);
        pers.setPosition(position);
        return pers;
    }
}
