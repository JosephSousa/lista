package com.josephsousa.questao4;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class CalculaIdadeEmHoras {
    
    private final int dias=365;
    private final int horas= 24;
    
    public int calcularIdadeEmHoras(int idade){
        return idade*dias*horas;
    }
}
