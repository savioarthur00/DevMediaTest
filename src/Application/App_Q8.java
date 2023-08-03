package Application;

import static Questions.InterestCalculation_Q8.calcularInvestimento;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App_Q8 {

	public static void main(String[] args) {
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
        
        System.out.println("O valor final do investimento é: " +valorFormatado );

        scanner.close();
	}
	
}
