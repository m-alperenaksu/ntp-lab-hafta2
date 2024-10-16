// Dairenin yarıçapını hesaplayan program.

import java.util.Scanner;

public class Alistirma3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		double yaricap = input.nextDouble();
		
		final double pi = 3.14159d;
		
		double alan = pi * (yaricap * yaricap);
		System.out.println("Alan = " + alan);
	}
}