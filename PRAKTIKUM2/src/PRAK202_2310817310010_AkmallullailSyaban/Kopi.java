package PRAK202_2310817310010_AkmallullailSyaban;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	public String pembeli;
	final double pajak = 0.11;
	
	public void setPembeli (String pembeli) {
		this.pembeli = pembeli;
	}
	
	public String getPembeli() {
		return pembeli;
	}
	
	public double getPajak() {
		return harga * pajak;
	}
	
	
	public void info() {
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga: Rp. " + harga);
	}
}
