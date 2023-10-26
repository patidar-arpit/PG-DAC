package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reading the date from the file;
		ArrayList<String []> str=new ArrayList<String []>();
		
		
		try(BufferedReader bReader= new BufferedReader(new FileReader("D:\\PG-DAC\\java\\tansaction.txt"))){
			String s = "";
			while((s = bReader.readLine())!=null) {
				
				String [] s1 = s.split(",");
				str.add(s1);
				
			}
			
			double sum=0;
			double maxDepositAmount=0;
			double shoppingExpenses=0;
			double maxWithdrawnAnount=0;
			String dateString="";
			
			for(int i=0;i<str.size();i++) {
				String [] str1 = str.get(i);
				double intVal = Double.valueOf(str1[3]);
				sum =sum + intVal;
				
				if(intVal>maxDepositAmount)
					maxDepositAmount=intVal;
				if(str1[1].equals("Shopping"))
					shoppingExpenses+=Double.valueOf(str1[2]);
				
				if(Double.valueOf(str1[2])>maxWithdrawnAnount) {
					maxWithdrawnAnount = Double.valueOf(str1[2]);
					dateString=str1[0];
				}
					
				
				
				
			}
			
			System.out.println("Sum of all Deposits:"+sum);
			System.out.println("Maximum of all Deposit Amount:"+maxDepositAmount);
			System.out.println("Shopping Expenses:"+shoppingExpenses);
			System.out.println("Maximum amount Withdraawn on date:"+dateString);
			
			
			
			
			
			
		}
		catch (Exception e) {
			System.out.println("Hello");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
