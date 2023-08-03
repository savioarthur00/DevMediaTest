package Application;

import static Questions.Table_Q5.Table;

import java.util.Scanner;

public class App_Q5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        System.out.println("Tabela de multiplicação do número " + number + ":");

        Table(number);

        scanner.close();
	}

}
