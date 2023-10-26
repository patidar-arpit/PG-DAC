package com.app.core;

import java.time.LocalDate;
import java.util.Comparator;

public class Customer{
      private  int customerId;
      private String fullName;
      private String email;
      private String password;
      private double registrationAmount;
      private LocalDate dob;
      private ServicePlan plan;
      private LocalDate lastSubDate;
      
      public LocalDate getLastSubDate() {
		return lastSubDate;
	}
	public void setLastSubDate(LocalDate lastSubDate) {
		this.lastSubDate = lastSubDate;
	}
	private static int idGenerator;
      
      static {
    	  idGenerator=0; //1//2
      }
      
      public Customer() {
    	  
      }
      
	public Customer(String fullName, String email, String password, double registrationAmount, LocalDate dob,
			ServicePlan plan,LocalDate d) {

		idGenerator++;
		this.customerId=idGenerator;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.lastSubDate=d;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
    
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer c =(Customer)o;
			return this.email.equals(c.getEmail());
		}
		
		return false;
	}
	
	//@Override
//	public int compareTo(Customer c) {
//		
//		return this.email.compareTo(c.getEmail());
//		
//	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", email=" + email
				+ ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + ", lastSubDate="
				+ lastSubDate + "]";
	} 
	
	// Not required Now 
	 
	
      
}
