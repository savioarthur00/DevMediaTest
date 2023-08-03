package Questions;


public class PrimeNumbers_Q2 {

	
	public static boolean isPrime(double number) {
		
		for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}
	
	public static boolean numbersPrime(int number) {
	
		
		for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
               return false;
               
            }
            
		}
		return true;
		
		
		
	
		
	}
	
}
