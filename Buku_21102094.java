package com.maulana_rafi.pbo.prjRelasiKelas;

import java.util.ArrayList;
import java.util.List;

public class Buku_21102094 {
    private String isbn_21102094;
    private String judul_21102094;
    private List<Pengarang_21102094> pengarang_21102094;

    public Buku_21102094(String isbn_21102094, String judul_21102094) {
        this.isbn_21102094 = isbn_21102094;
        this.judul_21102094 = judul_21102094;
        this.pengarang_21102094 = new ArrayList<>();
    }

    public void tambahPengarang_21102094(Pengarang_21102094 pengarang) {
        pengarang_21102094.add(pengarang);
    }

    public void tampilBuku_21102094() {
        System.out.println("ISBN : " + isbn_21102094);
        System.out.println("Judul : " + judul_21102094);
        System.out.println("Jumlah Pengarang : " + pengarang_21102094.size());
    }

    public void tampilPengarang_21102094() {
        for (int i = 0; i < pengarang_21102094.size(); i++) {
            Pengarang_21102094 pengarang = pengarang_21102094.get(i);
            System.out.println("Data Pengarang Ke : " + (i + 1));
            pengarang.tampilPengarang_21102094();
        }
    }
}
