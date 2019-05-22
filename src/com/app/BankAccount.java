package com.app;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		System.out.println("Empty constructor is called");
	}
	public BankAccount(String accountNumber,double balance,String customerName,String email,String phoneNumber) {
              this.accountNumber=accountNumber;
              this.balance=balance;
              this.customerName=customerName;
              this.email=email;
              this.phoneNumber=phoneNumber;
	}

	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
		System.out.println("Deposite of "+depositAmount+" Made,New Balance is "+this.balance);
	}
	public void withdrawn(double withdrownAmount) {
		if(this.balance - withdrownAmount <0) {
			System.out.println("Only "+this.balance+" Availabel ,Withdrawl is not Possible");
		}else {
			this.balance -=withdrownAmount;
			System.out.println("WithDraw of "+withdrownAmount+" is Processed,remaining balance "+this.balance);
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
