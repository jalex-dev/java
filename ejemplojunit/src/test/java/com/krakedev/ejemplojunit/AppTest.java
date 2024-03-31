package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void TestSumar() {
    	Calculadora c= new Calculadora();
    	int resultado =c.sumar(5, 10);
    	assertTrue(resultado==15);
    }
    @Test
    public void TestRestar() {
    	Calculadora c= new Calculadora();
    	int resultado =c.restar(20, 10);
    	assertTrue(resultado==10);
    }
    
    

}
