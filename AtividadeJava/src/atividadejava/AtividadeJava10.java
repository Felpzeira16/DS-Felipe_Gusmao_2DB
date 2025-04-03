
package atividadejava;
import java.util.Scanner;

public class AtividadeJava10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Qual o seu salario?");
       float salario = entrada.nextFloat();
       
       System.out.println("Qual seu pecentual de aumento?");
       float aumento = entrada.nextFloat();
        
       float sal_novo = (salario*aumento) / 100 + salario;
       System.out.println("Qual o seu novo salario "+sal_novo);
    }
    
}
