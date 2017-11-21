package git.ehcruz.exercicio06;

import java.util.Calendar;
import java.util.Date;

public class Produto {
	String produto;
	int quantiaEstoque;
	Date dataValidade;

	public void cadastrarProduto(String nomeProduto, int qtdeEstoque, int diasValidade) {
		produto = nomeProduto;
		quantiaEstoque = qtdeEstoque;
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, diasValidade);
		dataValidade = new Date(c.getTimeInMillis());
	}	
	
	public void consultarProdutos() {
		System.out.println();
		System.out.println(new StringBuilder().append("Produto:   ").append(produto).toString());
		System.out.println(new StringBuilder().append("QTD estoque:   ").append(quantiaEstoque).toString());
		System.out.println(new StringBuilder().append("Data validade:   ").append(dataValidade).toString());
	}
}
