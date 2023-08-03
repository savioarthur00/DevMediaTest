package Application;

import static Questions.Palindromo_Q4.isPalindromo;

import java.util.Scanner;

public class App_Q4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" � um pal�ndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" n�o � um pal�ndromo.");
        }
		
        scanner.close();
		}
    

}
