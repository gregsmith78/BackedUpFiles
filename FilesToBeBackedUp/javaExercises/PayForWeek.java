import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class PayForWeek {
  
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    
    double hours;
    double wage;
    double totalPay;
    double overTimePay;
    
    
    System.out.println("Please enter number of hours worked: ");
    hours = input.nextDouble();
    
    System.out.println("Please enter hourly wage: ");
    wage = input.nextDouble();
    
   
   
    if (hours > 40) {
       overTimePay = wage * 1.5 * (hours - 40) + (wage * (hours - (hours - 40)));
       NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.US);
       String payFormatted2 = formatter2.format(overTimePay);
      
       System.out.println("Your overtime pay is: " + payFormatted2);
        
    } else {
       totalPay = hours * wage; 
       NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
       String payFormatted = formatter.format(totalPay);
        
       System.out.println("Your pay for the week is: " + payFormatted);
}
    }
      
    
    
    
  
   
}



