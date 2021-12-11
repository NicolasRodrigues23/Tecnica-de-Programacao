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
public class CalcJuros {
    
    public static void main(String[] args) {
        
        //Declaração de Variaveis
        double c, i, t, j;
        
        //Criação e Instancia do Objeto de Entrada
        Scanner entrada = new Scanner(System.in);
        
        //apresentação
        System.out.println("\n\t\t -- Calculadora de Juros -- \n");
        
        //Calculo de Juros
        System.out.println("\tCalculo de Juros: ");
        
        //entrada
        System.out.print("Informe o Capital(Valor do Emprestimo): ");
        c = entrada.nextDouble();
        System.out.print("Informe a Taxa de Juros(sem %): ");
        i = entrada.nextDouble();
        System.out.print("informe o Periodo de Aplicação(meses): ");
        t = entrada.nextDouble();
        
        //processamento
        j = t * (c * i / 100);
        
        //saida
        System.out.println("\n\t  -- O juros será de: " + j + " --\t\n");
        
    }
    
}
