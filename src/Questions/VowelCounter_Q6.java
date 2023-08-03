package Questions;

public class VowelCounter_Q6 {
	

	public static int contarVogais(String frase) {
        int count = 0;
        for (char c : frase.toCharArray()) {
            if (isVogal(c)) {
            	count++;
            }
        }
        return count;
    }

    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
