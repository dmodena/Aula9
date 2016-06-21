/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Trabalho;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dmodena
 */
public class TesteTrabalho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        Trabalho t = new Trabalho();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(t.getDataLimite()));
        Date d = new Date();
        System.out.println(df.format(t.getDataLimite()));
        
        try {
            System.out.print("Digite a data de entrega do seu trabalho: ");
            String strData = sc.nextLine();
            System.out.println(t.enviar(strData));
        }
        catch(ParseException ex) {
            System.out.println("Data incorreta!");
        }
    }
}
