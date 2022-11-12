package Prova;
import java.util.Scanner;

public class AppCilindro {
	static Cilindro cilindro;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int funcao;
		
		do {
            System.out.println("Ol�! qual fun��o que gostaria de acessar?");
            System.out.println("[0] Para finalizar o programa.");
            System.out.println("[1] Para cadastrar novo Cilindro.");
            System.out.println("[2] Para Mostrar dados do Cilindro.");
            System.out.println("[3] Para Abastecer um Cilindro.");
            System.out.println("[4] Para Resgistrar consumo de um dos Cilindros.");
            System.out.println("[5] Para Esvaziar Cilindro.");
            System.out.print("Digite a fun��o que deseja: ");
            funcao = scan.nextInt();
            System.out.println("_______________________________________");

            switch (funcao) {
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2:
                	mostrarDados();
                    break;
                case 3:
                    cilindro.abastecerCilindro();
                    break;
                case 4:
                    registrarConsumo();
                    break;
                case 5:
                	cilindro.esvaziarCilindro();
                	break;
            }
            
        }while(funcao != 0);
	}
	public static void cadastrar(){
		 System.out.println("_______________________________________");
		 System.out.println("Digite as informa��es pedidas:");
	     System.out.print("ID do Cilindro: ");
	     int id = scan.nextInt();
	     System.out.print("Localiza��o: ");
	     String localizacao = scan.next();
	     System.out.print("Capacidade Maxima: ");
	     double capacidadeMaxima = scan.nextDouble();
	     System.out.print("Custo do Kg: ");
	     double custoKg = scan.nextDouble();
	     System.out.println("_______________________________________");
	        
	     cilindro = new Cilindro(id, localizacao, capacidadeMaxima, custoKg);
	    }
	public static void mostrarDados() {
		 System.out.println("_______________________________________");
		 System.out.printf("\nID: %d", cilindro.getIdCilindro());
		 System.out.printf("\nLocaliza��o: %s", cilindro.getLocalizacao());
		 System.out.printf("\nCapacidade Maxima: %.3f", cilindro.getCapacidadeMaxima());
		 System.out.printf("\nCapacidade Atual: %.3f", cilindro.getCapacidadeAtual());
		 System.out.printf("\nStatus do Abastecimento: %s", cilindro.getStatusAbastecimento());
		 System.out.printf("\nCusto do Kg: R$%.2f", cilindro.getCustoKg());
		 System.out.println("\n_______________________________________");
	 }
	public static void registrarConsumo() {
		 System.out.println("_______________________________________");
		 System.out.print("Digite a quantidade de kg consumidos: ");
		 double qtdeKg = scan.nextDouble();
		 boolean situacao = cilindro.registrarConsumo(qtdeKg);
		 if (situacao == true) {
			 System.out.print("Consumo Registrado com Sucesso!");
		 } else {
			 System.out.println("Registro do Consumo Falhou.");
			 System.out.print("Consumo maior que a quantidade atual do cilindro.");
		 }
		 System.out.println("\n_______________________________________");
	 }
}

