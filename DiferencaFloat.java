package JavaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaFloat {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		float n1, n2, n3, n4, tot;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o número 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o número 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o número 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o número 4: ");
		n4 = leia.nextFloat();
		
		tot = (n1*n2) - (n3*n4);
		System.out.printf("\nDiferença: %.1f%n", tot);

	}

}
