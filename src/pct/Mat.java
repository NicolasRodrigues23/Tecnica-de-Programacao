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
public class Mat {
    
    public static void main(String[] args) {
        //Variaveis
        int op;
        
        //criação e instancia do objeto de entrada
        Scanner entrada = new  Scanner(System.in);
        
        do{            
            
            //menu
            System.out.println("\n\t\t--SISTEMA MATEMÁTICO--");
            System.out.println("[1]. Fatorial");
            System.out.println("[2]. Média");
            System.out.println("[3]. Sair");

            //opção
            System.out.print("\n\nEscolha uma Opção: ");
            op = entrada.nextInt();

            switch(op){
                case 1:
                    //variaveis
                    int n;
                    double fat = 1;
                    
                    //fatorial
                    System.out.println("\n\t\t--FATORIAL--");
                    
                    //entrada
                    System.out.print("Informe o numero desejado: ");
                    n = entrada.nextInt();
                    
                    //processamento
                    for(int i = n; i >= 1; i--){
                        fat *= i;
                    }
                    
                    //saída
                    System.out.printf("%d! = %f", n, fat);
                    
                    break;

                case 2:
                    //media
                    System.out.println("\n\t\t--MEDIA--");
                    
                    //declaração de variaveis
                    int num;
                    int[] x;
                    double soma = 0, media;
                    
                    //entrada
                    System.out.print("\nInforme a quantidade de números: ");
                    num = entrada.nextInt();
                    
                    x = new int[num];
                    
                    for(int i = 0; i < num; i++){
                        System.out.printf("\nInforme o número %d: ", i+1);
                        x[i] = entrada.nextInt();
                    }
                    
                    //processamento
                    for(int m: x){
                        soma += m;
                    }
                    
                    media = soma/x.length;
                    
                    //saida
                    System.out.println("A média de");
                    for(int m: x){
                        System.out.printf(" %d", m);
                    }
                    System.out.printf(" é: %.2f", media);
                    
                    break;
                case 3:
                    //sair
                    System.out.println("Abraço!!!");

                    break;
                default:
                    System.out.printf("Opção %d incorreta!", op);
            }
        } while (op != 3);
    }
    
}
