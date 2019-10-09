package meyerspil;

import java.util.Random;

public class Terning {
    private final int SIDER = 6;
    private int antalØjne; 
    Random rand = new Random(); 
    
    
    public Terning() {
        kast(); 
        
    }
    
    public void  kast () {
        antalØjne = rand.nextInt((SIDER))+1; 
    }

    public int getAntalØjne() {
        return antalØjne;
    }
    public String toString () {
        return "Terningen viser " + antalØjne; 
    }
    
}

