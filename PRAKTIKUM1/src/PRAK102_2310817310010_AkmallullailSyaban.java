import java.util.Scanner;

public class PRAK102_2310817310010_AkmallullailSyaban {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int angka = input.nextInt();
        input.close();
        int start = 0;
        int kelipatan = angka;
        
        while (start <= 10) {
            if (kelipatan % 5 == 0) {
                System.out.print((kelipatan / 5) - 1);
                if (start < 10) System.out.print(", ");
            } else {
                System.out.print(kelipatan);
                if (start < 10) System.out.print(", ");
            }
            start++;
            kelipatan++;
        }
    }
}