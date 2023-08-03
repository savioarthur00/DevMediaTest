package Questions;

public class InterestCalculation_Q8 {
	
	public static double calcularInvestimento(double capitalInicial, double taxaJuros, int tempoInvestimentoMeses) {
        double taxaJurosDecimal = taxaJuros / 100.0;
        double valorFinal = capitalInicial * Math.pow(1 + taxaJurosDecimal, tempoInvestimentoMeses);
        return valorFinal;
    }
}
