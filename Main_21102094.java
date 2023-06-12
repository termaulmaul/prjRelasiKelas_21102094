package com.maulana_rafi.pbo.prjRelasiKelas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_21102094 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String namaPerpus = "";
        try {
            System.out.print("Nama Perpustakaan: ");
            namaPerpus = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Perpustakaan_21102094 perpustakaan = new Perpustakaan_21102094(namaPerpus);

        try {
            System.out.println("Data Buku - 1");
            System.out.print("ISBN: ");
            String isbn1 = reader.readLine();
            System.out.print("Judul: ");
            String judul1 = reader.readLine();

            Buku_21102094 buku1 = new Buku_21102094(isbn1, judul1);

            System.out.println("Data Pengarang - 1");
            System.out.print("Nama Pengarang: ");
            String namaPengarang1 = reader.readLine();
            System.out.print("Email: ");
            String emailPengarang1 = reader.readLine();
            System.out.print("Telp: ");
            String telpPengarang1 = reader.readLine();

            Pengarang_21102094 pengarang1 = new Pengarang_21102094(namaPengarang1, emailPengarang1, telpPengarang1);
            buku1.tambahPengarang_21102094(pengarang1);

            System.out.println("Data Pengarang - 2");
            System.out.print("Nama Pengarang: ");
            String namaPengarang2 = reader.readLine();
            System.out.print("Email: ");
            String emailPengarang2 = reader.readLine();
            System.out.print("Telp: ");
            String telpPengarang2 = reader.readLine();

            Pengarang_21102094 pengarang2 = new Pengarang_21102094(namaPengarang2, emailPengarang2, telpPengarang2);
            buku1.tambahPengarang_21102094(pengarang2);

            perpustakaan.tambahBuku_21102094(buku1);

            System.out.println("Data Buku - 2");
            System.out.print("ISBN: ");
            String isbn2 = reader.readLine();
            System.out.print("Judul: ");
            String judul2 = reader.readLine();

            Buku_21102094 buku2 = new Buku_21102094(isbn2, judul2);

            System.out.println("Data Pengarang - 1");
            System.out.print("Nama Pengarang: ");
            String namaPengarang3 = reader.readLine();
            System.out.print("Email: ");
            String emailPengarang3 = reader.readLine();
            System.out.print("Telp: ");
            String telpPengarang3 = reader.readLine();

            Pengarang_21102094 pengarang3 = new Pengarang_21102094(namaPengarang3, emailPengarang3, telpPengarang3);
            buku2.tambahPengarang_21102094(pengarang3);

            System.out.println("Data Pengarang - 2");
            System.out.print("Nama Pengarang: ");
            String namaPengarang4 = reader.readLine();
            System.out.print("Email: ");
            String emailPengarang4 = reader.readLine();
            System.out.print("Telp: ");
            String telpPengarang4 = reader.readLine();

            Pengarang_21102094 pengarang4 = new Pengarang_21102094(namaPengarang4, emailPengarang4, telpPengarang4);
            buku2.tambahPengarang_21102094(pengarang4);

            perpustakaan.tambahBuku_21102094(buku2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        perpustakaan.tampilPerpus_21102094();
    }
}

