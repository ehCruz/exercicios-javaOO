package git.ehcruz.exercicio08;

import java.util.Scanner;

public class ParkVallet {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Estacionamento estac = new Estacionamento();
		Carro carro = new Carro();
		int op;
		boolean menuLoop = true;
		while (menuLoop) {
			System.out.println("\n1 - Estacionar Carro\n2 - Devolver Carro\n3 - Consultar Pátio\n9 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informar placa:");
				carro.placa = sc.next();
				System.out.println("Informar modelo:");
				carro.modelo = sc.next();
				System.out.println("Informar tamanho (1 peq, 2 med, 3 gr:");
				carro.tamanho = sc.nextInt();
				int ret = estac.cadastrarVeiculo(carro);
				if (ret == 0) {
					System.out.println("Estacionamento lotado. Analisando vagas livres.");
				} else {
					System.out.println("Existem vagas.");
				}
				break;
			case 2:
				System.out.println("Informe a placa do veículo:");
				String placa = sc.next();
				double valorTotal = estac.calcularEstrada(placa);
				if (valorTotal > 0) {
					System.out.println(new StringBuilder().append("Valor total: ").append(valorTotal).toString());
				} else {
					System.out.println("Erro, informe a PLACA CORRETA.");
				}
				break;
			case 3:
				estac.exibirVeiculos();
				break;
			case 9:
				System.out.println("Finalizando...");
				System.exit(0);
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
