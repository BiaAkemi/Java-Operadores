package JavaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		float n1, n2, n3, n4, media;
		
		Scanner leia  = new Scanner(System.in);
		
			//notas
			System.out.println("\nDigite a nota 1: ");
			n1 = leia.nextFloat();
			
			System.out.println("\nDigite a nota 2: ");
			n2 = leia.nextFloat();
			
			System.out.println("\nDigite a nota 3: ");
			n3 = leia.nextFloat();
			
			System.out.println("\nDigite a nota 4: ");
			n4 = leia.nextFloat();
			
			//cálculo da média
			media = (n1+n2+n3+n4)/4;
		
		System.out.printf("\nMédia final: %.1f %n", media);
	
	}

}
