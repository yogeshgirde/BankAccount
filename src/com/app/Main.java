package com.app;


public class Main {

	public static void main(String[] args) {
		BankAccount bk=new BankAccount("1200127475",100.00,"YogeshGirde","Yogeshgirde21@gmail.com","998464131113");
		System.out.println("My Account No :- "+bk.getAccountNumber());
		System.out.println("Account Balance is :- "+bk.getBalance());
		System.out.println("User Name :- "+bk.getCustomerName());
		System.out.println("User Email Id :- "+bk.getEmail());
		System.out.println("User Phone Numbers :- "+bk.getPhoneNumber());
	}
}