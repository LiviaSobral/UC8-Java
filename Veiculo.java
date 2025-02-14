/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private String marca;
    int numeroDeRodas;
    double peso;
    
    public Veiculo(String marca,int numeroDeRodas,double peso){
        this.marca = marca;
        this.numeroDeRodas = numeroDeRodas;
        this.peso = peso;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void Andar(){
        System.out.println("O Veiculo de marca "+ this.getMarca()+" esta andando.");
    }
}
