/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Exercicio2 {

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("556213123",1234);
        PayPal pay = new PayPal("algumaCoisa@gmail.com");
        cartao.pagamento(1234);
        System.out.println(cartao.obterDetalhes());
        pay.pagamento(1234);
        System.out.println(pay.obterDetalhes());
    }
}
