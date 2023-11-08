package JavaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		float salario, noite, extra, desconto, tot;
		Scanner leia = new Scanner(System.in);
		
		//salário bruto, adicional noturno, horas extras e descontos
		System.out.println("\nDigite o salário bruto: ");
		salario = leia.nextFloat();

		System.out.println("\nDigite o adicional noturno: ");
		noite = leia.nextFloat();

		System.out.println("\nDigite as horas extras: ");
		extra = leia.nextFloat();
		
		System.out.println("\nDigite os descontos: ");
		desconto = leia.nextFloat();
		
		//cálculo do total
		tot = salario + noite + (extra * 5) - desconto;
		System.out.printf("\nSalário Líquido: %.2f%n", tot);

	}

}
