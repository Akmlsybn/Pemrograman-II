package soal1;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }

    public String getNama() {
        return nama;
    }
    
    public String getRas() {
        return ras;
    }

    void display(){
        System.out.println("Display Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + getNama());
        System.out.println("Dengan ras : " + getRas());
    }
}
