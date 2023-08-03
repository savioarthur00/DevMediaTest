package Application;

import static Questions.GradeAverage_Q7.calcularMedia;
import static Questions.InterestCalculation_Q8.calcularInvestimento;
import static Questions.Palindromo_Q4.isPalindromo;
import static Questions.Table_Q5.Table;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import Questions.Fatorial_Q3;
import Questions.PrimeNumbers_Q2;
import Questions.VowelCounter_Q6;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Calculadora");
            System.out.println("2 - PrimeNumbers");
            System.out.println("3 - Factorial");
            System.out.println("4 - Palindrome");
            System.out.println("5 - Table");
            System.out.println("6 - Vowel Counter");
            System.out.println("7 - Grade Average");
            System.out.println("8 - Interest Calculation");
            System.out.println("0 - Sair");

            System.out.print("\nDigite o número da questão que deseja resolver (ou 0 para sair): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    resolverCalculadora();
                    break;
                case 2:
                    resolverPrimeNumbers();
                    break;
                case 3:
                    resolverFactorial();
                    break;
                case 4:
                    resolverPalindrome();
                    break;
                case 5:
                    resolverTable();
                    break;
                case 6:
                    resolverVowelCounter();
                    break;
                case 7:
                    resolverGradeAverage();
                    break;
                case 8:
                    resolverInterestCalculation();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    
    public static void resolverCalculadora() {        
    	System.out.println("");
        System.out.println("---Você escolheu resolver a Calculadora!---");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resposta = 0;
       
        switch (operador) {
            case "+":
            	resposta = numero1 + numero2;
                break;
            case "-":
            	resposta = numero1 - numero2;
                break;
            case "*":
            	resposta = numero1 * numero2;
                break;
            case "/":
            	resposta = numero1 / numero2;
                break;
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
        }
       
        System.out.println("");
        System.out.println("Resultado: " + resposta);
        System.out.println("---------FIM ------------");
		
       
        
    }

    public static void resolverPrimeNumbers() {
    	System.out.println("");
        System.out.println("---Você escolheu resolver a questão de números primos!---");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		double numero1 = scanner.nextInt();
		
		if(numero1 <=0) {
			System.out.println("Não aceitamos números 0 ou negativos!");
		}else {
			boolean resultado = PrimeNumbers_Q2.isPrime(numero1);
	        
			 if(resultado) {
				 System.out.println("");
			      	System.out.println(numero1+", é primo!");
			 }else {
				 System.out.println("");
			     	System.out.println(numero1+", não é primo!");
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
		System.out.println("");
		System.out.println("Os 10 primeiros números primos são: "+ primos);
		System.out.println("---------FIM ------------");
		
    }

    public static void resolverFactorial() {
    	System.out.println("");
        System.out.println("---Você escolheu resolver a questão de fatorial!---");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero1 = scanner.nextInt();

        if (numero1 < 0) {
            System.out.println("O sistema não aceita valores negativos");
        } else {
            double fatorial = Fatorial_Q3.calcularFatorial(numero1);
            System.out.println("");
            System.out.println("O fatorial de " + numero1 + " é: " + fatorial);
            System.out.println("---------FIM ------------");
            
        }
    }

    public static void resolverPalindrome() {
    	System.out.println("");
        System.out.println("Você escolheu resolver a questão de palíndromo!");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
        	System.out.println("");
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
            System.out.println("---------FIM ------------");
        } else {
        	System.out.println("");
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
            System.out.println("---------FIM ------------");
        }
    }

    public static void resolverTable() {
    	System.out.println("");
        System.out.println("Você escolheu resolver a questão de tabela!");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        System.out.println("");
        System.out.println("Tabela de multiplicação do número " + number + ":");

        Table(number);
        System.out.println("---------FIM ------------");
        
        
    }

    public static void resolverVowelCounter() {
    	System.out.println("");
        System.out.println("Você escolheu resolver a questão de contagem de vogais!");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = VowelCounter_Q6.contarVogais(frase);
        System.out.println("");
        System.out.println("A frase possui " + vogais + " vogais.");
        System.out.println("---------FIM ------------");
        
    }

    public static void resolverGradeAverage() {
    	System.out.println("");
        System.out.println("Você escolheu resolver a questão de média de notas!");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira disciplina: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        
        DecimalFormat df = new DecimalFormat("#.##");
        String mediaFormatada = df.format(media);

        System.out.println("");
        System.out.println("A média das notas é: " + mediaFormatada);
        System.out.println("---------FIM ------------");
        
    }

    public static void resolverInterestCalculation() {
    	System.out.println("");
        System.out.println("Você escolheu resolver a questão de cálculo de juros!");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do capital inicial: ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo de investimento (em meses): ");
        int tempoInvestimentoMeses = scanner.nextInt();

        double valorFinal = calcularInvestimento(capitalInicial, taxaJuros, tempoInvestimentoMeses);
        
        DecimalFormat df = new DecimalFormat("#.##");
        String valorFormatado = df.format(valorFinal);
        
        System.out.println("");
        System.out.println("O valor final do investimento é: " +valorFormatado );
        System.out.println("---------FIM ------------");

    }
}
