package com.josephsousa.questao3;

import java.util.Scanner;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("digite a idade que deseja converter para dias");
        int idade= scan.nextInt();
        
        CalculaIdadeEmDias calculadoraDeIdadeEmDias= new CalculaIdadeEmDias();
        System.out.println("a idade: "+ idade+" em dias é: "+
                calculadoraDeIdadeEmDias.calcularIdadeEmDias(idade));
    }
}
