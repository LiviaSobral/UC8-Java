/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsGame;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Validator {
    public int validar(int maquina,int player){
        if(maquina == 1 && player == 2){
            System.out.println("Jogador Escolheu Papel e maquina escolheu Pedra. Voce Ganhou!!");
            return 1;
    }else if(maquina == 1 && player == 3){
        System.out.println("Jogador Escolheu Tesoura e maquina escolheu Pedra. Voce Perdeu!!");
        return 2;
    }else if(maquina == 2 && player == 1){
        System.out.println("Jogador Escolheu Pedra e maquina escolheu Papel. Voce Perdeu!!");
        return 2;
    }else if(maquina == 2 && player == 3){
        System.out.println("Jogador Escolheu Tesoura e maquina escolheu Papel. Voce Ganhou!!");
        return 1;
    }else if(maquina == 3 && player == 1){
        System.out.println("Jogador Escolheu Pedra e maquina escolheu Tesoura. Voce Ganhou!!");
        return 1;
    }else if(maquina == 3 && player == 2){
        System.out.println("Jogador Escolheu Papel e maquina escolheu Tesoura. Voce Perdeu!!");
        return 2;
    }else{
        System.out.println("Jogador Escolheu o mesmo que a maquina. Voce Empatou!");
        return 3;
    }
    }
        
        
}
