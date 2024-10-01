import java.util.Scanner;

public class PRAK101_2310817310010_AkmallullailSyaban {
    public static void main(String[] args) {
        String nama, tl, namaBulan = "";
        int tgl, thn, tinggi;
        float berat;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tl = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tgl = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        thn = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        berat = input.nextFloat();

        if (bulan == 1) {
            namaBulan = "Januari";
        } else if (bulan == 2) {
            namaBulan = "Februari";
        } else if (bulan == 3) {
            namaBulan = "Maret";
        } else if (bulan == 4) {
            namaBulan = "April";
        } else if (bulan == 5) {
            namaBulan = "Mei";
        } else if (bulan == 6) {
            namaBulan = "Juni";
        } else if (bulan == 7) {
            namaBulan = "Juli";
        } else if (bulan == 8) {
            namaBulan = "Agustus";
        } else if (bulan == 9) {
            namaBulan = "September";
        } else if (bulan == 10) {
            namaBulan = "Oktober";
        } else if (bulan == 11) {
            namaBulan = "November";
        } else if (bulan == 12) {
            namaBulan = "Desember";
        }

        System.out.print("Nama Lengkap " + nama + ", ");
        System.out.print("Lahir di " + tl);
        System.out.print(" pada Tanggal " + tgl);
        System.out.print(" " + namaBulan + " ");
        System.out.println(thn);
        System.out.print("Tinggi Badan " + tinggi + " cm ");
        System.out.println("dan Berat Badan " + berat + " kilogram");

        input.close();
    }
}