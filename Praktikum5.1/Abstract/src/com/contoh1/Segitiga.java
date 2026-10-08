package com.contoh1;

class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public void luas() {
        float luas;

        luas = (float) ((this.alas * this.tinggi)/2);

        System.out.println("Luas lingkaran: " + luas);
    }
}