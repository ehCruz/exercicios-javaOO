package git.ehcruz.exercicio06;

import java.util.Scanner;

public class ClienteProduto {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Produto produto = new Produto();
		int op;
		boolean loopMenu = true;
		while (loopMenu) {
			System.out.println("\n1 - Cadastrar produto\n2 - Consultar Produto\n9 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Nome do produto:");
				String nome = sc.next().concat(sc.nextLine());
				System.out.println("Quantiade do estoque:");
				int qtde = sc.nextInt();
				System.out.println("Dias de validade:");
				int dias = sc.nextInt();
				produto.cadastrarProduto(nome, qtde, dias);
				break;
			case 2:
				produto.consultarProdutos();
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
