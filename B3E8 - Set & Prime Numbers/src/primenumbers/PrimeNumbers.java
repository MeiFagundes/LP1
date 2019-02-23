package primenumbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mei
 */
public class PrimeNumbers {

    public static void main(String args[]){
        
        Scanner scan= new Scanner(System.in);
        Set<Integer> set = new HashSet();
        int temp;
        
        System.out.println("Type any amount of numbers: ");
        
        do {
            
            temp = scan.nextInt();
            if (temp != -1)
                set.add(temp);
            
        } while (temp != -1);
        
        for(Integer current : set){
            primeNumber(current);
        }
   }
    
    public static void primeNumber(int number){
        
        int temp;
	boolean isPrime = true;
	for(int i = 2; i <= number / 2; i++)
	{
           temp = number % i;
	   if(temp == 0)
	   {
	      isPrime = false;
	      break;
	   }
	}
        
        System.out.println("--------------------------");
	if(isPrime)
	   System.out.println(number + " is a Prime Number");
        else{
            System.out.println(number + " is not a Prime Number");
            primeNumberFactors(number);
        }

    }
    
    public static void primeNumberFactors(int number){

        Set set = new HashSet();
        
        System.out.println("Prime Factors of " + number + ": ");
        for(int i = 2; i< number; i++) {
           while(number % i == 0) {
              set.add(i);
              number = number/i;
           }
        }
        if(number > 2) {
           set.add(number);
        }
        
        for(Object current : set){
            System.out.println(current);
        }
    }
}
