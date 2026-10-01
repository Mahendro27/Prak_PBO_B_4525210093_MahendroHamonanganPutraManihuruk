package com.univ;

public class Main {
    public static void main(String[] args) {
        // Objek pertama: Diana
        Mahasiswa diana = new Mahasiswa(
            "4524210093",
            "Mahendro",
            "Hendro",
            "27 Juli 2006",
            "Jl. Cendana No.12",
            22,
            "Teknik Informatika" // Tambahan nilai prodi
        );

        // Objek kedua: David
        Mahasiswa david = new Mahasiswa(
            "4524210002",
            "David",
            "Saputra",
            "10 Mei 2001",
            "Jl. Melati No.8",
            23,
            "Sistem Informasi" // Tambahan nilai prodi
        );

        // Tampilkan info
        diana.displayInfo();
        david.displayInfo();

        // Panggil method belajar dan ujian
        diana.belajar();
        david.ujian();
    }
}