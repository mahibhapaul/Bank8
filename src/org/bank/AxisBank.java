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
		System.out.println("saving");
		System.out.println("fixed");
		System.out.println("deposit");

		int a1=23,b=54,c=44;
		if(a1>b&&a1>c) {
			System.out.println("a is greater");
		}
		else if(b>a1&&b>c){
			System.out.println("b is greater");
		}
		else if(c>a1&&c>b) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("b and c have same value");
			}

			while(a1==b)
			{
			System.out.println("values of a and b are identical ");
		a1++;
			}
			do {
				System.out.println(a);
				b++;
			
			}
			while(a1==b);
		}

		
		

	}
