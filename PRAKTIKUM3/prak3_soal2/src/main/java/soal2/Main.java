package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        LinkedList<Negara> objekNegara = new LinkedList<>();

        System.out.print("Masukkan jumlah negara : ");
        int jumlahNegara = Scanner.nextInt();
        Scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = Scanner.nextLine();

            String jenisKepemimpinan = Scanner.nextLine();

            String namaPemimpin = Scanner.nextLine();

            int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                tanggalKemerdekaan = Scanner.nextInt();
                bulanKemerdekaan = Scanner.nextInt();
                tahunKemerdekaan = Scanner.nextInt();
                Scanner.nextLine();
            }
            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            objekNegara.add(negara);
        }
        System.out.println("\nInformasi negara:");
        for (int i = 0; i < objekNegara.size(); i++) {
            Negara daftarNegara = objekNegara.get(i);
            objekNegara.get(i).info();
        }
    Scanner.close();
    }
}