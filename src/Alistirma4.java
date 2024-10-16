// Girilen sayıyı tersine çevirip yazdıran program.

import java.util.Scanner;

public class Alistirma4{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Tersine çevirmek istediğiniz sayıyı giriniz: ");
	int sayi = input.nextInt();
	int ters = 0;
	while(sayi > 0) {
		ters = (ters * 10) + (sayi % 10);
		sayi = sayi / 10;
	}
	System.out.println(ters);
	}
}
