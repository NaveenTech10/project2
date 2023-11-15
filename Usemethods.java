package bufferbuilder;

public class Usemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//STRING BUFFER
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb);
		
		sb.append("World");
		System.out.println(sb);
		
//		 I have a doubt in these method 
		sb.insert(10,"Beautiful");
		System.out.println(sb);
		
		sb.delete(6, 10);
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		
		StringBuilder sbu = new StringBuilder("Hello");
		
		char ch = sbu.charAt(1);
		System.out.println(ch);
		
		sbu.setCharAt(1, 'a');
		System.out.println(sbu);
		
		String result=sbu.substring(1);
		System.out.println(result);
		
		String resultOne=sbu.substring(1, 4);
		System.out.println(resultOne);
	}

}
