package com.josephsousa.questao2;

import java.util.Scanner;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o número que deseja calcular a raiz quadrada");
        double numero= scan.nextDouble();
        
        CalculaRaiz calculadora=new CalculaRaiz();
        System.out.println("A raiz quadrada é: "
                + calculadora.calcularRaizQuadrada(numero));
        
    }
    
}
