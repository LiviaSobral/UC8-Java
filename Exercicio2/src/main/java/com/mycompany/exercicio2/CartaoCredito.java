/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class CartaoCredito implements Pagamento{
    String numeroCartao;
    int codigoDeSeguranca;
    
    public CartaoCredito(String numeroCartao,int codigoDeSeguranca){
        this.numeroCartao = numeroCartao;
        this.codigoDeSeguranca = codigoDeSeguranca;
    }

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Cartão de Crédito");        
        }

    @Override
    public String obterDetalhes() {
        String info = "Ultimos Numeros do Cartão: ";
        info = info+ this.numeroCartao.substring(numeroCartao.length() - 4);
        info = info + "\n Codigo de Segurança: ";
        info = info + this.codigoDeSeguranca;
        return info;
        }
}
