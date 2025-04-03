
package atividadejava;
import java.util.Scanner;

public class AtividadeJava12 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float sal_fixo = 300;
       float carro = 10000;
       
       System.out.println("Quantos carros voce vendeu?");
       float quant_carros = entrada.nextFloat();
       float valor_carros = carro * quant_carros;
       float comissao = 100 * quant_carros;
       float porcentagem = (5 * valor_carros) / 100;
       float sal_final = sal_fixo + comissao + porcentagem;
       System.out.println("Você vendeu "+quant_carros+" carros, e o seu salario final e de "+sal_final);
       
    }
    
}
