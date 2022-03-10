package com.java8.jvm;

public class Calculater {

	void add(Account f, double addmoney) {
		synchronized (f) {
			f.setMoney(f.getMoney() + addmoney);
		}
	}
}

class Account {
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
