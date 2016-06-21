/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author dmodena
 */
public class Trabalho {
    private final Date dataLimite;
    
    public Trabalho() {
        Calendar agora = Calendar.getInstance();
        GregorianCalendar hoje = new GregorianCalendar(agora.YEAR, agora.MONTH, agora.DAY_OF_MONTH, 23, 59, 59);
        dataLimite = hoje.getTime();
    }
    
    public Date getDataLimite() {
        return dataLimite;
    }
    
    public String enviar(String strEntrega) throws ParseException {
        String mensagem;
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date entrega = df.parse(strEntrega);
        
        if(entrega.after(dataLimite))
            mensagem = "O trabalho foi entregue com atraso!";
        else
            mensagem = "Trabalho entregue a tempo!";
        
        return mensagem;
    }
}
