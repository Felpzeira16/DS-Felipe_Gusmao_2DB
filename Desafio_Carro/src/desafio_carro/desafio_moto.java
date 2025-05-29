
package desafio_carro;

public class desafio_moto {
 String  nome;
	    String  marca;
	    int ano;
	    int vel;
	    
	    //métodos
	    void acelerar(int aceleracao){
	        vel+=aceleracao;
	    }
	    
	    void freiar(int reduzir){
	        vel-=reduzir;
	    }
	    
	    void buzinar(){
	        System.out.println("Moto Buzinando");
	    }
	}    

