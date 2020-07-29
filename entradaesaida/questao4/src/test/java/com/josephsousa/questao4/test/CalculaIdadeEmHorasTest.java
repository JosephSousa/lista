package com.josephsousa.questao4.test;

import com.josephsousa.questao4.CalculaIdadeEmHoras;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Joseph
 * @Email jsantos.te@gmail.com
 */
public class CalculaIdadeEmHorasTest extends TestCase{
    
    private CalculaIdadeEmHoras calc = new CalculaIdadeEmHoras();
    
    
    public void calcularIdadeEmHorasTest(){
         assertEquals(219000, calc.calcularIdadeEmHoras(25), 0);
    }
}
