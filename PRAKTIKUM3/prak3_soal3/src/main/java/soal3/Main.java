package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);

        ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

        int pil;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilihan: ");
            pil = pilihan.nextInt();

            switch (pil) {
                case 0:
                System.out.println("Terima Kasih!");
                break;

                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = pilihan.next();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = pilihan.next();
                    mahasiswa.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;
            
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = pilihan.next();
                    for (int i = 0; i < mahasiswa.size(); i++) {
                        if (mahasiswa.get(i).getNim().equals(nimHapus)) {
                            mahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = pilihan.next();
                    for (int i = 0; i < mahasiswa.size(); i++){
                        if(mahasiswa.get(i).getNim().equals(nimCari)){
                            System.out.println("Mahasiswa dengan NIM yang dicari : " + nimCari);
                            System.out.println("NIM : " + mahasiswa.get(i).getNim() + ", Nama: " + mahasiswa.get(i).getNama());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa: ");
                    for (int i = 0; i < mahasiswa.size(); i++){
                        System.out.println("NIM : " + mahasiswa.get(i).getNim() + ", Nama: " + mahasiswa.get(i).getNama());
                    }
                    break;
                default:
                System.out.println("Coba lagi");
            }
        } while (pil != 0);
        pilihan.close();
    }
}