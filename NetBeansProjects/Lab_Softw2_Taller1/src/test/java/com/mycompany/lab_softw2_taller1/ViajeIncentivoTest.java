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
public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
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
     * Test of getEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testGetEmpresa() throws ParseException {
        System.out.println("getEmpresa");
        ViajeIncentivo instance = new ViajeIncentivo( "Emtel", "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        String expResult = "Emtel";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testSetEmpresa() throws ParseException {
        System.out.println("setEmpresa");
        String empresa = "Emtel";
        ViajeIncentivo instance = new ViajeIncentivo(empresa, "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        instance.setEmpresa(empresa);
        String result = instance.getEmpresa();
        assertEquals(empresa, result);
    }

    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        String empresa = "Emtel";
        ViajeIncentivo instance = new ViajeIncentivo(empresa, "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        String expResult = "Viaje incentivo que te envia la empresa " + empresa;
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = new ViajeIncentivo("Emtel", "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        String expResult = "Método implementado en la clase hija viaje de incentivo";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
