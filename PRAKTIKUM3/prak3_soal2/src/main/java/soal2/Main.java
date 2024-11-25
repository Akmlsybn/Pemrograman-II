package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        LinkedList<Negara> objekNegara = new LinkedList<>();

        int jumlahNegara = Scanner.nextInt();
        Scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = Scanner.nextLine();

            String jenisKepemimpinan = Scanner.nextLine();

            String namaPemimpin = Scanner.nextLine();

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                int tanggalKemerdekaan = Scanner.nextInt();
                int bulanKemerdekaan = Scanner.nextInt();
                int tahunKemerdekaan = Scanner.nextInt();
                Scanner.nextLine();
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            objekNegara.add(negara);
            } 
            else 
            {
            Negara negaraMonarki = new Negara(nama, jenisKepemimpinan, namaPemimpin);
            objekNegara.add(negaraMonarki);
            }
        }
        for (int i = 0; i < objekNegara.size(); i++) {
            Negara daftarNegara = objekNegara.get(i);
            daftarNegara.info();
        }
    Scanner.close();
    }
}