/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsGame;
import java.util.Scanner;
/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Player {
    private String nome;
    private int vitorias = 0;

    
    public Player(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        nome = scan.nextLine();
    }
    
    public String getNome() {
        return nome;
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
