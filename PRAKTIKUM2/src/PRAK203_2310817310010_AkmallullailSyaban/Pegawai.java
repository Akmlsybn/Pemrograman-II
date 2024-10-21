package PRAK203_2310817310010_AkmallullailSyaban;

//Error karena class seharusnya Pegawai bukan employee
//public class employee
public class Pegawai {
	public String nama;
	//Kesalahan penggunaan tipe data char, seharusnya menggunakan String asal
	//public char asal;
	public String asal; 
	public String jabatan;
	public int umur;
	
	public String getNama() {
	return nama;
	}
	
	public String getAsal() {
	return asal;
	}
	
	//Tidak ada pernyataan parameter tipe data string dibawah ini seharusnya (String j)
	//public void setJabatan() {
	public void setJabatan(String j) {
	this.jabatan = j;
	}
}