import java.util.Scanner;

public class PRAK103_2310817310010_AkmallullailSyaban {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int n = input.nextInt();
		int start = input.nextInt();
		input.close();
		
		int count = 0;
		int bilangan = start;
		do {
			if (bilangan % 2 != 0) {
				System.out.print(bilangan);
				count++;
				if (count < n) {
					System.out.print(", ");
				}
			}
			bilangan++;
		} while (count < n);
	}
}