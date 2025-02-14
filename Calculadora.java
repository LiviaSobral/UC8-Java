/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    
    public double Soma(double num,double num2){
        return num+num2;
    }
    public double Subtracao(double num,double num2){
        return num-num2;
    }
    public double Divisao(double num,double num2){
        if(num2==0){
            throw new ArithmeticException("Usuario: Tentou dividir por ZERO");
        }
        return num/num2;
    }
    public double Multiplicacao(double num,double num2){
        return num*num2;
    }
}
