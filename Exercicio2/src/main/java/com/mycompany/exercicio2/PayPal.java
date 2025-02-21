/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class PayPal implements Pagamento{
    
    String email;
    
    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via PayPal");          
        }

    @Override
    public String obterDetalhes() {
        String info = "Email: ";
        info = info+ email;
        return info;
        }
    
}
