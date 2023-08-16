/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lab_softw2_taller1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INGESIS
 */
public class Lab_Softw2_Taller1 {

    public static List<Viaje> viajes = new ArrayList();

    public static void main(String[] args) {
            leerViajes();
    }

    public static void leerViajes() {
        try {
            Viaje viaje1 = new ViajeFamiliar(5, "Popayán", "Bogotá", 1250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
            viajes.add(viaje1);
            
            Viaje viaje2 = new ViajeIncentivo( "Emtel", "Popayán", "Medellin", 2100000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
            viajes.add(viaje2);
                
            Viaje viaje3 = new ViajeIndividual("Telecom","Popayán", "San Andres", 4250000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);

            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, 
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), 
            new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);

        } catch (ParseException ex) {
            Logger.getLogger(Lab_Softw2_Taller1.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
