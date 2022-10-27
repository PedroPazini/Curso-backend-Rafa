package curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Digite um valor de a:");
		a = sc.nextInt();
		
		System.out.println("Digite um valor de b:");
		b = sc.nextInt();
		
		System.out.println("Digite um valor de c:");
		c = sc.nextInt();
		sc.close();
		
		double delta = (Math.pow(b, 2))-4*a*c;
		
		if(delta > 0) {
			double x1 = (-b + (Math.sqrt(delta))) / 2*a;
			
			double x2 = (-b - (Math.sqrt(delta))) / 2*a;
			
			System.out.printf("x1: %.2f  x2: %.2f",x1, x2);
		} else {
			System.out.println("Raiz inválida!");
		}
		
		
		
	}

}
