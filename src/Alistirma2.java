// Kullanıcının BMI değerini hesaplayan program.

import java.util.Scanner;

public class Alistirma2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		double kilo = input.nextDouble();
		System.out.println("Boyunuzu giriniz: ");
		double boy = input.nextDouble();
		
		double bmi = kilo / (boy * boy);
		
		if (bmi < 18.5) System.out.println("BMI değeriniz: " + bmi + ". Zayıfsınız.");
		else if (bmi < 24.9) System.out.println("BMI değeriniz: " + bmi + ". Normalsiniz.");
		else if (bmi < 29.9) System.out.println("BMI değeriniz: " + bmi + ". Şişmansınız.");
		else System.out.println("BMI değeriniz: " + bmi + ". Obezsiniz.");
		
	}
}