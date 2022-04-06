

//3. Create a method that reverses the string without using any library method as below:
//- Input: Hello This is Original String
//- Output: String Original is This Hello


public class Question3 {

	public static void main(String[] args) {
String Ori= "Hello This is Original String";
		
		String wordsArray []=Ori.split(" ");
		
		
		String Rewords ="";
		
		
			for(int i =wordsArray.length-1; i>=0;i--) {
			
				Rewords=Rewords+wordsArray[i]+" ";
			}
		
		
		System.out.println(Rewords);//String Original is This Hello 
	}
		

	}


