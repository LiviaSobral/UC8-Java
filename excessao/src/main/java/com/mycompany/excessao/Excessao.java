/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excessao;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class Excessao {
    

    public static void main(String[] args) {
        try{
            FileReader arquivo = new FileReader("arquivo.txt");
        }catch(FileNotFoundException e){
            System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        }
    }
}
