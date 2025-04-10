
import java.util.Scanner;

public class AtividadeJava1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um valor alatorio");
        double valor1 = entrada.nextDouble();
        
        System.out.println("Escreva agora um segundo valor");
        int valor2 = entrada.nextInt();
        
        if (valor2 == 0){
            System.out.println("0 não pode. Por favor digite um novo valor");
            int novo_valor2 = entrada.nextInt();
            
            double div = valor1 / novo_valor2;
            System.out.println("O resultado da divisao sera "+div);
        }
        else{
            double div = valor1 / valor2;
            System.out.println("O resultaod da divisão será "+div);
        }
    }
    
}
