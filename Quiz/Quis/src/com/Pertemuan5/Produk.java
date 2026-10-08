package com.Pertemuan5;
abstract class Produk {
    // Abstract method (tanpa isi)
    abstract void hitungHarga();

    // Method main di dalam class Produk (sesuai nama file Produk.java)
    public static void main(String[] args) {
        Makanan makanan = new Makanan();
        makanan.hitungHarga();
    }
}

class Makanan extends Produk {
    @Override
    void hitungHarga() {
        System.out.println("Harga makanan: Rp25000");
    }
}