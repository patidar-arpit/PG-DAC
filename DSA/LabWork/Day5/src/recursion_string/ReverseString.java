package recursion_string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcde";
		String revString =reverse(str,""); 
		    // the original string is not get rversed
		System.out.println(revString);
		
		String rApple = "abcappledapple";
		System.out.println(rmeoveApple(rApple));
		

	}

	private static String rmeoveApple(String rApple) {
		// TODO Auto-generated method stub
		if(rApple.isEmpty())
			return "";
		
		if(rApple.startsWith("apple")) {
			return rApple.substring(5);
		}
		else {
			return rApple.charAt(0)+rmeoveApple(rApple.substring(1));
		}
	}

	private static String reverse(String str,String revString) {
		
		if(str.isEmpty())
			return revString;
		
		revString = revString+str.charAt(str.length()-1);
		
		return reverse(str.substring(0,str.length()-1), revString);
		
	}
	private static String reverse1(String str, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i>=j)
			return str;
		
		str = str.substring(0,i)+str.charAt(j)+str.substring(i+1,j)+str.charAt(i)+str.substring(j+1,str.length());
		
		
		return reverse1(str, i+1, j-1);
	}

}
