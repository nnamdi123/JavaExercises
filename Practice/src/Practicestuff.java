
public class Practicestuff {
	

	
	/*public static int addnums (int a, int b) {
		
		int sum = a + b;
		return sum;
	}

	public static void main (String [] args) {
		
		//System.out.println(addnums(2,3));
		System.out.println(twoChar("The"));
		
	}


	public static String twoChar(String word) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
			word.charAt(i);
		}
	
		return word;
		
	} */
	
	//--------------------------------------------------------------------
	//doubleChar("hello");
	
	public String doubleChar (String input) {
	   String tmp = "";
	   
	   for(int i = 0; i < input.length(); i++) {
		   tmp += input.charAt(i);
		   tmp += input.charAt(i);
	   }
	   return tmp;
	}
	
	
	
	public String sandwich (String input) {
		
		int firstBreadIndex = input.indexOf("bread") + 5;
		int lastBreadIndex = input.lastIndexOf("bread");
		String inbetweenBread = input.substring(firstBreadIndex, lastBreadIndex);
		return inbetweenBread;
	}
	
	public int bunnyEars(int numOfBunnies) {
		if(numOfBunnies == 0) {
			
		}
			return 0;
	}
	}
