package com.contoh1;

import java.util.ArrayList;

public class Pasien {
    private String nama;

    // Asosiasi dua arah: Pasien juga mengenal Dokter
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Membuat hubungan Pasien -> Dokter
    public void tambahDokter(Dokter d) {
        if (!daftarDokter.contains(d)) { // cegah rekursi tak berhingga
            daftarDokter.add(d);
            d.tambahPasien(this);        // sinkronkan sisi sebaliknya
        }
    }

    public void tampilkanDokter() {
        System.out.println("Dokter yang menangani " + nama + ":");
        for (Dokter d : daftarDokter) {
            System.out.println("- " + d.getNama());
        }
    }
}
