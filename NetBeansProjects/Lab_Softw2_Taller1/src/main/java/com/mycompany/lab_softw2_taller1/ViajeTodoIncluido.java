/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_softw2_taller1;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeTodoIncluido extends Viaje{

    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return  "Disfruta tu viaje todo incluido";
    }
//No se sobreescribe cualquierMetodo2()
}
