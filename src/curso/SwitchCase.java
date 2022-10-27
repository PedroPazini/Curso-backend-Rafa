package curso;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;

		System.out.println("Digite um valor de a:");
		a = sc.nextInt();
		sc.close();

		switch (a) {
		case 1: {
			System.out.println("Domingo");
			break;
		}
		case 2: {
			System.out.println("Segunda");
			break;
		}
		case 3: {
			System.out.println("Terça");
			break;
		}
		case 4: {
			System.out.println("Qauarta");
			break;
		}
		case 5: {
			System.out.println("Quinta");
			break;
		}
		case 6: {
			System.out.println("Sexta");
			break;
		}
		case 7: {
			System.out.println("Sábado");
			break;
		}
		default:
			System.out.println("Nenhum dia");
			break;
		}

	}

}
