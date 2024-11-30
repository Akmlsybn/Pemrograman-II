package soal2;

import soal1.HewanPeliharaan;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String Kemampuan;

    public Anjing(String n, String r, String w, String k){
        super(n, r);
        this.warnaBulu = w;
        this.Kemampuan = k;
    }

    void displayAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Kemampuan : " + Kemampuan);
    }

}
