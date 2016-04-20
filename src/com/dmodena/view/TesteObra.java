/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import java.text.DateFormat;
import com.dmodena.model.Obra;

/**
 *
 * @author dmodena
 */
public class TesteObra {
    public static void main(String[] Args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Obra obra = new Obra(160);
        
        System.out.println("Dias de trabalho para finalizar a obra: " + obra.getDiasNecessarios());
        System.out.println("Data de início da obra: " + df.format(obra.getDataInicio()));
        System.out.println("Data de entrega da obra: " + df.format(obra.getDataEntrega()));
    }
}
