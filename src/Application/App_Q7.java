package Application;

import static Questions.GradeAverage_Q7.calcularMedia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App_Q7 {
	
	public static void main(String[] args) {
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

	        System.out.println("A média das notas é: " + mediaFormatada);

	        scanner.close();
	}

}
