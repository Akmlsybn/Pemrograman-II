package soal2;

import soal2.Anjing;
import soal2.Kucing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan newline

        if (pilihan == 1) {
            // Input untuk Kucing
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();

            // Membuat objek Kucing
            Kucing kucing = new Kucing(nama, ras, warnaBulu);

            // Menampilkan detail Kucing
            System.out.println("\nDetail Hewan Peliharaan:");
            kucing.displayKucing();

        } else if (pilihan == 2) {
            // Input untuk Anjing
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();
            System.out.print("Kemampuan (pisahkan dengan koma): ");
            String[] kemampuan = input.nextLine().split(",\\s*"); // Pisahkan input berdasarkan koma dan spasi

            // Membuat objek Anjing
            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);

            // Menampilkan detail Anjing
            System.out.println("\nDetail Hewan Peliharaan:");
            anjing.displayAnjing();

        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
