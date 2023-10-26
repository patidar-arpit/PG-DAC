package com.core;

import java.time.LocalDate;

public class Employee {
	
    //Name, Date of joining, Phone Number, Aadhaar number
	
	private String name;
	private String phoneNo;
	private EmpType type;
	private String aadhaarNo;
	private LocalDate joiningDate;
    private static int idGen;
    private int empId;
    
    
    
	
	
	

	public Employee(String name, String phoneNo, EmpType type, String aadhaarNo, LocalDate joiningDate) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.type = type;
		this.aadhaarNo = aadhaarNo;
		this.joiningDate = joiningDate;
		
	}





	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phoneNo=" + phoneNo + ", type=" + type
				+ ", aadhaarNo=" + aadhaarNo + ", joiningDate=" + joiningDate + "]";
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public EmpType getType() {
		return type;
	}
	public void setType(EmpType type) {
		this.type = type;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
    
    
    
	
	

}
