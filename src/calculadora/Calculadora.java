package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		int userChoice = 1;
		
		do {
			userChoice = showCalculator();
			
			int result;
			
			Scanner scanner = new Scanner(System.in);
			
			if (userChoice == 1) {
				System.out.println("Digite um número: ");
				int num1 = scanner.nextInt();
				
				System.out.println("Digite outro número: ");
				int num2 = scanner.nextInt();
				
				result = num1 + num2;
				System.out.println("O resultado da"
						+ " soma entre " + num1 + " e "
						+ num2 + " é igual a " + result);
			} else if (userChoice == 2) {
				System.out.println("Digite um número: ");
				int num1 = scanner.nextInt();
				
				System.out.println("Digite outro número: ");
				int num2 = scanner.nextInt();
				
				result = num1 - num2;
				System.out.println("O resultado da"
						+ " subtração entre " + num1 + " e "
						+ num2 + " é igual a " + result);
			} else if (userChoice == 3) {
				System.out.println("Digite um número: ");
				int num1 = scanner.nextInt();
				
				System.out.println("Digite outro número: ");
				int num2 = scanner.nextInt();
				
				result = num1 * num2;
				System.out.println("O resultado da"
						+ " multiplicação entre " + num1 + " e "
						+ num2 + " é igual a " + result);
			} else if (userChoice == 4) {
				System.out.println("Digite um número: ");
				int num1 = scanner.nextInt();
				
				System.out.println("Digite outro número: ");
				int num2 = scanner.nextInt();
				
				result = num1 / num2;
				System.out.println("O resultado da"
						+ " divisão entre " + num1 + " e "
						+ num2 + " é igual a " + result);
			} else {
				System.out.println("Erro");
			}
		}
			
		while (userChoice > 0 && userChoice < 5);

	}
	
	public static int showCalculator() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("Calculadora Simples");
		System.out.println("----------------------------------------");
		System.out.println("Escolha a opção:");
		System.out.println("1 para soma \n2 para subtração \n3 para multiplicação"
				+ "\n4 para divisão\n");
		
		int choice = scanner.nextInt();
		
		return choice;
	}
}
