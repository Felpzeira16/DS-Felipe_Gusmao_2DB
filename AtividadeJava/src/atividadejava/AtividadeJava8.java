
package atividadejava;
import java.util.Scanner;

public class AtividadeJava8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que anos voce nasceu? ");
        int anos = entrada.nextInt();
        int idade = 2025 - anos;
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.println("Voce tem "+idade+" anos "+meses+" meses "+dias+" dias");
    }
    
}
