package com.contoh2;

public class Main {
    public static void main(String[] args) {
        // 1. Pengajar dibuat terlebih dahulu (bisa berdiri sendiri)
        Pengajar p1 = new Pengajar("Dosen Mahendro Hamonangan");
        Pengajar p2 = new Pengajar("Dosen Faisal Attalah");

        // 2. Membuat objek Jurusan
        Jurusan ti = new Jurusan("Teknik Informatika");

        // 3. Menambahkan referensi Pengajar ke Jurusan (Agregasi)
        ti.tambahPengajar(p1);
        ti.tambahPengajar(p2);

        // Menampilkan daftar pengajar dalam jurusan
        ti.tampilkan();

        // 4. Jurusan dibubarkan / dihapus
        ti = null;

        // 5. Pengajar tetap ada dan dapat dipanggil meski Jurusan sudah dihapus
        System.out.println("Nama Pengajar 1: " + p1.getNama());
    }
}