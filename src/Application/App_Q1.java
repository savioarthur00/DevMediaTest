package Application;
import java.util.Scanner;

import Questions.Calculadora_Q1;
public class App_Q1 {

	public static void main(String[] args) {
		
		//Primeira Quest�o
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite um operador ( + , - , * , / ): ");
        String operacao = scanner.next();     
        
        System.out.print("Digite outro n�mero: ");
        int numero2 = scanner.nextInt();
        
        double resposta = 0;
        
        switch (operacao) {
        case "+":
            resposta=Calculadora_Q1.Somar(numero1, numero2);
            break;
        case "-":
            resposta = Calculadora_Q1.Subtrair(numero1, numero2);
            break;
        case "*":
            resposta = Calculadora_Q1.multiplicar(numero1, numero2);
            break;
        case "/":
            resposta = Calculadora_Q1.dividir(numero1, numero2);
            break;
        default:
            System.out.println("Operador inv�lido!");
            scanner.close();
            return;
    }
        
        System.out.println("Resultado: " + resposta);       
        scanner.close();
             
		
		
		
	}

}
