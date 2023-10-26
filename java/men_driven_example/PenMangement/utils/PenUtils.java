package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import com.core.Brand;
import com.core.Color;
import com.core.Pen;

import custom_exception.PenException;

public class PenUtils {

	public static HashMap<Integer, Pen> sampleData() {
		// TODO Auto-generated method stub
		HashMap<Integer, Pen> map =new HashMap<>();
		
	    map.put(1,new Pen(Brand.valueOf("CELLO"),Color.valueOf("GREY"),"Black","plastic",LocalDate.parse("2023-10-10"),10));
	    map.put(2,new Pen(Brand.valueOf("HAUSER"),Color.valueOf("SKYBKUE"),"BLUE","Alloy",LocalDate.parse("2022-10-25"),15));
	    map.put(3,new Pen(Brand.valueOf("PENTONIC"),Color.valueOf("BLACK"),"RED","STEEL",LocalDate.parse("2020-01-10"),10));
	    map.put(1,new Pen(Brand.valueOf("CELLO"),Color.valueOf("TRANSPARENT"),"GREEN","METAL",LocalDate.parse("2021-10-10"),10));
	    map.put(1,new Pen(Brand.valueOf("REYNOLDS"),Color.valueOf("BLUE"),"BLUE","PLASTIC",LocalDate.parse("2023-10-15"),10));



		return map;
	}

	public static void updatePen(int nextInt, String date,HashMap<Integer, Pen> map) throws PenException{
		
		Pen pen = map.get(nextInt);
		LocalDate d1 = LocalDate.parse(date);
		if( pen== null) 
			throw new PenException("Id of Pen is invalid.");
		
		pen.getBrdType().setStock(pen.getBrdType().getStock()+nextInt);
		pen.setUpdateDate(d1);
		
	}

	public static void applyDiscount(HashMap<Integer, Pen> map) {
		// TODO Auto-generated method stub
		map.values()
		.stream()
		.filter(p->Period.between(p.getUpdateDate(),LocalDate.now()).getMonths()> 3)
		.forEach(p->{
			p.setPrice(p.getPrice()-(0.2*p.getPrice()));
		});

	}

	public static void removePen(HashMap<Integer, Pen> map) {
		// TODO Auto-generated method stub
		map.values()
		.stream()
		.forEach(p->{
			if(Period.between(p.getListingDate(),LocalDate.now()).getMonths() <9) {
				if(Period.between(p.getUpdateDate(),LocalDate.now()).getMonths()> 3)
					 map.remove(p.getID());
			}       	
		});
	}

	public static void display(HashMap<Integer, Pen> map) {
		// TODO Auto-generated method stub
		map.values()
		.stream()
		.forEach(p->System.out.println(p));
		
	}
	
	

}
