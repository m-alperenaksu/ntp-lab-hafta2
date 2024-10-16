// Girilen sayının basamaklarını ayrı ayrı yazdıran program.

import java.util.Scanner;

public class Alistirma1B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Beş basamaklı bir sayı giriniz: ");
		int sayi = input.nextInt();
		int onbinler = sayi / 10000;
		int binler = (sayi % 10000) / 1000;
		int yuzler = (sayi % 1000) / 100;
		int onlar = (sayi % 100) / 10;
		int birler = sayi % 10;
		
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
	}
}
