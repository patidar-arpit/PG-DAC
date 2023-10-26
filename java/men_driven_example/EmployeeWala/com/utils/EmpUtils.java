package com.utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.core.*;
import com.validate.Validate;

import custom_exception.EmployeeException;

public class EmpUtils {

	public static HashMap<Integer, Employee> sampleDataOfEmployee() {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		//Name, Date of joining, Phone Number, Aadhaar number 
		//String name, String phoneNo, EmpType type, String aadhaarNo, LocalDate joiningDate,Salary
		
		map.put(1, new Employee("salman", "786777678", EmpType.FTE, "12342324234", LocalDate.parse("2023-10-10")));
		map.put(1, new Employee("Arpit","9009395852",EmpType.valueOf("FTE"),"123456789012",LocalDate.parse("2023-10-10")));
		map.put(2, new Employee("Bittu","9009395882",EmpType.valueOf("PTE"),"123456789013",LocalDate.parse("2020-01-10")));
		map.put(1, new Employee("Jayesh","9009395812",EmpType.valueOf("FTE"),"123456789023",LocalDate.parse("2021-02-11")));
		map.put(1, new Employee("Madhura","9009395872",EmpType.valueOf("FTE"),"123456789019",LocalDate.parse("2023-10-02")));
		map.put(1, new Employee("Arpita","9009395850",EmpType.valueOf("PTE"),"123456789000",LocalDate.parse("2020-10-10")));
     
		return map;
	}

	public static void deleteById(HashMap<Integer, Employee> empMap, int empId) throws EmployeeException {
		
		Validate.validateEmpId(empId,empMap);
		
		Employee emp = empMap.remove(empId);
		
	}

	public static void findAddharNo(String aadhaarNo, HashMap<Integer, Employee> empMap) throws EmployeeException {
		// TODO Auto-generated method stub
	  String aadhaar =Validate.validateAadhaarNo(aadhaarNo);
	   
	   empMap.values()
	   .stream()
	   .filter(e->e.getAadhaarNo().equals(aadhaar))
	   .forEach(p->System.out.println(p));
		 
	}
	
	
	
	

}
