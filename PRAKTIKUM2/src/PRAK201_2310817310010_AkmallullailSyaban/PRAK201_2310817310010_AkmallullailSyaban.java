package PRAK201_2310817310010_AkmallullailSyaban;

class buahBuahan {
	String namaBuah;
	double berat;
	double harga;
	double jumlahBeli;
	
	public double Sebelumdiskon() {
		return jumlahBeli / berat * harga;
	}
	public double diskon() {
		return 1 - Math.floor(jumlahBeli / 4) * 0.02;
	}
	public double sesudahDiskon() {
		return Sebelumdiskon() * diskon();
	}
	public double hargaTotalDiskon() {
		return Sebelumdiskon() - sesudahDiskon();
	}
}

public class PRAK201_2310817310010_AkmallullailSyaban {

	public static void main(String[] args) {
		buahBuahan buah = new buahBuahan();
		buah.namaBuah = "Apel";
		buah.berat = 0.4;
		buah.harga = 7000.0;
		buah.jumlahBeli = 40.0;
		System.out.println("Nama buah: " + buah.namaBuah);
		System.out.println("Berat: " + buah.berat);
		System.out.println("Harga: " + buah.harga);
		System.out.println("Jumlah Beli: " + buah.jumlahBeli + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n",buah.Sebelumdiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah.hargaTotalDiskon());	
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", buah.sesudahDiskon());
		
		buahBuahan buah2 = new buahBuahan();
		buah2.namaBuah = "Mangga";
		buah2.berat = 0.2;
		buah2.harga = 3500.0;
		buah2.jumlahBeli = 15.0;
		System.out.println("\nNama buah: " + buah2.namaBuah);
		System.out.println("Berat: " + buah2.berat);
		System.out.println("Harga: " + buah2.harga);
		System.out.println("Jumlah Beli: " + buah2.jumlahBeli + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n",buah2.Sebelumdiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah2.hargaTotalDiskon());	
		System.out.printf("Harga Setelah Diskon: Rp%.2f\n", buah2.sesudahDiskon());
		
		buahBuahan buah3 = new buahBuahan();
		buah3.namaBuah = "Alpukat";
		buah3.berat = 0.25;
		buah3.harga = 10000.0;
		buah3.jumlahBeli = 12.0;
		System.out.println("\nNama buah: " + buah3.namaBuah);
		System.out.println("Berat: " + buah3.berat);
		System.out.println("Harga: " + buah3.harga);
		System.out.println("Jumlah Beli: " + buah3.jumlahBeli + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n",buah3.Sebelumdiskon());
		System.out.printf("Total Diskon: Rp%.2f\n", buah3.hargaTotalDiskon());	
		System.out.printf("Harga Setelah Diskon: Rp%.2f", buah3.sesudahDiskon());
	}
}