
package desafio_carro;
import java.util.Scanner;

public class Desafio_projeto {

    public static void main(String[] args) {
        
 		Scanner sc = new Scanner(System.in);
    	System.out.println("O que você quer?\n 1- Carro\n 2- Caminhão\n 3- Moto");
    	int escolhaAutomovel = sc.nextInt();
    	switch (escolhaAutomovel) 
        {
            
    	case 1:	
        	System.out.println("Qual carro você quer escolher? \n 1- Hyundai HB20 2 \n 2- Fiat Strada \n 3-Volkswagen Polo");
        	int escolhaCarro = sc.nextInt();
        	switch (escolhaCarro) {
                    
            case 1:
                Desafio_Carro c1 = new Desafio_Carro();
                c1.nome = "HB20";
                c1.marca = "Hyundai";
                c1.ano = 2012;
                c1.vel = 180;
                c1.acelerar(100);
                System.out.println("Velocidade: " + c1.vel + " KM");
                c1.freiar(15);
                System.out.println("Velocidade Apos Freio: " + c1.vel + " km");
                c1.buzinar();
                break;

            case 2:
                Desafio_Carro c2 = new Desafio_Carro();
                c2.nome = "Strada";
                c2.marca = "Fiat";
                c2.ano = 1998;
                c2.vel = 160;
                c2.acelerar(30);
                System.out.println("Velocidade: " + c2.vel + " KM");
                c2.freiar(25);
                System.out.println("Velocidade Apos Freio: " + c2.vel + " km");
                c2.buzinar();
                break;

            case 3:
                Desafio_Carro c3 = new Desafio_Carro();
                c3.nome = "Polo";
                c3.marca = "Volkswagen";
                c3.ano = 2002;
                c3.vel = 180;
                c3.acelerar(30);
                System.out.println("Velocidade: " + c3.vel + " KM");
                c3.freiar(10);
                System.out.println("Velocidade Apos Freio: " + c3.vel + " km");
                c3.buzinar();
                break;

    		default:
    		System.out.println("Opção inválida.");
    		break;
        }
        	break;
    	case 3:
    		System.out.println("Qual moto você quer escolher? \n 1- Honda CG 160 \n  2- Yamaha YBR 150 \n  3- Honda Twister");
    		int escolhaMoto = sc.nextInt();

    		switch (escolhaMoto) {
    		    case 1:
    		        desafio_moto m1 = new desafio_moto();
    		        m1.nome = "CG 160";
    		        m1.marca = "Honda";
    		        m1.ano = 2015;
    		        m1.vel = 120;
    		        m1.acelerar(25);
    		        System.out.println("Velocidade: " + m1.vel + " KM");
    		        m1.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + m1.vel + " km");
    		        m1.buzinar();
    		        break;

    		    case 2:
    		        desafio_moto m2 = new desafio_moto();
    		        m2.nome = "YBR 150";
    		        m2.marca = "Yamaha";
    		        m2.ano = 2000;
    		        m2.vel = 130;
    		        m2.acelerar(30);
    		        System.out.println("Velocidade: " + m2.vel + " KM");
    		        m2.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + m2.vel + " km");
    		        m2.buzinar();
    		        break;

    		    case 3:
    		        desafio_moto m3 = new desafio_moto();
    		        m3.nome = "Twister";
    		        m3.marca = "Honda";
    		        m3.ano = 2001;
    		        m3.vel = 150;
    		        m3.acelerar(35);
    		        System.out.println("Velocidade: " + m3.vel + " KM");
    		        m3.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + m3.vel + " km");
    		        m3.buzinar();
    		        break;

    		    default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;
    	case 2:
    		System.out.println("Qual caminhão você quer escolher? \n 1- Volvo FH540 \n  2- Scania R 450 \n  3- Mercedes-Benz Atego 2548");
    		int escolhaCaminhao = sc.nextInt();

    		switch (escolhaCaminhao) {
    		    case 1:
    		        desafio_caminhao cam1 = new desafio_caminhao();
    		        cam1.nome = "FH540";
    		        cam1.marca = "Volvo";
    		        cam1.ano = 2023;
    		        cam1.vel = 110;
    		        cam1.acelerar(15);
    		        System.out.println("Velocidade: " + cam1.vel + " KM");
    		        cam1.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + cam1.vel + " km");
    		        cam1.buzinar();
    		        break;

    		    case 2:
    		        desafio_caminhao cam2 = new desafio_caminhao();
    		        cam2.nome = "R 450";
    		        cam2.marca = "Scania";
    		        cam2.ano = 2019;
    		        cam2.vel = 80;
    		        cam2.acelerar(15);
    		        System.out.println("Velocidade: " + cam2.vel + " KM");
    		        cam2.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + cam2.vel + " km");
    		        cam2.buzinar();
    		        break;

    		    case 3:
    		        desafio_caminhao cam3 = new desafio_caminhao();
    		        cam3.nome = "Atego 2548";
    		        cam3.marca = "Mercedes-Benz";
    		        cam3.ano = 2021;
    		        cam3.vel = 120;
    		        cam3.acelerar(20);
    		        System.out.println("Velocidade: " + cam3.vel + " KM");
    		        cam3.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + cam3.vel + " km");
    		        cam3.buzinar();
    		        break;

                        default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;

    		
    	}
    	

    	
     
    }
    
       
    
}