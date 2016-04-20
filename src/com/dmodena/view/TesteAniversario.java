/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import java.util.Scanner;
import com.dmodena.model.Aniversariante;
import java.text.ParseException;

/**
 *
 * @author dmodena
 */
public class TesteAniversario {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a data do seu próximo aniversário(dd/mm/yyyy): ");
        String strData = sc.nextLine();
        
        try {
            Aniversariante a = new Aniversariante(strData);  
            System.out.print(a.getStringTempoProximoAniversario());
        }
        catch(ParseException ex) {
            System.out.println("Data Inválida!");
        }
    }
}
