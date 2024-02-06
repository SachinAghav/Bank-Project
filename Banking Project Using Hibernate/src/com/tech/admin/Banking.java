package com.tech.admin;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Banking {
      @Id
	  private static String Acc_No;
	  
	  private static String Cust_Name;
	  
	  private static String Aadhar_No;
	  
	  private static String Pan_No;
	  
	  private static int Birth_Date;
	  
	  private static String Mo_No;
	  
	  private static String Pass;
	  
	  private static double Amount;
	  
	  private static int Pin;

	public static String getAcc_No() {
		return Acc_No;
	}

	public static void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}

	public static String getCust_Name() {
		return Cust_Name;
	}

	public static void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}

	public static String getAadhar_No() {
		return Aadhar_No;
	}

	public static void setAadhar_No(String aadhar_No) {
		Aadhar_No = aadhar_No;
	}

	public static String getPan_No() {
		return Pan_No;
	}

	public static void setPan_No(String pan_No) {
		Pan_No = pan_No;
	}

	public static int getBirth_Date() {
		return Birth_Date;
	}

	public static void setBirth_Date(int birth_Date) {
		Birth_Date = birth_Date;
	}

	public static String getMo_No() {
		return Mo_No;
	}

	public static void setMo_No(String mo_No) {
		Mo_No = mo_No;
	}

	public static String getPass() {
		return Pass;
	}

	public static void setPass(String pass) {
		Pass = pass;
	}

	public static double getAmount() {
		return Amount;
	}

	public static void setAmount(double amount) {
		Amount = amount;
	}

	public static int getPin() {
		return Pin;
	}

	public static void setPin(int pin) {
		Pin = pin;
	}
}
