package com.contoh2;

public interface Handphone {
    int MAX_VOLUME = 100; // batas volume maksimum
    int MIN_VOLUME = 0;   // batas volume minimum

    void nyalakan();
    void matikan();
    void besarkanSuara();
    void kecilkanSuara();
}