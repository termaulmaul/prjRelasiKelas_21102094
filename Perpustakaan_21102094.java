package com.maulana_rafi.pbo.prjRelasiKelas;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan_21102094 {
    private String namaPerpus_21102094;
    private List<Buku_21102094> buku_21102094;

    public Perpustakaan_21102094(String namaPerpus_21102094) {
        this.namaPerpus_21102094 = namaPerpus_21102094;
        this.buku_21102094 = new ArrayList<>();
    }

    public void tambahBuku_21102094(Buku_21102094 buku) {
        buku_21102094.add(buku);
    }

    public void tampilPerpus_21102094() {
        System.out.println("**********Tampil Perpustakaan**********************");
        System.out.println("Nama Perpustakaan : " + namaPerpus_21102094);
        System.out.println("Jumlah Buku : " + buku_21102094.size());
        System.out.println("**********Tampil Buku******************************");
        for (int i = 0; i < buku_21102094.size(); i++) {
            Buku_21102094 buku = buku_21102094.get(i);
            System.out.println("Data Buku Ke : " + (i + 1));
            buku.tampilBuku_21102094();
            System.out.println("**********Tampil Pengarang*************************");
            buku.tampilPengarang_21102094();
        }
    }
}
