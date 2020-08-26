package com.company;


import java.util.Arrays;

public class Generic<T> {
T ts[];
    public Generic(T[] ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return ""+ Arrays.toString(ts) ;
    }
    
}
