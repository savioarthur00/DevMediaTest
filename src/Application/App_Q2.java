package Application;

import java.util.ArrayList;
import java.util.Scanner;

import Questions.PrimeNumbers_Q2;

public class App_Q2 {

	public static void main(String[] args) {
		//Segunda quest�o 
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite um n�mero inteiro: ");
		double numero1 = scanner.nextInt();
		
		if(numero1 <=0) {
			System.out.println("N�o aceitamos n�meros 0 ou negativos!");
		}else {
			boolean resultado = PrimeNumbers_Q2.isPrime(numero1);
	        
			 if(resultado) {
			      	System.out.println(numero1+", � primo!");
			 }else {
			     	System.out.println(numero1+", n�o � primo!");
			 }
			
		}
		  
		//Lista de primos 
		

		int number=2;
		int contador =10;
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		while (contador >0) {
            if (PrimeNumbers_Q2.numbersPrime(number)) {
                primos.add(number);
                contador--;
            }
            number++;
        }
		System.out.println("Os 10 primeiros n�meros primos s�o: "+ primos);
		
		        
		           
		 scanner.close(); 
		       

	}

}
