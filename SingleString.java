package bufferbuilder;

public class SingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		  
	      String charArrayString = charArrayToString(charArray);
	      
	      System.out.println(charArrayString);
	      
	      
	  
	     int[] intArray = {1, 2, 3, 4, 5};
	     
         String intArrayString = intArrayToString(intArray);
         
         System.out.println(intArrayString);
         
         
      
         String[] stringArray = {"This", "is", "a", "string", "array"};
         
         String stringArrayString = stringArrayToString(stringArray);
         
         System.out.println(stringArrayString);
         
         
          
         String result=charArrayString+intArrayString+stringArrayString;
         System.out.println(result);
         
    	}
	

	private static String stringArrayToString(String[] stringArray) {
		// TODO Auto-generated method stub
		  StringBuilder result = new StringBuilder();
		  
		  for(int i=0;i<stringArray.length;i++) {
			  result.append(stringArray[i]).append(" ");
		  }
		return result.toString();
	}


	private static String charArrayToString(char[] charArray) {
		// TODO Auto-generated method stub
		  StringBuilder result = new StringBuilder();
		  
		  for(int i=0;i<charArray.length;i++) {
			  result.append(charArray[i]);
		  }
		return result.toString();
	}


	private static String intArrayToString(int[] intArray) {
		// TODO Auto-generated method stub
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<intArray.length;i++) {
			result.append(intArray[i]);
		}
		return result.toString().trim();
	}

}
