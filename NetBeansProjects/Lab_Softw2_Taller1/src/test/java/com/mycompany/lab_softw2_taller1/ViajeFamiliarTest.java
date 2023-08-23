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
    
    /*
    PRUEBAS UNITARIAS DE VIAJE
    */
    
    //TEST PARA VALIDAR LOS GETTERS Y SETTERS
    
    //TEST PARA DESTINO
    @Test
    public void testGetAndSetDestino(){
        System.out.println("getOrigen");
        String destino = "Manizales";
        Viaje instance = new ViajeFamiliar();
        instance.setDestino(destino);
        String result = instance.getDestino();
        assertEquals(destino, result);
    }
    
    //TEST PARA ORIGEN
    @Test
    public void testGetAndSetOrigen(){
        System.out.println("getOrigen");
        String origen = "Pasto";
        Viaje instance = new ViajeFamiliar();
        instance.setOrigen(origen);
        String result = instance.getOrigen();
        assertEquals(origen, result);
    }
    
    //TEST PARA COSTO
    @Test
    public void testGetAndSetCosto() {
        System.out.println("GetAndSetCosto");
        Viaje instance = new ViajeFamiliar();
        int costo = 1500000;
        instance.setCosto(costo);
        int obtenidoCosto = instance.getCosto();
        assertEquals(costo, obtenidoCosto);
    }
    
    //TEST PARA VFECHA DE SALIDA
     @Test
    public void testGetAndSetFechaSalida() throws ParseException {
        System.out.println("GetAndSetFechaSalida");
        Viaje instance = new ViajeFamiliar();
        Date nuevaFechaSalida = new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2023");
        instance.setFechaSalida(nuevaFechaSalida);
        Date viejaFechaSalida = instance.getFechaSalida();
        assertEquals(nuevaFechaSalida, viejaFechaSalida);
    }
    
    //TEST PARA VFECHA DE LLEGADA
     @Test
    public void testGetAndSetFechaLlegada() throws ParseException {
        System.out.println("GetAndSetFechaLlegada");
        Viaje instance = new ViajeFamiliar();
        Date nuevaFechaLlegada = new SimpleDateFormat("dd/MM/yyyy").parse("15/09/2023");
        instance.setFechaLlegada(nuevaFechaLlegada);
        Date viejaFechaLlegada = instance.getFechaLlegada();
        assertEquals(nuevaFechaLlegada, viejaFechaLlegada);
    }
    
    //TEST PARA METODO CUALQUIERMETODO DE CLASE VIAJE
      @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeFamiliar();
        String expResult = "Cualquier método implementado en la clase base";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
    }
    
    /*
    PRUEBAS UNITARIAS DE LA CLASE VIAJEFAMILIAR
    */

    //TEST PARA VALIDAR LOS GETTERS Y SETTERS
    
    //TEST PARA GET FAMILIA
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

    //TEST PARA SET FAMILIA
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
    
    //TEST PARA METODO DESCRIPCION
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

    //TEST PARA METODO CUALQUIERMETODO2
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
