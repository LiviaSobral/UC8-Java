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
public class Game {  
    private int vitoriasMaquina = 0;
    private Player jogador;
    private Validator valida;
    private Scanner scan; 
    
    public Game(){
        this.jogador = new Player();
        this.valida = new Validator();
        this.scan = new Scanner(System.in);
    }
       
   

    void start() {
        for(int jogadas = 0;jogadas < 3&&jogador.getVitorias() < 2 &&vitoriasMaquina < 2;jogadas++){
            int escolha;
            escolha = (int) (Math.random() * 3) + 1;
            System.out.println("Escreva Sua Escolha Pedra(1), Papel(2), Tesoura(3)");
            int escolhaPlayer = scan.nextInt();
            int resp = valida.validar(escolha, escolhaPlayer);
            if(resp==1){
                jogador.setVitorias(jogador.getVitorias()+1);
            }else if(resp==2){
                vitoriasMaquina++;
            }
            
        }
        if(jogador.getVitorias() == vitoriasMaquina){
                System.out.println("Player "+ jogador.getVitorias()+" Empatou com a maquina.");
            }else{
            System.out.println("Player "+ jogador.getNome()+" teve Vitorias: "+ jogador.getVitorias());
            System.out.println(("A Maquina teve Vitorias: "+vitoriasMaquina));
        }
        
            
        
        
        }
    
}
