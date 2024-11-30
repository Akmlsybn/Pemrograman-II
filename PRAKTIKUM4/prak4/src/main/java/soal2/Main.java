package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();

            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayKucing();

        } else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();
            System.out.print("Kemampuan (pisahkan dengan koma): ");
            String[] kemampuan = input.nextLine().split(",\\s*"); // Pisahkan input berdasarkan koma dan spasi

            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.displayAnjing();

        } else {
            System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }
}
