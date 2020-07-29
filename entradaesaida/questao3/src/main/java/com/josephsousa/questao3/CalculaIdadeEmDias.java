package com.josephsousa.questao3;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 * Faça um programa para calcular a idade de uma pessoa em dias, dado o 
 * número de anos. O número de anos deve ser lido do teclado. Considere 1 ano = 365 dias.
 */

public class CalculaIdadeEmDias {
    
    private final int dias=365;
    
    public int calcularIdadeEmDias(int idade){
        return idade*dias;
    }
}
