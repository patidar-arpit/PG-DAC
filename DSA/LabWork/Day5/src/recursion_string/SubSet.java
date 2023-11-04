package recursion_string;

import java.util.ArrayList;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		ArrayList<String> l1 = new ArrayList<>();
		subSet("",s,l1);
		System.out.println(l1);

	}

	private static void subSet(String p,String u,ArrayList<String> ans) {
		// TODO Auto-generated method stub
		if(u.isEmpty()) {
			ans.add(p);
			return;
		}
		
		char ch = u.charAt(0);
		subSet(p+ch,u.substring(1),ans);
		subSet(p,u.substring(1),ans);
		
		
		
	}

}
