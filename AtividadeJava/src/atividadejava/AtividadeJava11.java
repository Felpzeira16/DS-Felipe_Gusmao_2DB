
package atividadejava;
import java.util.Scanner;

public class AtividadeJava11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Qual o valor de fabrica do carro?");
       float fabrica = entrada.nextFloat();
       float distribuidor = (fabrica * 28) / 100;
       float imposto = (fabrica * 45) / 100;
       float valor_final = fabrica + imposto + distribuidor;
        System.out.println("O valor final do carro é "+valor_final);

    }
    
}
