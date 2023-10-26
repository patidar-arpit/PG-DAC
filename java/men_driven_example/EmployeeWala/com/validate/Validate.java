package com.validate;

import java.time.LocalDate;
import java.util.HashMap;

import com.core.EmpType;
import com.core.Employee;

import custom_exception.EmployeeException;

public class Validate {
	
	

	public static Employee ValidateAllInputs(String name, String phoneNo,EmpType type,String aadhaarNo, String joiningDate) throws EmployeeException {
		// TODO Auto-generated method stub
	   //String name, String phoneNo, EmpType type, String aadhaarNo, LocalDate joiningDate
		
        phoneNo =validatePhone(phoneNo);
        aadhaarNo=validateAadhaarNo(aadhaarNo);
        LocalDate date = validateDate(joiningDate);
        
        return new Employee(name, phoneNo,type , aadhaarNo, date);
	}

	public static LocalDate validateDate(String joiningDate) {
		// TODO Auto-generated method stub
		return LocalDate.parse(joiningDate);
	}

	public static EmpType valiateType(String type) {
		// TODO Auto-generated method stub
		return EmpType.valueOf(type);
	}

	public static String validateAadhaarNo(String aadhaarNo) throws EmployeeException{
		if(aadhaarNo.matches("^\\\\S+$"))
			throw new EmployeeException("aadhar No should be numeric only");
 		
		if(aadhaarNo.length()<12 ||aadhaarNo.length()>12)
			throw new EmployeeException("aadhar No should be of length 12");
		
		return aadhaarNo;

		
	}

	public static String validatePhone(String phoneNo) throws EmployeeException {
		// TODO Auto-generated method stub
		if(!phoneNo.matches("^[0-9]*$"))
			throw new EmployeeException("phone No should be numeric only");
		if(phoneNo.length()<10 || phoneNo.length()>10)
			throw new EmployeeException("phone No should be of length 10");
		
		return phoneNo;
	}

	
	public static void validateEmpId(int empId, HashMap<Integer, Employee> empMap) throws EmployeeException {
		// TODO Auto-generated method stub
		if(!empMap.containsKey(empId))
			throw new EmployeeException("Id not found");
		
	}

}
