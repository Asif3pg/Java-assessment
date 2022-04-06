import java.util.Scanner;

public class Question4 {
	
	//4. Program to count Vowels and Consonants in words.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
        String Orginal_Sring=sc.next();
		  int vowelCount = 0, ConsonantsCount = 0;    
          
	         
	     //String Orginal_Sring = "This is a really simple sentence";    
	            
	        //Converting entire string to lower case to reduce the comparisons    
		  Orginal_Sring = Orginal_Sring.toLowerCase();    
	            
	        for(int i = 0; i < Orginal_Sring.length(); i++) 
	        {    
	            //Checks whether a character is a vowel    
	            if(Orginal_Sring.charAt(i) == 'a' || Orginal_Sring.charAt(i) == 'e' || Orginal_Sring.charAt(i) == 'i' || Orginal_Sring.charAt(i) == 'o' || Orginal_Sring.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	            	vowelCount++;    
	        }    
	            //Checks whether a character is a consonant    
	            else if(Orginal_Sring.charAt(i) >= 'a' && Orginal_Sring.charAt(i)<='z') {      
	                //Increments the consonant counter    
	            	ConsonantsCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vowelCount);    
	        System.out.println("Number of consonants: " + ConsonantsCount);    
	    }    
	}


