/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;
import java.util.Scanner;
/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Game {
    private int numberToGuess;
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner; 

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bem-vindo ao Guessing Game, " + player.getName() + "!");
        boolean hasWon = false;
        
         while (!hasWon) {
            System.out.print("Digite seu palpite: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }

        System.out.println("Parabens, " + player.getName() + "! Voce adivinhou o numero.");
    
        
    }
    
}
