package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("");
        int jumlahDadu = scanner.nextInt();
        
        Dadu dadu = new Dadu();
        dadu.lemparanDadu(jumlahDadu);
        
        for (int i = 0; i < jumlahDadu; i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getAngkaDadu().get(i));
        }
        int totalNilai = dadu.hitungDadu(jumlahDadu);
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}
