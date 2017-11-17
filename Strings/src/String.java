
public class String {
	
	public static String findLastWord (String input) {
		
		int goesIndex = input.indexOf("goes") + 4; 
		String subStr = input.subString(goesIndex,input.length());
		return subStr;
		
		
	}
	
	
	
	
	public static void main (String [] args) {
		
		System.out.println(findLastWord("doggoesbark"));
	}

}
