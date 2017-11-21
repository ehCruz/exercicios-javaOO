package git.ehcruz.exercicio04;

public class Laboratorio {
	String[][] labsFaculdade = { { "1", "TI  ", "livre" }, { "2", "Eng ", "livre" },
			{ "3", "Adm ", "livre" }, { "4", "Cont", "livre" } };

	public void consultarTodosLabs() {
		System.out.println("Nº Lab |     Curso     | Disponibilidade");
		for (int i = 0; i < labsFaculdade.length; i++) {
			for (int j = 0; j < labsFaculdade[i].length; j++) {
				System.out.print("   " + this.labsFaculdade[i][j] + "       ");
			}
			System.out.println();
		}
	}

	public void consultarLab(String idLab) {
		String teste;
		for (int i = 0; i < labsFaculdade.length; i++) {
			teste = labsFaculdade[i][0];
			if (teste.equals(idLab)) {
				System.out.println("Nº Lab | Curso  | Disponibilidade");
				System.out.print(new StringBuilder().append(this.labsFaculdade[i][0]).append("        "));
				System.out.print(new StringBuilder().append(this.labsFaculdade[i][1]).append("        "));
				System.out.print(this.labsFaculdade[i][2]);
				break;
			}
		}
	}

	public void reservarLab(String idLab) {
		String teste;
		for (int i = 0; i < labsFaculdade.length; i++) {
			teste = labsFaculdade[i][0];
			if (teste.equals(idLab)) {
				if (labsFaculdade[i][2].equals("livre")) {
					System.out.println("Laboratorio reservado.");
					labsFaculdade[i][2] = "reservado";
					break;
				}
			}
		}
	}
	
	public void liberarLab(String idLab) {
		String teste;
		for (int i = 0; i < labsFaculdade.length; i++) {
			teste = labsFaculdade[i][0];
			if (teste.equals(idLab)) {
				if (labsFaculdade[i][2].equals("reservado")) {
					System.out.println("Laboratorio liberado.");
					labsFaculdade[i][2] = "livre";
					break;
				}
			}
		}
	}
}
