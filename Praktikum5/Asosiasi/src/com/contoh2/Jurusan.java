package com.contoh2;

import java.util.ArrayList;

// hanya MENYIMPAN referensi Pengajar, tidak membuatnya
public class Jurusan {
    private String nama;

    // Agregasi: atribut berisi objek yang dibuat dari luar
    private ArrayList<Pengajar> daftarPengajar = new ArrayList<>();

    public Jurusan(String nama) {
        this.nama = nama;
    }

    // Objek Pengajar diterima dari luar (bukan new di sini) -> ciri agregasi
    public void tambahPengajar(Pengajar p) {
        daftarPengajar.add(p);
    }

    public void tampilkan() {
        System.out.println("Jurusan " + nama);
        for (Pengajar p : daftarPengajar) {
            System.out.println("- " + p.getNama());
        }
    }
}