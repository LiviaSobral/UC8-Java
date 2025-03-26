/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioarraylist;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Contato {
    private String name;
    private String number;
    
    public Contato(String name, String number){
        this.name = name;
        this.number = number;
    }
    @Override
    public String toString(){
        return this.name +" - "+ this.number;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
}
