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
public class CalcSimples {
    
    public static void main(String[] args) {
        
        //Declaração de Variaveis
        int num1, num2, total;
        
        //Criação e Instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        
        //Menu
        System.out.println("[1]. Soma");
        System.out.println("[2]. Subtração");
        System.out.println("[3]. Multiplicação");
        System.out.println("[4]. Divisão");
        System.out.println("[5]. Resto inteiro da divisão");
        
        //Opção do usuário
        System.out.print("\nOpção: ");
        int op = entrada.nextInt();
        
        if (op == 1) {
            
            //Soma
            System.out.println("\tSoma Simples: ");

            //Entrada
            System.out.print("Informe um número: ");
            num1 = entrada.nextInt();
            System.out.print("Iforme outo número: ");
            num2 = entrada.nextInt();

            //Processamento
            total = num1 + num2;

            //Saida
            System.out.printf("\n\t %d + %d = %d", num1, num2, total);
        } else if (op == 2) {
            
            //subtração
            System.out.println("\n\tSubtração Simples: ");

            //Entrada
            System.out.print("Informe o número total: ");
            num1 = entrada.nextInt();
            System.out.print("Iforme outro número: ");
            num2 = entrada.nextInt();

            //Processamento
            total = num1 - num2;

            //Saida
            System.out.printf("\n\t %d - %d = %d", num1, num2, total);
        } else if (op == 3) {
                   
            // Multiplicação
            System.out.println("\n\tMultiplicação Simples: ");

            //Entradas
            System.out.print("\n\tInforme um número: ");
            num1= entrada.nextInt();
            System.out.print("\n\tInforme outro número: ");
            num2= entrada.nextInt();

            //Processamentos
            total = num1  * num2;

            //Saídas
            System.out.printf("\n\t %d * %d = %d\n\t", num1, num2, total); 
        } else if (op == 4) {
            
            // Divisão
            System.out.println("\n\tDivisão simples: ");

            //Entradas
            System.out.print("\n\tInforme um número: ");
            num1= entrada.nextInt();
            System.out.print("\n\tInforme outro número: ");
            num2= entrada.nextInt();

            //Processamentos
            total = num1  / num2;

            //Saídas
            System.out.printf("\n\t %d / %d = %d\n\t", num1, num2, total); 
        } else if (op == 5) {
            
            // Resto da divisão
            System.out.println("\n\tResto simples: ");

            //Entradas
            System.out.print("\n\tInforme um número: ");
            num1= entrada.nextInt();
            System.out.print("\n\tInforme outro número: ");
            num2= entrada.nextInt();

            //Processamentos
            total = num1  % num2;

            //Saídas
            System.out.printf("\n\t %d  %d = %d\n\t", num1, num2, total);
        }
    }
    
}
