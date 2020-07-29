package com.josephsousa.questao4;

import java.util.Scanner;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("digite a idade que deseja converter para horas");
        int idade= scan.nextInt();
        
        CalculaIdadeEmHoras calculadoraDeIdadeEmHoras= new CalculaIdadeEmHoras();
        System.out.println("a idade: "+ idade+" em horas é: "+
                calculadoraDeIdadeEmHoras.calcularIdadeEmHoras(idade));
    }
}
