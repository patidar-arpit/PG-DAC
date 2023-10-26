package utils;
import com.core.Pet;
import com.core.StatusOrder;

import custom_exception.MyException;

import java.util.HashMap;

import com.core.Category;
import com.core.Order;


public class Helper {
	

	public static HashMap<Integer, Pet> sampleDataOfPet() {
        HashMap<Integer,Pet> map = new HashMap<Integer, Pet>();
		
		map.put(101,new Pet(101,"Bull Dog",Category.valueOf("DOG"),1000,50));
		map.put(102,new Pet(102,"Jangli Cat",Category.valueOf("CAT"),3000,50));
		map.put(103,new Pet(103,"JERMAN DOG",Category.valueOf("DOG"),10000,50));
		map.put(104,new Pet(104,"LABRA DOG",Category.valueOf("DOG"),5000,50));
		map.put(105,new Pet(105,"LITTLE RABBIT",Category.valueOf("RABBIT"),9000,100));

		return map;
	}

	public static HashMap<Integer, Order> sampleDataofOrder() {
		// TODO Auto-generated method stub
        HashMap<Integer,Order> map = new HashMap<Integer, Order>();
        map.put(1, new Order(101, 5));
        map.put(2, new Order(102, 10));
        map.put(3, new Order(103, 15));
        map.put(4, new Order(105, 5));
        map.put(5, new Order(101, 20));

		
		return map;
	}

	public static int  authenticateUser(String email, String pass) throws MyException {
		
		if(email.equals("admin") && pass.equals("admin")) {
			System.out.println("Admin Logged In");
			return 1;
		}
		else if(email.equals("c1") && pass.equals("c1")){
			System.out.println("customer Logged in");
			return 0;
		}
		else {
			throw new MyException("Email or Password Wrong");
		}	
	}

	public static void updatePetDetails(HashMap<Integer, Pet> petMap, int petId) throws MyException {
		// TODO Auto-generated method stub
		
		Pet pet = petMap.get(petId);
		if(pet==null)
			throw new MyException("Pet Not found:");
		
		pet.setStocks(100);
		
	}

	public static Order orderPet(int petId, int quant, HashMap<Integer, Pet> petMap) throws MyException {
		// TODO Auto-generated method stub
		Pet pet =petMap.get(petId);
		if(pet ==null)
			throw new MyException("Pet Not Found");
		
		if(pet.getStocks()<quant)
			throw new MyException("Out of Stock:This quantity is not available.");
		
		pet.setStocks(pet.getStocks() - quant);
		
		return new Order(petId, quant);
		
	}

	public static void CheckStatus(int orderId, HashMap<Integer, Order> orderMap) {
		// TODO Auto-generated method stub
		orderMap.values()
		.stream()
		.filter(o->o.getOrderId()==orderId)
		.forEach(o->System.out.println(o.getStaus()));
		
	}

	public static void updateStatus(HashMap<Integer, Order> orderMap, int orderId) throws MyException {
		// TODO Auto-generated method stub
		Order o1 =orderMap.get(orderId);
		if(o1 ==null)
			throw new MyException("order Not Found");
		
		o1.setStaus(StatusOrder.valueOf("COMPLETED"));
		
	}

	

}
