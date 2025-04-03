
package atividadejava;
import java.util.Scanner;

public class Atividadejava9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas Peossoas Votaram?");
        int eleitores = entrada.nextInt();
        
        System.out.println("Quantas votos brancos teve?");
        int brancos = entrada.nextInt();
        
        System.out.println("Quantos votos nulos teve?");
        int nulos = entrada.nextInt();
        
        System.out.println("Quantos votos validos teve?");
        int validos = entrada.nextInt();
        
        if (eleitores > validos + nulos + brancos){
            System.out.println("O numero de pessoas que votaram nao e igual ao total de validos, nulos e brancos");
        }
        if (eleitores < validos + nulos + brancos){
            System.out.println("O numero de pessoas que votaram nao e igual ao total de validos, nulos e brancos");
        }
        
        float porc_brancos = (brancos * 100) / eleitores;
        float porc_nulos = (nulos * 100) / eleitores;
        float porc_validos = (validos * 100) / eleitores;
        
        System.out.println("cerca de "+porc_brancos+"% dos votos foram brancos, "+porc_nulos+"% foram nulos e "+porc_validos+"% dos votos foram validos");
    }
    
}
