package com.tester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.core.Stock;
import com.utils.StockUtils;


public class StockTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Stock> stockMap = StockUtils.sampleDataOfStocks();

		try (Scanner sc = new Scanner(System.in);
			 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\PG-DAC\\java\\temp.txt"));
			 ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\PG-DAC\\java\\temp.txt")))
		{

			while (true) {
				System.out.println("1.ADD New Stock in the market");
				System.out.println("2.View Available stocks of the company ");
				System.out.println("3.Purchase Stocks");
				System.out.println("4.Sell Stoks");
				System.out.println("5.Save n exit");
				System.out.println("6.Read and display from the file.");
				System.out.println("Enter choice");

				try {
					switch (sc.nextInt()) {

					case 1:
//stock id (unique : string), stock name (string), company name(string) , price (double), closing date (Date) , quantity (int)
						System.out.println("Enter the stock details(id,name,company,price,closingDate,quantity");
						String id = StockUtils.validateId(sc.next(),stockMap);
						String name=sc.next();
						String CompanyName = sc.next();
						int price=sc.nextInt();
						LocalDate closingDate =StockUtils.validateDate(sc.next());
						stockMap.put(id, new Stock(id, name, CompanyName, price, closingDate, sc.nextInt()));
						System.out.println("Added Stock");
						break;

					case 2:
						System.out.println("ENter the name of company:");
						String cmp = sc.next();
						stockMap.values()
						.stream()
						.filter(p->p.getCompanyName().equals(cmp))
						.filter(p->p.getQuantity()>0)
						.forEach(p->System.out.println(p));
						
						break;

					case 3:
						System.out.println("Enter the stock id:");
						System.out.println("Enter the quantityof stock");
						StockUtils.purchaseStock(sc.next(),sc.nextInt(),stockMap);
						System.out.println("Stock Purchased.!");

						break;

					case 4:
						System.out.println("Enter the stock id:");
						System.out.println("Enter the quantityof stock");
						StockUtils.sellStock(sc.next(),sc.nextInt(),stockMap);
						System.out.println("Stock selled.!");
						
						break;

					case 5:

						out.writeObject(stockMap);
                        System.out.println("Copied into file");
                        System.exit(0);
						break;

					case 6:
						Map<String, Stock> s = new HashMap<String, Stock>();
						Object object=in.readObject();
						System.out.println("Reading.!");
						s=(Map)object;
						
						Collection<Stock> s1=s.values();
						for(Stock st:s1) {
							System.out.println(st);
						}
						
						
					default:
						System.out.println("Invalid Choice:");
						break;
					}

				} 
				catch (Exception e) {
					System.err.println(e.getMessage());
					sc.nextLine();
				}
			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
