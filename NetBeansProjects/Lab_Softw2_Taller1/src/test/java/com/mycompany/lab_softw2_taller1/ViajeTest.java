/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_softw2_taller1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ViajeTest {
    
    public ViajeTest() {
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
     * Test of descripcion method, of class Viaje.
     */
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        String empresa = "Emtel";
        Viaje instance = new ViajeIncentivo(empresa, "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        String expResult = "Viaje incentivo que te envia la empresa " + empresa;
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeImpl();
        String expResult = "Cualquier método implementado en la clase base";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = new ViajeImpl();
        String expResult = "Cualquier método2 implementado en la clase base";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigen method, of class Viaje.
     */
    @Test
    public void testGetAndSetOrigen() {
        System.out.println("GetAndSetOrigen");
        Viaje instance = new ViajeImpl();
        String origen = "Carrusal";
        instance.setOrigen(origen);
        String obtenidoOrigen = instance.getOrigen();
        assertEquals(origen, obtenidoOrigen);
    }
    /**
     * Test of getDestino method, of class Viaje.
     */
    @Test
    public void testGetAndSetDestino() {
        System.out.println("GetAndSetDestino");
        Viaje instance = new ViajeImpl();
        String destino = "Nueva Zelanda";
        instance.setDestino(destino);
        String obtenidoDestino = instance.getDestino();
        assertEquals(destino, obtenidoDestino);
    }

    @Test
    public void testGetAndSetCosto() {
        System.out.println("GetAndSetCosto");
        Viaje instance = new ViajeImpl();
        int costo = 1500000;
        instance.setCosto(costo);
        int obtenidoCosto = instance.getCosto();
        assertEquals(costo, obtenidoCosto);
    }

    @Test
    public void testGetAndSetFechaSalida() throws ParseException {
        System.out.println("GetAndSetFechaSalida");
        Viaje instance = new ViajeImpl();
        Date nuevaFechaSalida = new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2023");
        instance.setFechaSalida(nuevaFechaSalida);
        Date viejaFechaSalida = instance.getFechaSalida();
        assertEquals(nuevaFechaSalida, viejaFechaSalida);
    }

    @Test
    public void testGetAndSetFechaLlegada() throws ParseException {
        System.out.println("GetAndSetFechaLlegada");
        Viaje instance = new ViajeImpl();
        Date nuevaFechaLlegada = new SimpleDateFormat("dd/MM/yyyy").parse("15/09/2023");
        instance.setFechaLlegada(nuevaFechaLlegada);
        Date viejaFechaLlegada = instance.getFechaLlegada();
        assertEquals(nuevaFechaLlegada, viejaFechaLlegada);
    }

    public class ViajeImpl extends Viaje {

        public String descripcion() {
            return "";
        }
    }
    
}
