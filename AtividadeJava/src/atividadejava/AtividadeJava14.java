package atividadejava;
import java.util.Scanner;

public class AtividadeJava14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual tipo de gasolina você usará? Escreva 1 para Gasolina, e 2 para álcool");
		int combustivel = entrada.nextInt();
		System.out.println("Quantos litros você irá querer?");
		int Litros = entrada.nextInt();
		
		if (combustivel == 1) {
			if (Litros <= 20) {
				double preco = 3.30 * Litros;
				double desconto = (3 / 100) * 20;
				double preco_final = preco - desconto;
				System.out.println("O preço final será de "+preco_final+"R$");
			}
			if (Litros > 20) {
				double preco = 3.30 * Litros;
				double desconto = (5 / 100) * 20;
				double preco_final = preco - desconto;
				System.out.println("O preço final será de "+preco_final+"R$");
			}
		}

			if (combustivel == 2) {
				if (Litros <= 20) {
					double preco = 2.90 * Litros;
					double desconto = (4 / 100) * 20;
					double preco_final = preco - desconto;
					System.out.println("O preço final será de "+preco_final+"R$");
				}
				if (Litros > 20) {
					double preco = 2.90 * Litros;
					double desconto = (6 / 100) * 20;
					double preco_final = preco - desconto;	
					System.out.println("O preço final será de "+preco_final+"R$");
					System.out.println("Você gostou?");
					String a = entrada.nextLine();
		}
				
	}
}
}