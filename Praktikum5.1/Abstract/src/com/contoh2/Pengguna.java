package com.contoh2;

public class Pengguna {
    private Handphone phone;

    public Pengguna(Handphone phone){
        this.phone = phone;
    }

    void nyalakanHP(){
        this.phone.nyalakan();
    }

    void matikanHP(){
        this.phone.matikan();
    }

    void besarkanSuaraHP(){
        this.phone.besarkanSuara();
    }

    void kecilkanSuaraHP(){
        this.phone.kecilkanSuara();
    }
}