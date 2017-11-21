package git.ehcruz.exercicio03;

import java.util.Date;

public class Livro {
	public String isbnLivro;
	public String titulo;
	public boolean emprestado = false;
	Date dataEmprestimo;

	public int emprestarLivro(String idLivro) {
		if (this.isbnLivro.equalsIgnoreCase(idLivro) && emprestado == false) {
			return 1;
		} else {
			return 0;
		}
	}

	public void devolverLivro() {
		if (emprestado) {
			System.out.println("Livro devolvido.");
			emprestado = false;
			dataEmprestimo = null;
		} else {
			System.out.println("Operação inválida, livro não foi emprestado.");
		}
	}

	public void consultarLivro() {
		String situacao;
		if (emprestado == false) {
			situacao = "Disponível";
		} else {
			situacao = "Emprestado";
		}
		System.out.println("-----------------------");
		System.out.println(new StringBuilder().append("Título: ").append(this.titulo).toString());
		System.out.println(new StringBuilder().append("ISBN: ").append(this.isbnLivro).toString());
		System.out.println(new StringBuilder().append("Situação: ").append(situacao).toString());
		if (dataEmprestimo == null) {
			System.out.println("Livro encontra-se na biblioteca.");
		} else {
			System.out
					.println(new StringBuilder().append("Data do empréstimo: ").append(this.dataEmprestimo).toString());
		}
		System.out.println("-----------------------");
	}
}
