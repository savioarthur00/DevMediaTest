package Application;

import java.util.Scanner;

import Questions.Fatorial_Q3;

public class App_Q3 {
	
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um n�mero para calcular o fatorial: ");
     int numero1 = scanner.nextInt();

     if (numero1 < 0) {
         System.out.println("O sistema n�o aceita valores negativos");
     } else {
         double fatorial = Fatorial_Q3.calcularFatorial(numero1);
         System.out.println("O fatorial de " + numero1 + " �: " + fatorial);
     }

     scanner.close();

	}
	
	
	
}
