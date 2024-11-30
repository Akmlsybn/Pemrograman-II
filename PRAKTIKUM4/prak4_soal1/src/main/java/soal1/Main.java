package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan Ras Hewan Peliharaan: ");
        String rasHewan = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(rasHewan, namaHewan);
        hewan.display();
        input.close(); 
    }
}
