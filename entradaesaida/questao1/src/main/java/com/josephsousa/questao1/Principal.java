package com.josephsousa.questao1;

import java.util.Scanner;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 * 
 * Classe principal que recebe dois números digitados pelo usuário que deverão ser multiplicados
 */
public class Principal {
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero da multiplicação");
        double termo1=scan.nextDouble();
        System.out.println("digite o segundo número da multiplicação");
        double termo2=scan.nextDouble();
        
        CalculaProduto calculadoraProduto= new CalculaProduto();
        
        double produto=calculadoraProduto.calcularProduto(termo1, termo2);
        
        System.out.println("o produto de "+termo1+" e "+termo2+" é: "+produto);
    }
        
}
