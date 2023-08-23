/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_softw2_taller1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elkin
 */
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testGetFamilia() throws ParseException {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar(6, "Pasto", "Cartagena", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2023"));
        int expResult = 6;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testSetFamilia() throws ParseException {
        System.out.println("setFamilia");
        int familia = 6;
        ViajeFamiliar instance = new ViajeFamiliar(0, "Pasto", "Cartagena", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2023"));
        instance.setFamilia(familia);
        
        int nuevaFamilia = instance.getFamilia(); 

        assertEquals(familia, nuevaFamilia); 
    }

    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar(6, "Pasto", "Cartagena", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2023"));
        
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeFamiliar.
     */
    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = new ViajeFamiliar(6, "Pasto", "Cartagena", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2023"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2023"));
        
        String expResult = "Método implementado en la clase hija viaje familiar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
