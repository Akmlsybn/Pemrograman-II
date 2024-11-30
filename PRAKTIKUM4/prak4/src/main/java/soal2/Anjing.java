package soal2;

import soal1.HewanPeliharaan;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan; // Menggunakan array untuk kemampuan

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r); // Memanggil konstruktor parent
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayAnjing() {
        super.display(); // Memanggil method display() dari parent
        System.out.println("Memiliki warna bulu : " + warnaBulu);

        // Menampilkan kemampuan tanpa koma
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i]); // Cetak setiap kemampuan
            if (i < kemampuan.length - 1) {
                System.out.print(" "); // Tambahkan spasi jika bukan elemen terakhir
            }
        }
        System.out.println(); // Pindah ke baris baru
    }
}
