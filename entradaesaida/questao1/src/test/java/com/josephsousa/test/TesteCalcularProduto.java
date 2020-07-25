package com.josephsousa.test;

import com.josephsousa.questao1.CalculaProduto;
import junit.framework.*;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class TesteCalcularProduto extends TestCase {
    
    private CalculaProduto calc= new CalculaProduto();
    
    public void testProduto() {
        assertEquals(300, calc.calcularProduto(10, 30), 0);
    }
}
