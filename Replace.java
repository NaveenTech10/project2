package bufferbuilder;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "W*#O*#R*K^ ^@H!A*#R*%D*% @P:L*^A*^Y*#^H%A*^R*@D*@!";
        String pattern = "[^a-zA-Z\\s]";
        String result = input.replaceAll(pattern, "");

        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }

}
