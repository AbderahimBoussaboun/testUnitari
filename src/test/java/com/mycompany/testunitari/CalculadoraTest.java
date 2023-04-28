
package com.mycompany.testunitari;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    } 
    


    @Test
    public void testMultiplicacio() {
        Calculadora calculadora =new Calculadora (72,89);
        int expected=6408;
        int result=calculadora.multiplicacio();
        assertEquals(expected,result);
    }
    
}
