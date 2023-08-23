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
public class ViajeTodoIncluidoTest {
    
    public ViajeTodoIncluidoTest() {
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

    /*
    PRUEBAS UNITARIAS DE LA CLASE VIAJETODOINCLUIDO
    */

    //TEST PARA VALIDAR METODO DESCRIPCION
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        ViajeTodoIncluido instance = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        String expResult = "Disfruta tu viaje todo incluido";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }
    
}
