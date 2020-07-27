package com.josephsousa.test;

import com.josephsousa.questao2.CalculaRaiz;
import junit.framework.TestCase;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class TesteCalcularRaizQuadrada extends TestCase{
    
    private CalculaRaiz calc = new CalculaRaiz();
    
    public void testaCalculoRaizQuadrada(){
        assertEquals(3.0, calc.calcularRaizQuadrada(9));
    }
}
