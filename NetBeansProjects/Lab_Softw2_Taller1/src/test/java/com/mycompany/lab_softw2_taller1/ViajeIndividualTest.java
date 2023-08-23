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
public class ViajeIndividualTest {
    
    public ViajeIndividualTest() {
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
     * Test of getEmpresa method, of class ViajeIndividual.
     */
    @Test
    public void testGetEmpresa() throws ParseException {
        System.out.println("getEmpresa");
        String empresa = "Telecom";
        ViajeIndividual instance = new ViajeIndividual(empresa, "Popayán", "San Andres", 4250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        String expResult = empresa;
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpresa method, of class ViajeIndividual.
     */
    @Test
   public void testSetEmpresa() throws ParseException {
        System.out.println("setEmpresa");
        String empresa = "Telecom";
        ViajeIndividual instance = new ViajeIndividual("Disney", "Popayán", "San Andres", 4250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        instance.setEmpresa(empresa);
        String result = instance.getEmpresa();
        assertEquals(empresa, result);
    }

    /**
     * Test of descripcion method, of class ViajeIndividual.
     */
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        String empresa = "Telecom";
        ViajeIndividual instance = new ViajeIndividual(empresa, "Popayán", "San Andres", 4250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        String expResult = "Viaje incentivo que te envia la empresa" + empresa;
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIndividual.
     */
    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
        String empresa = "Telecom";
        ViajeIndividual instance = new ViajeIndividual(empresa, "Popayán", "San Andres", 4250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        String expResult = "Método implementado en la clase hija viaje de incentivo";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
