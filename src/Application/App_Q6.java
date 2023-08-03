package Application;

import java.util.Scanner;

import Questions.VowelCounter_Q6;

public class App_Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = VowelCounter_Q6.contarVogais(frase);

        System.out.println("A frase possui " + vogais + " vogais.");
        

        scanner.close();
	}
}
