/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public abstract class Cla {
    String nomeDoCla;
    String lider;
    
    public abstract void habilidadeEspecial();
    public void exibirDetalhes(){
        System.out.println("Clã: "+ this.nomeDoCla+" Seu lider é: "+this.lider);
    }
}
