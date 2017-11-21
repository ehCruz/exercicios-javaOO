package git.ehcruz.exercicio07;

import java.util.Calendar;
import java.util.Date;

public class Produtos {
	public static final int QTD_PROD = 4;
	String[] produto = new String[QTD_PROD];
	int[] quantiaEstoque = new int[QTD_PROD];
	Date[] dataValidade = new Date[QTD_PROD];
	int indice = 0;

	public void cadastrarProduto(String nomeProduto, int qtdeEstoque, int diasValidade) {
		if (indice < QTD_PROD) {
			produto[indice] = nomeProduto;
			quantiaEstoque[indice] = qtdeEstoque;
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, diasValidade);
			dataValidade[indice] = new Date(c.getTimeInMillis());
		} else {
			indice = 0;
			produto[indice] = nomeProduto;
			quantiaEstoque[indice] = qtdeEstoque;
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, diasValidade);
			dataValidade[indice] = new Date(c.getTimeInMillis());
		}
		indice++;
	}

	public void consultarProdutos() {
		for (int i = 0; i < QTD_PROD; i++) {
			System.out.println("__________________________________");
			System.out.println(new StringBuilder().append("Produto:   ").append(produto[i]).toString());
			System.out.println(new StringBuilder().append("QTD estoque:   ").append(quantiaEstoque[i]).toString());
			System.out.println(new StringBuilder().append("Data validade:   ").append(dataValidade[i]).toString());
		}
		System.out.println();
	}
}
