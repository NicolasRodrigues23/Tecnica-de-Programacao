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
public class EstacaoDoAno {
    
    public static void main(String[] args) {
        
        //variaveis
        int dia, mes;
        
        //Criação e Instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //apresentação
        System.out.println("\n\t\t -- Indicador de Estação do Ano --\n");
        
        //entrada
        System.out.print("Informe o Dia: ");
        dia = entrada.nextInt();
        
        System.out.print("Informe o Mes: ");
        mes = entrada.nextInt();
        
        //processamento & saida
        
        if ((mes <= 12) && (mes >= 1) && (dia <= 31) && (dia >= 1)) {
            if ((mes == 3) || (mes == 4) || (mes == 5)) {
                if ((mes == 3) && (dia < 20)) {
                    System.out.println("Verão");
                } else {
                    System.out.println("Outono");
                }
            } else if ((mes == 6) || (mes == 7) || (mes == 8)) {
                if ((mes == 6) && (dia < 21)) {
                    System.out.println("Outono");
                } else {
                    System.out.println("Inverno");
                }
            } else if ((mes == 9) || (mes == 10) || (mes == 11)) {
                if ((mes == 9) && (dia < 23)) {
                    System.out.println("inverno");
                } else {
                    System.out.println("Primavera");
                }
            } else if ((mes == 12) || (mes == 1) || (mes == 2)) {
                if ((mes == 12) && (dia < 22)) {
                    System.out.println("Primavera");
                } else {
                    System.out.println("Verão");
                }
            }
        } else {
            System.out.println("Dia ou Mês Invalido!!!");
        }
        
    }
    
}
