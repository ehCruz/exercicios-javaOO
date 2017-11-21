package git.ehcruz.exercicio04;

import java.util.Scanner;

public class AlunoLab {
	static Scanner sc = new Scanner(System.in);
	static Laboratorio lab = new Laboratorio();

	public static void consultarLabs() {
		lab.consultarTodosLabs();
	}

	public static void consultaUmLab() {
		String laboratio;
		System.out.println("Informe o número da sala:");
		laboratio = sc.next();
		lab.consultarLab(laboratio);
	}
	
	public static void reservarLab() {
		String laboratorio;
		System.out.println("Informe o número da sala:");
		laboratorio =sc.next();
		lab.reservarLab(laboratorio);
	}
	
	public static void liberaLab() {
		String laboratorio;
		System.out.println("Informe o número da sala:");
		laboratorio =sc.next();
		lab.reservarLab(laboratorio);
	}
	
	public static void main(String[] args) {

		boolean loopMenu = true;
		int opMenu;
		while (loopMenu) {
			System.out.println("\n");
			System.out.println("1 - Consultar estado dos laboratórios");
			System.out.println("2 - Efetuar reserva de laboratório");
			System.out.println("3 - Liberar laboratório");
			System.out.println("4 - Consultar laboratório");
			System.out.println("9 - Sair \n");
			System.out.println("Digite sua opção:");
			opMenu = sc.nextInt();
			switch (opMenu) {
			case 1:
				// Consulta estado lab
				consultarLabs();
				break;
			case 2:
				// efetuar reserva de lab
				reservarLab();
				break;
			case 3:
				// liberar lab
				liberaLab();
				break;
			case 4:
				// consulta 1 lab
				consultaUmLab();
				break;
			case 9:
				System.out.println("Finalizando...");
				System.exit(0);
				loopMenu = false;
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}

	}

}
