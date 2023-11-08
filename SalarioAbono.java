package JavaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		float salario, abono, novo;
		
		Scanner leia  = new Scanner(System.in);
		
		//salário
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		//abono
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		//calculo do novo salário
		novo = salario + abono;
		System.out.printf("\n Novo Salário: %.2f%n", novo);

	}

}
