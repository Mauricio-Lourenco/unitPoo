package Prova;

import java.util.Scanner;

public class AppCilindroGas {
	
	static CilindroGas cilindroGas;
	static Scanner lerTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		int operacao;

		do {
			System.out.println("======= Usabilidade de Cilindro =======");
			System.out.println("Selecione uma das Operações:\n");
			System.out.println("Cadastrar Cilindro           [1]");
			System.out.println("Processar Consumo (3)        [2]");
			System.out.println("Processar Abastecimento      [3]");
			System.out.println("Mostrar Dados do Cilindro    [4]");
			System.out.println("Esvaziar Cilindro            [5]");
			System.out.println("Encerrar Operação            [0]");
			System.out.println("========================================");
			operacao = lerTeclado.nextInt();

			switch (operacao) {
			case 1:
				cadastrarCilindro();
				break;
			case 3:
				cilindroGas.abastecerCilindro(20, 10);
				break;

			case 4:
				mostrarDados();
				break;
			case 5: 
				cilindroGas.esvaziarCilindro();
				break;
			case 0:
				System.out.println("Operação Encerrada");
				break;
			}
		} while (operacao != 0);

	}

	public static void cadastrarCilindro() {

		System.out.println("Insira o Id do Cilindro: ");
		int idCilindro = lerTeclado.nextInt();
		lerTeclado.nextLine();
		System.out.println("Insira a localização do Cilindro: ");
		String localizacao = lerTeclado.nextLine();
		System.out.println("Insira a capacidade máxima do Cilindro [Kg/Gás]: ");
		double capacidadeMaxima = lerTeclado.nextDouble();
		System.out.println("Insira o custo por Kg: ");
		double custoKg = lerTeclado.nextDouble();

		cilindroGas = new CilindroGas(idCilindro, localizacao, capacidadeMaxima, custoKg);
	}
	
	public static void mostrarDados() {
		System.out.println("Id do Cilindro: " + cilindroGas.getIdCilindro());
		System.out.println("Localização: " + cilindroGas.getLocalizacao());
		System.out.println("Capacidade Máxima: " + cilindroGas.getCapacidadeMaxima());
		System.out.println("Capacidade Atual: " + cilindroGas.getCapacidadeAtual());
		System.out.println("Custo Kg: " + cilindroGas.getCustoKg());
		System.out.println("Status do Abastecimento: ");
	}

}
