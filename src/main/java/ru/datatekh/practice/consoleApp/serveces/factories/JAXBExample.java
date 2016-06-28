package ru.datatekh.practice.consoleApp.serveces.factories;

/**
 * Created by Света on 27.06.2016.
 */

import ru.datatekh.practice.consoleApp.model.document.Document;
import ru.datatekh.practice.consoleApp.model.document.Organizations;
import ru.datatekh.practice.consoleApp.model.document.Person;
import ru.datatekh.practice.consoleApp.model.document.Persons;
import ru.datatekh.practice.consoleApp.model.document.Organization;
import ru.datatekh.practice.consoleApp.model.document.Organizations;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
     File file = new File(System.getProperty("user.dir")+ File.separator + "persons.xml");
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

     ArrayList<Integer> list = new ArrayList<Integer>(5);
     list.add(2403897);
     list.add(2403837);
     list.add(2403827);
     Organizations org = new Organizations();
     org.organization.add(createOrg(1,"Федеральная служба государственной статистики","Росстат","Александров Вадим Анатоольевич",list));
     list.clear();
     list.add(2423897);
     list.add(2433837);
     list.add(2413827);
     org.organization.add(createOrg(2,"Федеральное космическое агентство", "Роскосмос","Кудрявцев Сергей Антонович",list));
     list.clear();
     list.add(2223897);
     list.add(2231837);
     list.add(2413127);
     org.organization.add(createOrg(3,"Общество с ограниченной ответственностью Ромашка","ООО Ромашка","Андреев Максим Анатольевич",list ));
     list.clear();
     list.add(2223895);
     list.add(2231834);
     list.add(2413122);
     org.organization.add(createOrg(4,"Общество с ограниченной ответственностью Эльдорадо", "Эльдорадо","Никитин Михаил Юрьевич",list));
     list.clear();
     list.add(2224895);
     list.add(2234834);
     list.add(2414122);
     org.organization.add(createOrg(5,"Публичная компания МВидео","МВидео","Александр Анатольевич Тынкован",list));
     list.clear();
     list.add(2224891);
     list.add(2234831);
     list.add(2414121);
     org.organization.add(createOrg(6,"Общество с ограниченной ответственностью Навигатор продаж", "Навигатор продаж",
                                        "Мазный Александр Александрович",list));
     list.clear();
     list.add(2324891);
     list.add(2334831);
     list.add(2314121);
     org.organization.add(createOrg(7,"Пятерочка","Пятерочка","Ольга Наумова",list));
     list.clear();
     list.add(2324892);
     list.add(2334832);
     list.add(2314122);
     org.organization.add(createOrg(8,"Матрица","Матрица","Андреев Андрей Андреевич",list));
     list.clear();
     list.add(2324811);
     list.add(2334811);
     list.add(2314111);
     org.organization.add(createOrg(9,"Цифроград","Цифроград","Михайлова Ольга Николаевна",list));
     list.clear();
     list.add(2324491);
     list.add(2334431);
     list.add(2314421);
     org.organization.add(createOrg(10,"Башавтотранс","Башавтотранс","Киролов Андрей Сергеевич",list));
     list.clear();
     list.add(2304491);
     list.add(2304431);
     list.add(2304421);

     try {
         //писать результат сериализации будем в файл
         File file = new File(System.getProperty("user.dir")+ File.separator + "organizations.xml");
         //создание объекта Marshaller, который выполняет сериализацию
         JAXBContext context = JAXBContext.newInstance(Organization.class, Organizations.class);
         Marshaller marshaller = context.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
         // самосериализация
         marshaller.marshal(org, file);
     } catch (JAXBException ex) {
         Logger.getLogger(JAXBExample.class.getName())
                 .log(Level.SEVERE, null, ex);
     }
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
        Person person = new Person();
        person.setId(id);
        person.setSurname(surname);
        person.setName(name);
        person.setSecondName(secondName);
        person.setPosition(position);
        return person;
    }
    public static Organization createOrg(int id,String orgName, String shortName, String boss, ArrayList<Integer> orgTelNumbers) {
        Organization organization = new Organization();
        organization.setId(id);
        organization.setOrgName(orgName);
        organization.setShortName(shortName);
        organization.setOrgBoss(boss);
        organization.setOrgTelNumbers(orgTelNumbers);
        return organization;
    }
}
