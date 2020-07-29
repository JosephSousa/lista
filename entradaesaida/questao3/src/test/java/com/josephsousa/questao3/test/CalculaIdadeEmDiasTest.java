package com.josephsousa.questao3.test;

import com.josephsousa.questao3.CalculaIdadeEmDias;
import junit.framework.TestCase;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class CalculaIdadeEmDiasTest extends TestCase{
      CalculaIdadeEmDias calc= new CalculaIdadeEmDias();
    public void testeCalcularIdadeEmDias(){
        assertEquals(9125, calc.calcularIdadeEmDias(25));
    }
}
