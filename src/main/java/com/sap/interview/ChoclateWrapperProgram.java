package com.sap.interview;

public class ChoclateWrapperProgram {

	static int choclatesReceived(int choclates,int wrappers){
		if (choclates < wrappers){
			return 0;
		}
		
		int newChoclates = choclates/wrappers; //15/3=5
		return newChoclates+ choclatesReceived(newChoclates + choclates%wrappers,wrappers);
				 
	}

	static int getCount(int amount,int price, int noOfWrappers){
		int choclates = amount/price; // 15
		
		return choclates + choclatesReceived(choclates,noOfWrappers);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 15;
		int price = 1;
		int noOfWrappers = 3;
		
		int totalChoclates = getCount(amount, price, noOfWrappers);
		
		System.out.println("Total no. of choclates : "+ totalChoclates);

	}

}
