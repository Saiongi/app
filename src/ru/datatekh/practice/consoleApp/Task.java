package ru.datatekh.practice.consoleApp;

/**
 * Created by Света on 20.06.2016.
 */

import java.util.Date;
 class Task extends Document  {
    private Date data;  //дата выдачи поручения;
    private Date  period; //срок исполнения поручения; - до такой то даты
    private String executor; // ответственный исполнитель;
    private boolean control; // признак контрольности;
    private String controllerName;// контролер поручения.



    public Date getData(){
        return this.data;
    }
    public void setData(Date data) {
        this.data = data;
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
}
