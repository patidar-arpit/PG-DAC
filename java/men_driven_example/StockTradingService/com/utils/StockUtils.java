package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import custom_exception.StockException;
import com.core.Stock;

public class StockUtils {

	public static HashMap<String,Stock> sampleDataOfStocks() {
		// TODO Auto-generated method stub
	//stock id (unique : string), stock name (string), company name(string) , price (double), closing date (Date) , quantity (int)

		HashMap<String, Stock> map = new HashMap<String, Stock>();
		map.put("abc-123", new Stock("abc-123","HDFC-LIFE","HDFC", 2000.2, LocalDate.parse("2024-10-10"), 100));
		map.put("xyz-123", new Stock("xyz-123","HDFC-HOME","HDFC", 1000.2, LocalDate.parse("2024-11-01"), 100));
		map.put("pqr-123", new Stock("pqr-123","PAYTM-LITE","PAYTM", 600.2, LocalDate.parse("2023-12-01"), 100));
		map.put("lmn-123", new Stock("lmn-000","ICICI-FUND","ICICI", 3000.2, LocalDate.parse("2025-10-10"), 100));

		return map;
	}

	public static String validateId(String id, HashMap<String, Stock> stocKMap) throws StockException {
		// TODO Auto-generated method stub
		if(stocKMap.containsKey(id))
			throw new StockException("Duplicate stocks.!");
		
		return id;
	}

	public static LocalDate validateDate(String next) throws Exception {
		// TODO Auto-generated method stub
		LocalDate closeDate = LocalDate.parse(next);
        if(closeDate.isBefore(LocalDate.now()))
        	throw new Exception("Closing Date should be in future");
		return closeDate;
	}

	public static void purchaseStock(String id, int quant, HashMap<String, Stock> stockMap) throws StockException {
		
		id = validateId(id, stockMap);
		Stock s = stockMap.get(id);
		if(s.getQuantity()<quant)
			throw new StockException("Insufficient Available Qunatity");
		
		s.setQuantity(s.getQuantity()+quant);
		
		
	}

	public static void sellStock(String id, int quant, HashMap<String, Stock> stockMap) throws StockException {
		// TODO Auto-generated method stub

		id = validateId(id, stockMap);
		Stock s = stockMap.get(id);
		if(s.getQuantity()<quant)
			throw new StockException("Insufficient Available Quantity");
		
		s.setQuantity(s.getQuantity()-quant);
		
	}

}
