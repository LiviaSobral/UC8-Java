/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo{
    int portas;

    public Carro(String marca, double peso,int portas) {
        super(marca, 4, peso);
        this.portas = portas;
    }
    
    public void cavalinhoDePau(){
        System.out.println("IIIIIIIIRRRRRRRHHHHH");
    }
    
    @Override
    public void Andar(){
        System.out.println("O Carro de marca "+ this.getMarca()+" esta andando.");
    }
    
}
