package ru.datatekh.practice.consoleApp.serveces;

/**
 * Created by Света on 27.06.2016.
 */

import ru.datatekh.practice.consoleApp.model.staff.Department;
import ru.datatekh.practice.consoleApp.model.staff.Departments;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JAXBExample {
    public static void main(String[] args) throws JAXBException {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.clear();
        list.add(1403897);
        list.add(1403837);
        list.add(1403827);
        Departments dep = new Departments();
        Department depart = new Department();
        dep.department.add(depart.createDep(1, "Департамент управления делами и контроля", "Департамент УДК",
                "Кудрявцев Сергей Анатоольевич", list));
        list.clear();
        list.add(2223897);
        list.add(2233837);
        list.add(2213827);
        dep.department.add(depart.createDep(2, "Департамент бюджетной методологии и финансовой отчетности в государственном секторе",
                "Департамент БМ и Фо в ГС",
                "Романов Сергей Владимирович", list));
        list.clear();
        list.add(2233897);
        list.add(2231837);
        list.add(2433127);
        dep.department.add(depart.createDep(3, "Департамент налоговой и таможенной политики",
                "Департамент НиТП", "Сазанов Максим Анатольевич", list));
        list.clear();
        list.add(2224895);
        list.add(2234834);
        list.add(2414122);
        dep.department.add(depart.createDep(4, "Департамент государственного долга и государственных финансовых активов",
                "Депарамент ГДиГФА", "Вышковский Михаил Юрьевич", list));
        list.clear();
        list.add(2224595);
        list.add(2234854);
        list.add(2414152);
        dep.department.add(depart.createDep(5, "Департамент финансовой политики", "Департамент ФинПол",
                "Барсуокв Анатольевич Тынкован", list));
        list.clear();
        list.add(2224896);
        list.add(2234836);
        list.add(2414126);
        dep.department.add(depart.createDep(6, "Общество с ограниченной ответственностью Навигатор продаж", "Навигатор продаж",
                "Мазный Александр Александрович", list));
        list.clear();
        list.add(2327891);
        list.add(2337831);
        list.add(2317121);
        dep.department.add(depart.createDep(7, "Департамент межбюджетных отношений", "Департамент МО",
                "Ерошкина Лариса Наумовна", list));
        list.clear();
        list.add(2328892);
        list.add(2338832);
        list.add(2318122);
        dep.department.add(depart.createDep(8, "Правовой департамент", "Правовой департамент",
                "Ячевский Андрей Андреевич", list));
        list.clear();
        list.add(2329811);
        list.add(2339811);
        list.add(2319111);
        dep.department.add(depart.createDep(9, "Департамент правового регулирования бюджетных отношений",
                "Департамент ПРБО", "Саакян Ольга Николаевна", list));
        list.clear();
        list.add(2310491);
        list.add(2310431);
        list.add(2310421);
        dep.department.add(depart.createDep(10, "Департамент бюджетной политики в отраслях экономики",
                "департамент БПвОЭ", "Рябушкин Андрей Сергеевич", list));
        try {
            //писать результат сериализации будем в файл
            File file = new File(System.getProperty("user.dir") + File.separator + "departments.xml");
            //создание объекта Marshaller, который выполняет сериализацию
            JAXBContext context = JAXBContext.newInstance(Department.class, Departments.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // самосериализация
            marshaller.marshal(dep, file);
        } catch (JAXBException ex) {
            Logger.getLogger(JAXBExample.class.getName()).log(Level.SEVERE, null, ex);
        }




    }




}