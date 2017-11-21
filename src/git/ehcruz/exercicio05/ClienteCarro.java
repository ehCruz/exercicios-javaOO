package git.ehcruz.exercicio05;

import java.util.Scanner;

public class ClienteCarro {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		CarroAlugado carro = new CarroAlugado();
		String chassi;
		int potencia;
		int op;
		boolean loopMenu = true;

		while (loopMenu) {
			System.out.println("\n");
			System.out.println("1 - Cadastrar carro");
			System.out.println("2 - Reservar carro");
			System.out.println("3 - Liberar carro");
			System.out.println("4 - Consultar carros");
			System.out.println("9 - Sair \n");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informar o chassi:");
				chassi = sc.next();
				System.out.println("Informar a potencia (1/2):");
				potencia = sc.nextInt();
				carro.cadastrarCarro(chassi, potencia);
				break;
			case 2:
				System.out.println("Digitar o chassi para reserva:");
				chassi = sc.next();
				int resp = carro.reservarCarro(chassi);
				if (resp == 1) {
					System.out.println("Carro reservado");
				} else {
					System.out.println("Carro ocupado. Escolher outro.");
				}
				break;
			case 3:
				System.out.println("Digitar o chassi do carro para liberação:");
				chassi = sc.next();
				System.out.println("Digitar a quantidade de dias da reserva:");
				int dias = sc.nextInt();
				carro.liberarCarro(chassi, dias);
				break;
			case 4:
				carro.consultarCarro();
				break;
			case 9:
				System.out.println("Saindo do sistema...");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

}
