/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame2;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class GuessValidator {
    public int validateGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {
            //System.out.println("Seu palpite e muito alto!");
            return 10;
        } else if (guess < numberToGuess) {
            //System.out.println("Seu palpite e muito baixo!");
            return 1;
        } else {
            return 5; // Palpite correto
        }
    }
}
