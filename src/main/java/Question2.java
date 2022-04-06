import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question2 

{
	public static void main(String[] args) {
		
		//2. Create an ArrayList that has numbers 1 - 999 
		//and use streams to only collect all the prime numbers and put them in another ArrayList and print them.
	

		
	int initialSize = 999;
	ArrayList<Integer> numbers = new ArrayList<Integer>(initialSize);
	
	
	for (int i=1; i <=initialSize; i++)
	 {
	   numbers.add(i);
	   
	 }
	numbers.stream().forEach(s->System.out.println(s));
	
	List<Integer>Newlist=numbers.stream()
            .filter(Question2::isPrime)
            .collect(Collectors.toList());
	
	System.out.println("New list for Prime number are "+ Newlist);
}

	public static boolean isPrime(int numbers) {
	    return !IntStream.rangeClosed(2, numbers/2).anyMatch(i -> numbers%i == 0); 
	}
}
