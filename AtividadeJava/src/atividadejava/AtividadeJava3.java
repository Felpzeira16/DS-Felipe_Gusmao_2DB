
package atividadejava;

public class AtividadeJava3 {

    public static void main(String[] args) {
         String name = "Ricardo";
        int Salário = 2350;
        int Vendas = 3723;
        
         System.out.println(name);
         System.out.println(Salário);
         System.out.println(Vendas);
         
        float cont1 = (Vendas * 15) / 100;
        float cont2 = Vendas + cont1;
        
        System.out.println("O Nome do Vendedor é "+name+", seu sálario fixo é R$"+Salário+" e seu salário final é de R$"+cont2);
    }
    
}
