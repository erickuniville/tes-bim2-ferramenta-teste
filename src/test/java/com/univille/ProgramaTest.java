package com.univille;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProgramaTest {
    private Programa programa = new Programa();


    @Test
    public void testEhPositivo() {
        assertTrue(programa.ehPositivo(10));
    }

    @Test
    public void testZeroEhPositivo() {
        assertTrue(programa.ehPositivo(0));
    }

    @Test
    public void testMenorQueZeroEhPositivo() {
        assertFalse(programa.ehPositivo(-9));
    }





}







