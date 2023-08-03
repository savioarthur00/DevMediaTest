package Questions;

public class Fatorial_Q3 {

	public static double calcularFatorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            double resultado = 1;
            for (int i = 2; i <= number; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
