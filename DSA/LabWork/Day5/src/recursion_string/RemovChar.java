package recursion_string;

public class RemovChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabaccadaaaaaad";    //removing a using the recursion
		System.out.println(removChar(str,"",0));
		

	}

	private static String removChar(String str, String ans, int i) {
		// TODO Auto-generated method stub
		if(i>=str.length())
			  return ans;
		
		if(str.charAt(i)!='a')
			 ans = ans+str.charAt(i);
		
		return removChar(str, ans, i+1);
	}

}
