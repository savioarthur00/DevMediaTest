package Questions;

public class Palindromo_Q4 {
	
	  public static boolean isPalindromo(String palavra) {
	        int tamanho = palavra.length();
	        for (int i = 0; i < tamanho / 2; i++) {
	            if (Character.toLowerCase(palavra.charAt(i)) != Character.toLowerCase(palavra.charAt(tamanho - 1 - i))) {
	                return false;
	            }
	        }
	        return true;
	    }

}
