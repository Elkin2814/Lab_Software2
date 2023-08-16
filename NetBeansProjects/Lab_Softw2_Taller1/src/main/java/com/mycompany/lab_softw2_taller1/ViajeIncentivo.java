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
public class ViajeIncentivo extends Viaje{

    private String empresa;

    public ViajeIncentivo(String empresa, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    public ViajeIncentivo(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa "+ empresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
