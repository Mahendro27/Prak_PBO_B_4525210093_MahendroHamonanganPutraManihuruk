package com.overriding;

public class Main {
    public static void main(String[] args) {
     
        Kucing kucing = new Kucing();
        kucing.suara();

        Bebek bebek = new Bebek();
        bebek.suara();

        Harimau harimau = new Harimau();
        harimau.suara();

    }
    
}
