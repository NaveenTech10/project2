package bufferbuilder;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String nameOne="Naveen"; 
     
     String nameTwo="Thilip";
      
System.out.println("Before swapping ");
System.out.println("String 1: "+nameOne+" "+"String 2: "+nameTwo);
System.out.println();
//append two string 
nameOne=nameOne+nameTwo;
System.out.println("Combine two string :"+nameOne);
System.out.println();
//store initial string in string 1..
nameTwo=nameOne.substring(0, nameOne.length()-nameTwo.length());
//store remaining string in string 2..
nameOne=nameOne.substring(nameTwo.length());

System.out.println("After swapping :");
System.out.println("String 1: "+nameOne+" "+"String 2: "+nameTwo);
	}
}
