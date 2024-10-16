//  Girilen sayıların toplam, fark, çarpım ve bölüm değerlerini yazdıran program.

import java.util.Scanner;

public class Alistirma1A{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		int number1 = input.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int number2 = input.nextInt();
		System.out.println("Toplam = " + (number1 + number2));
		System.out.println("Fark = " + (number1 - number2));
		System.out.println("Çarpım = " + (number1 * number2));
		System.out.println("Bölüm = " + ((double)number1 / number2));
	}
}