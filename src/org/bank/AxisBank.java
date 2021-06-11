package org.bank;

public class AxisBank extends BankInfo {
    @Override
    public void deposit() {
    	System.out.println("Deposited amount is 23000");
    }
    public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
		
	}
}