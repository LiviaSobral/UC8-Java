/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessingGame;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Game {
    private int numero;   
    
    public Game(){
        this.numero = (int)(Math.random()*100)+1;
    }

    public void start() {
        throw new UnsupportedOperationException("Ainda n faz nada");
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
