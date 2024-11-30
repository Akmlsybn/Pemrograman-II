package soal2;
import soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan{
    private String warnaBulu;

    public Kucing(String n, String r, String w) {
        super(n, r);
        this.warnaBulu = w;
    }

    public void displayKucing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
