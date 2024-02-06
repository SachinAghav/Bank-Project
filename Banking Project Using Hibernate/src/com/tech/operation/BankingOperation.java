package com.tech.operation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.admin.Banking;
import com.tech.most_common_class.HibernateUtil;

public class BankingOperation {
	   static Banking bank=new Banking(); 
	 static SessionFactory sf=HibernateUtil.getSessionFactory();
	
	public static void createacct()
	{
		while(true)
		{
			try
			{
		
		Session session = sf.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your Account Number");
		String acno=sc1.nextLine();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Your Aadhar Number xxxx-xxxx-xxxx");
		String Aadharno=sc2.nextLine();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Your Pan Number");
		String pan=sc3.nextLine();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter Your Mobile Number");
		String mono=sc4.nextLine();
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String pass=sc5.nextLine();
		
//		Banking bank=new Banking();
		bank.setCust_Name(name);
		bank.setAcc_No(acno);
		bank.setAadhar_No(Aadharno);
		bank.setPan_No(pan);
		bank.setMo_No(mono);
		bank.setPass(pass);
		session.save(bank);
		session.beginTransaction().commit();
		System.out.println("Dear "+name+"Your Account Created Successfully...");
			session.close();
	
			}
			catch(Exception  e)
			{
				System.out.println("Error: "+e.getMessage());
			}
			}
	}
	public static void showdetails()
	{
		while(true)
		{
			try
			{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Account Number");
		String acno=sc.nextLine();
		if(acno.equals(Banking.getAcc_No()))
		{
			System.out.println("Dear :"+bank.getCust_Name()+"Your Account Details");
			System.out.println("Customer Name    : " + bank.getCust_Name());
			System.out.println("Account Number   : "+bank.getAcc_No());
			System.out.println("Aadhar Number    : "+bank.getAadhar_No());
			System.out.println("Pan Number       :" +bank.getPan_No());
			System.out.println("Mobile Number    :" +bank.getMo_No());
			System.out.println("Password         :"+bank.getPass());
			
		}
		else
		{
			System.out.println("Please Enter Correct Account Number...");
			
		}
			}
		
		catch(Exception  e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		}
	}
	public static void deposit()
	{
		while(true)
		{
			try
			{
			
		Session session = sf.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Amount");
		double amt=sc.nextDouble();
		if(amt>=1000)
		{
			bank.setAmount(amt);
			session.save(bank);
			session.beginTransaction().commit();
			System.out.println("Successfully Deposited..!");
			
		}
		else
		{
			System.out.println("Amount Should Be Greater Than 1000");
			session.close();
		}
			}
		
		catch(Exception  e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
		}
    public static void checkbalance()
    {
    	while(true)
    	{
    		try
    		{
    	
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Account Number");
         String ac_no=sc.next();
         if(ac_no.equals(bank.getAcc_No()))
         {
        	 System.out.println("Customer Name     : "+bank.getCust_Name());
        	 System.out.println("Available Balance : "+bank.getAmount());
        	 
         }
         else
         {
        	 System.out.println("Incorrect Account Number");
        	 
         }
    		}
			catch(Exception  e)
			{
				System.out.println("Error: "+e.getMessage());
			}
    }
    	}
//    public static void withraw()
//    {
//    	Session session = sf.openSession();
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("");
//    	
//    }
    public static void main(String[] args) {
//		Banking Bank=new Banking();
		while(true)
		{
			try
			{
				Session session = sf.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice :\n1:Create Account \n2:Show Details \n3:Deposit \n4:Check Balance \n5:Withrawl");
	     int choice =sc.nextInt();
	     
	     switch(choice)
	     {
	     case 1:BankingOperation.createacct();
	    	 break;
	    	 
	     case 2:BankingOperation.showdetails();
	    	 break;
	    	 
	     case 3:BankingOperation.deposit();
	    	 break;
	    	 
	     case 4:BankingOperation.checkbalance();
	    	 break;
	    	 
//	     case 5:BankingOperation.withraw();
//	    	 break;
	     case 5:sf.close();
	    	 break;
	    	 
	     }
    
		}
			catch(Exception e)
			{
				
			}
		}
		
    }
}
