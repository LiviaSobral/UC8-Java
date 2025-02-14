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
public class Player {
    private String nome;

    Scanner scanner = new Scanner(System.in);
    
    public Player(){        
        System.out.println("Digite seu nome: ");
        this.nome = scanner.nextLine();
    }
    
    public String getNome() {
        return nome;
    }
}
