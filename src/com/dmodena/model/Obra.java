/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author dmodena
 */
public class Obra {
    private final GregorianCalendar dataInicio;
    private final int diasNecessarios;
    
    public Obra(int diasNecessarios) {
        this.diasNecessarios = diasNecessarios;
        dataInicio = new GregorianCalendar();
    }
    
    public int getDiasNecessarios() {
        return diasNecessarios;
    }
    
    public Date getDataEntrega() {
        GregorianCalendar dataAux = new GregorianCalendar();
        
        for(int i = 1; i < diasNecessarios; i++) {
            dataAux.add(GregorianCalendar.DAY_OF_MONTH, 1);
            if(dataAux.get(GregorianCalendar.DAY_OF_WEEK) == 1)
                dataAux.add(GregorianCalendar.DAY_OF_MONTH, 1);
        }
        
        return new Date(dataAux.getTimeInMillis());        
    }
    
    public Date getDataInicio() {
        return new Date(dataInicio.getTimeInMillis());
    }
}
