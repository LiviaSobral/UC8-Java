/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacegrafica;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Pokemon {
    private String name;
    private String type;
    private int level;
    
    public Pokemon(String name,String type,int level){
        this.name = name;
        this.type = type;
        this.level = level;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public String displayPokemon(){
        String pokemon = this.name;
        pokemon += " Of Type: " +this.type +" |";
        pokemon+= " Level:" +this.level;
        return pokemon;
    }
    
}
