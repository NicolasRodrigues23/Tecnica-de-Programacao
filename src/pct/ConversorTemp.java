/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author manager
 */
public class ConversorTemp {
    
    public static void main(String[] args) {
        
        //Declaração de Variaveis
        double cel, fah;
        
        //Criação e Instancia do Objeto de Entrada
        Scanner entrada = new Scanner(System.in);
        
        //apresentação
        System.out.println("\n\t\t -- Conversor de Temperatura -- \n");
        
        //entrada
        System.out.print("Informe a Temperatura (C°): ");
        cel = entrada.nextInt();
        
        //Processamento
        fah = 9 * cel / 5 + 32;
        
        //saida
        System.out.println("\n\t F° = "+ fah +"\t\n ");
        
        
    }
    
}
