package Application;

import static Questions.Table_Q5.Table;

import java.util.Scanner;

public class App_Q5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int number = scanner.nextInt();

        System.out.println("Tabela de multiplica��o do n�mero " + number + ":");

        Table(number);

        scanner.close();
	}

}
