package git.ehcruz.exercicio05;

public class CarroAlugado {
	String[] chassi = new String[3];
	int[] potencia = new int[3];
	boolean[] estadoCarro = new boolean[3];
	private int indice = 0;
	private int cont = 0;
	double valorAluguel10 = 250;
	double valorAluguel20 = 350;
	double total;

	public void cadastrarCarro(String iChassi, int iPotencia) {
		if (this.indice < 3) {
			chassi[this.indice] = iChassi;
			potencia[this.indice] = iPotencia;
			estadoCarro[this.indice] = false;
		} else {
			this.indice = 0;
			chassi[this.indice] = iChassi;
			potencia[this.indice] = iPotencia;
			estadoCarro[this.indice] = false;
		}
		System.out.println("Veículo cadastrado.");
		this.indice++;
	}

	public int reservarCarro(String iChassi) {
		while (this.cont < 3) {
			if (chassi[this.cont].equalsIgnoreCase(iChassi) && estadoCarro[this.cont] == false) {
				estadoCarro[this.cont] = true;
				this.cont = 0;
				return 1;
			}
			this.cont++;
		}
		this.cont = 0;
		return 0;
	}

	public void liberarCarro(String iChassi, int dias) {
		for (int i = 0; i < 3; i++) {
			if (chassi[i].equalsIgnoreCase(iChassi) && estadoCarro[i] == true) {
				switch (potencia[i]) {
				case 1:
					estadoCarro[i] = false;
					total = dias * valorAluguel10;
					System.out.println(new StringBuilder().append("Valor do aluguel: ").append(total).toString());
					break;
				case 2:
					estadoCarro[i] = false;
					total = dias * valorAluguel20;
					System.out.println(new StringBuilder().append("Valor do aluguel: ").append(total).toString());
					break;
				}
			}
		}
	}

	public void consultarCarro() {
		for (int i = 0; i < 3; i++) {
			System.out.println("____________________");
			System.out.println(new StringBuilder().append("Carro - chassi:   ").append(chassi[i]).toString());
			System.out.println(new StringBuilder().append("Carro - potência:   ").append(potencia[i]).toString());
			if (estadoCarro[i] == false) {
				System.out.println("Carro - estado:   Disponível");
			} else {
				System.out.println("Carro - estado:   Alugado");
			}
		}
	}
}
