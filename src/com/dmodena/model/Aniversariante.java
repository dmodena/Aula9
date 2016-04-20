/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import com.dmodena.helper.DateTimeOffset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dmodena
 */
public class Aniversariante {
    private final DateTimeOffset proximoAniversario;
    
    public Aniversariante(String proximoAniversario) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date aux = df.parse(proximoAniversario);
        this.proximoAniversario = new DateTimeOffset(aux.getTime());
    }

    public Date getProximoAniversario() {
        return proximoAniversario;
    }
    
    public long getTempoProximoAniversario() {
        return proximoAniversario.getTime() - new Date().getTime();
    }
    
    public String getStringTempoProximoAniversario() {
        String saida = "Próximo aniversário em: ";
        
        DateTimeOffset a = new DateTimeOffset(getTempoProximoAniversario());
        
        if(a.getYears() > 0) {
            if(a.getYears() > 1)
                saida += a.getYears() + " anos ";
            else
                saida += a.getYears() + " ano ";
        }
        
        if(a.getMonths() > 0) {
            if(a.getMonths() > 1)
                saida += a.getMonths() + " meses ";
            else
                saida += a.getMonths() + " mês ";
        }
        
        if(a.getDays() > 0) {
            
            if(a.getDays() > 1)
                saida += a.getDays() + " dias ";
            else
                saida += a.getDays() + " dia ";
        }
        
        if(a.getHours() > 0) {
            if(a.getHours() > 1)
                saida += a.getHours() + " horas ";
            else
                saida += a.getHours() + " hora ";
        }
        
        if(a.getMinutes() > 0) {
            if(a.getMinutes() > 1)
                saida += a.getMinutes() + " minutos ";
            else
                saida += a.getMinutes() + " minuto ";
        }
        
        if(a.getSeconds() > 0) {
            if(a.getSeconds() > 1)
                saida += a.getSeconds() + " segundos ";
            else
                saida += a.getSeconds() + " segundo ";
        }
        
        return saida;           
    }
}
