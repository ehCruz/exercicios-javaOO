package git.ehcruz.exercicio03;

import java.util.Date;
import java.util.Scanner;

public class Aluno {
	static Scanner sc = new Scanner(System.in);
	static Livro livro = new Livro();
	
	public static void emprestar() {
		String titulo;
		int statusLivro;
		System.out.println("Infome o ISBN:");
		titulo = sc.next();
		statusLivro = livro.emprestarLivro(titulo);
		if (statusLivro == 1) {
			livro.dataEmprestimo = new Date();
			livro.emprestado = true;
			System.out.println("Livro emprestado.");
		} else {
			System.out.println("Erro, nome inválido ou livro não disponível.");
		}
	}

	public static void consulta() {
		livro.consultarLivro();
	}

	public static void devolver() {
		livro.devolverLivro();
	}
	
	public static void main(String[] args) {
		livro.titulo = "O Silmarilion";
		livro.isbnLivro = "12AB54A66";

		int opMenu;
		boolean loopMenu = true;
		while (loopMenu) {
			System.out.println("1 - Emprestar Livro");
			System.out.println("2 - Consultar Livro");
			System.out.println("3 - Devolver Livro");
			System.out.println("9 - Sair");
			System.out.println("Escolha uma opção:");
			opMenu = sc.nextInt();
			switch (opMenu) {
			case 1:
				emprestar();
				break;
			case 2:
				consulta();
				break;
			case 3:
				devolver();
				break;
			case 9:
				System.out.println("Saindo do sistema. . . . . . .");
				System.exit(0);
				loopMenu = false;
			default:
				System.out.println("Inválido");
				break;
			}
		}

	}

}
