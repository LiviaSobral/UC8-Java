/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame2;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Player {
    private String name;
    private int erros = 0;
    private int acertos = 0;

    public Player(String nome) {
        name = nome;
        
    }
    
    public void addErros(){
        this.erros += 1;
    }
    public void addAcertos(){
        this.acertos += 1;
    }
    public int getErros(){
        return this.erros;
    }
    public int getAcertos(){
        return this.acertos;
    }

    public String getName() {
        return name;
    }
}
