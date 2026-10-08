package com.contoh1;

import java.util.ArrayList;

public class Dokter {
    private String nama;

    // atribut bertipe class lain (sisi "many" -> ArrayList)
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Membuat hubungan Dokter -> Pasien
    public void tambahPasien(Pasien p) {
        if (!daftarPasien.contains(p)) { // cegah rekursi tak berhingga
            daftarPasien.add(p);
            p.tambahDokter(this);        // sinkronkan sisi sebaliknya
        }
    }

    // Pasien hanya parameter -> dependency (sementara)
    public void periksa(Pasien pasien) {
        System.out.println("Dokter " + nama + " sedang memeriksa pasien " + pasien.getNama());
    }

    public void tampilkanPasien() {
        System.out.println("Pasien dr. " + nama + ":");
        for (Pasien p : daftarPasien) {
            System.out.println("- " + p.getNama());
        }
    }
}