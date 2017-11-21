package git.ehcruz.exercicio08;

public class Estacionamento {
	public static final int VAGAS = 3;
	public static final int VALORHORA = 8;
	int indice = 0;
	Carro[] carro = new Carro[VAGAS];

	public int cadastrarVeiculo(Carro car) {
		if (indice < VAGAS) {
			carro[indice] = car;
			indice++;
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 * public int consultarVagas() { int cont = 0; for (int i = 0; i < VAGAS; i++) {
	 * if (carro[i].placa.equals("livre")) { cont++; } } if (cont > 0) { return 0; }
	 * else { return 1; } }
	 */

	public void exibirVeiculos() {
		for (int i = 0; i < VAGAS; i++) {
			if (carro[i] == null) {
				System.out.println(new StringBuilder().append("Vaga Nº: ").append(i).toString());
				System.out.println("LIVRE");
			} else {
				System.out.println(new StringBuilder().append("Vaga Nº: ").append(i).toString());
				System.out.println(new StringBuilder().append("Placa:   ").append(carro[i].placa).toString());
				System.out.println(new StringBuilder().append("Modelo:  ").append(carro[i].modelo).toString());
				System.out.println(new StringBuilder().append("Porte:   ").append(carro[i].tamanho).toString());
			}
			System.out.println("____________________________________________" + i);
		}
	}

	public double calcularEstrada(String placa) {
		int porte;
		double valorTotal;
		for (int i = 0; i < VAGAS; i++) {
			if ((carro[i] != null) && (carro[i].placa.equals(placa))) {
				porte = carro[i].tamanho;
				carro[i] = null;
				switch (porte) {
				case 1:
					valorTotal = VALORHORA;
					return valorTotal;
				case 2:
					valorTotal = VALORHORA + ((VALORHORA * 25) / 100);
					return valorTotal;
				case 3:
					valorTotal = VALORHORA + ((VALORHORA * 50) / 100);
					return valorTotal;
				}
			}
		}
		return 0;
	}

}
