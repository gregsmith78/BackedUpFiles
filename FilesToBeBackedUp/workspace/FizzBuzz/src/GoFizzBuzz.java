
public class GoFizzBuzz {

	public static void main(String[] args) {
		
		      
		        for (int i = 0; i <= 100; i++) {
		            if (i % 4 == 0 && i % 7 == 0) {
		                System.out.println("FizzBuzz");
		            }
		            else if (i % 4 == 0) {
		                System.out.println("Fizz");
		            }
		            else if (i % 7 == 0) {
		                System.out.println("Buzz");
		            }
		            else {
		                System.out.println(i);
		            }
		        }
		    }
		
	}


