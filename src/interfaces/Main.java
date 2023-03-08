package interfaces;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner choice=new Scanner(System.in);
		System.out.println("1.Savings Account \n 2.Current Account \n Enter your choice");
		int Type = choice.nextInt();
		System.out.println("enter the Account no:");
		String AccNo = choice.next();
		System.out.println("Name");
		String Name = choice.next();
		System.out.println("Balance");
		int Balance = choice.nextInt();
		System.out.println("year");
		float year = choice.nextFloat();
		
		if(Type==1) {
			Savings S=new Savings(AccNo,Name, Balance);
			System.out.println("Customer name : "+ Name +"\n"+ "Account No:"+ AccNo + "\n"+"Account balance :"+Balance+"\n"+"Maintenance charge for savings account is:"+S.calculateMaintenanceCharge(year));
		}
		else if(Type==2) {
			CurrentAccount T=new CurrentAccount (AccNo,Name, Balance);
			System.out.println("Customer name : "+ Name +"\n"+ "Account No:"+ AccNo + "\n"+"Account balance :"+Balance+"\n"+"Maintenance charge for current account is:"+T.calculateMaintenanceCharge(year));
		}
		choice.close();
			}
		

}
