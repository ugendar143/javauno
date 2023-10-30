package com.unocarrier;

class person {
	String name;
	String aadharNo;
	String mobileNo;
	String address;
}

class Employee extends person {
	int id;
	String orgName;
	int salary;
}

interface Bank {
	void deposit(int amt);

	void withDraw(int amt);

	void checkBalance();
}

class ICICBank implements Bank {
	int accno;
	String name;
	int balance;

	public ICICBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From ICICBank:::Successfully deposited  amount..." + amt);
	}

	@Override
	public void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From ICICBank::::Successfully withdrawn  amount..." + amt);

	}

	@Override
	public void checkBalance() {
		System.out.println("From ICICBank::::Available Balance---->" + this.balance);

	}

}

class APGSBank implements Bank {
	int accno;
	String name;
	int balance;

	public APGSBank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		this.balance = this.balance + amt;
		System.out.println("From APGSBank:::Successfully deposited  amount..." + amt);
	}

	@Override
	public void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("From APGSBank::::Successfully withdrawn  amount..." + amt);

	}

	@Override
	public void checkBalance() {
		System.out.println("From APGSBank::::Available Balance---->" + this.balance);

	}

}

public class Banking {

	public static void main(String[] args) {
		Bank bank;

		bank = new ICICBank(10053, "ugendar", 6000);

		bank.checkBalance();
		bank.deposit(4000);

		bank.checkBalance();
		bank.deposit(125000);
		bank.checkBalance();

		bank = new APGSBank(14500, "Rajesh", 16000);

		bank.checkBalance();
		bank.deposit(60000);

		bank.checkBalance();
		bank.deposit(25000);
		bank.checkBalance();
	}
}