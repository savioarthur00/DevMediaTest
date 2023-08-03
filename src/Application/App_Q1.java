package Application;
import java.util.Scanner;

import Questions.Calculadora_Q1;
public class App_Q1 {

	public static void main(String[] args) {
		
		//Primeira Questão
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite um operador ( + , - , * , / ): ");
        String operacao = scanner.next();     
        
        System.out.print("Digite outro número: ");
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
            System.out.println("Operador inválido!");
            scanner.close();
            return;
    }
        
        System.out.println("Resultado: " + resposta);       
        scanner.close();
             
		
		
		
	}

}
