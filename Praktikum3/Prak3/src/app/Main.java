package app;

public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan Ridho = new Karyawan("12345", "Ridho");
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        System.out.println();

        Karyawan Melan = new Karyawan("12346", "Melan");
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        System.out.println();

        Dosen Andiani = new Dosen("23455", "Andiani", "332211");
        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.mengajar();
        Andiani.absenPulang();

        System.out.println();

        Dosen Ionia = new Dosen("23456", "Ionia", "332212");
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.mengajar();
        Ionia.absenPulang();
    }
}