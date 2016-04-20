/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.helper;

import java.util.Date;

/**
 *
 * @author dmodena
 */
public class DateTimeOffset extends Date {   
    private final long miliseconds;
    public static final long MILISECONDS_IN_A_YEAR = 31536000000l;
    public static final long MILISECONDS_IN_A_MONTH = 2592000000l;
    public static final int MILISECONDS_IN_A_DAY = 86400000;
    public static final int MILISECONDS_IN_AN_HOUR = 3600000;
    public static final int MILISECONDS_IN_A_MINUTE = 60000;
    public static final int MILISECONDS_IN_A_SECOND = 1000;
    
    
    public DateTimeOffset(long miliseconds) {
        super(miliseconds);
        this.miliseconds = miliseconds;
    }
    
    public long getTotalYears() {
        return getTotalDays() / 365;
    }
    
    public long getYears() {
        return miliseconds / MILISECONDS_IN_A_YEAR;
    }
    
    public long getTotalMonths() {
        return getTotalDays() / 30;
    }
    
    public long getMonths() {        
        long aux = 0;
        
        if(miliseconds >= MILISECONDS_IN_A_YEAR)
            aux = miliseconds % MILISECONDS_IN_A_YEAR;
        if(aux == 0)
            aux = miliseconds;
        
        return aux / MILISECONDS_IN_A_MONTH;
    }
    
    public long getTotalDays() {
        return getTotalHours() / 24;
    }
    
    public long getDays() {
        long aux = 0;
        
        if(miliseconds >= MILISECONDS_IN_A_YEAR)
            aux = miliseconds % MILISECONDS_IN_A_YEAR;
        if(miliseconds >= MILISECONDS_IN_A_MONTH)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_MONTH : aux % MILISECONDS_IN_A_MONTH);
        if(aux == 0)
            aux = miliseconds;
        
        return aux / MILISECONDS_IN_A_DAY;
    }
    
    public long getTotalHours() {
        return getTotalMinutes() / 60;
    }
    
    @Override
    public int getHours() {
        long aux = 0;
        
        if(miliseconds >= MILISECONDS_IN_A_YEAR)
            aux = miliseconds % MILISECONDS_IN_A_YEAR;
        if(miliseconds >= MILISECONDS_IN_A_MONTH)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_MONTH : aux % MILISECONDS_IN_A_MONTH);
        if(miliseconds >= MILISECONDS_IN_A_DAY)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_DAY : aux % MILISECONDS_IN_A_DAY);
        if(aux == 0)
            aux = miliseconds;
        
        return (int) aux / MILISECONDS_IN_AN_HOUR;
    }
    
    public long getTotalMinutes() {
        return getTotalSeconds() / 60;
    }
    
    @Override
    public int getMinutes() {
        long aux = 0;
        
        if(miliseconds >= MILISECONDS_IN_A_YEAR)
            aux = miliseconds % MILISECONDS_IN_A_YEAR;
        if(miliseconds >= MILISECONDS_IN_A_MONTH)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_MONTH : aux % MILISECONDS_IN_A_MONTH);
        if(miliseconds >= MILISECONDS_IN_A_DAY)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_DAY : aux % MILISECONDS_IN_A_DAY);
        if(miliseconds >= MILISECONDS_IN_AN_HOUR)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_AN_HOUR : aux % MILISECONDS_IN_AN_HOUR);
        if(aux == 0)
            aux = miliseconds;
        
        return (int) aux / MILISECONDS_IN_A_MINUTE;
    }
    
    public long getTotalSeconds() {
        return miliseconds / 1000;
    }
    
    @Override
    public int getSeconds() {
        long aux = 0;
        
        if(miliseconds >= MILISECONDS_IN_A_YEAR)
            aux = miliseconds % MILISECONDS_IN_A_YEAR;
        if(miliseconds >= MILISECONDS_IN_A_MONTH)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_MONTH : aux % MILISECONDS_IN_A_MONTH);
        if(miliseconds >= MILISECONDS_IN_A_DAY)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_DAY : aux % MILISECONDS_IN_A_DAY);
        if(miliseconds >= MILISECONDS_IN_AN_HOUR)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_AN_HOUR : aux % MILISECONDS_IN_AN_HOUR);
        if(miliseconds >= MILISECONDS_IN_A_MINUTE)
            aux = (aux == 0 ? miliseconds % MILISECONDS_IN_A_MINUTE : aux % MILISECONDS_IN_A_MINUTE);
        if(aux == 0)
            aux = miliseconds;
        
        return (int) aux / MILISECONDS_IN_A_SECOND;
    }
}
