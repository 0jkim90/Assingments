//vending machine with 5 choices
//accepts only $5,$1, dime, nickel, penny, and quarter
//can buy more than one item per purchase
//money can only be inserted until user enters "0" during the transaction
//returns correct amount of change
//let user know about insufficient amount if applicable

import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	int yesOrNo, drinkChoice, moneyChoice, 
		fiveCount=0, oneCount=0, quarterCount=0, dimeCount=0, nickelCount=0, pennyCount=0, 
		fiveChange=0, oneChange=0, quarterChange=0, dimeChange=0, nickelChange=0, pennyChange=0, 
		dk1Count=0, dk2Count=0, dk3Count=0, dk4Count=0, dk5Count=0;//variables for number of coins and bills that will be used during the transaction
		//dk = drink
	double totalAmount = 0, money = 0, change=0, difference; //not required but just thought it would make sense to show how much money is being used during the transaction 
		System.out.println("Welcome. Please enter the number of the drink you would like to purchase.");
			do  {
				System.out.println("1. Coke($1.23)		2. Sprite($2.74)	3. Ginger Ale($2.42)	4. Orange Juice($1.81)		5. Water($2.95)");
				drinkChoice = sc.nextInt();
					if (drinkChoice == 1){
						totalAmount = totalAmount +1.23;
						dk1Count++;}
					else if (drinkChoice == 2){
						totalAmount = totalAmount +2.74;
						dk2Count++;}
					else if (drinkChoice == 3){
						totalAmount = totalAmount +2.42;
						dk3Count++;}
					else if (drinkChoice == 4){
						totalAmount = totalAmount +1.81;
						dk4Count++;}
					else if (drinkChoice == 5){
						totalAmount = totalAmount +2.95;
						dk5Count++;}
				System.out.println("Would you like to purchase another drink?");
				System.out.println("1. Yes		2. No");
				yesOrNo = sc.nextInt();}
			while (yesOrNo == 1); 
		System.out.println("Your total amount is $" +String.format("%.02f", totalAmount)+".");
		System.out.println("We accept $5, $1, Quarter, Dime, Nickel and Penny.");
		System.out.println("Please Enter one payment at a time. Enter zero when you are finished.");
			do {
				do {
					money = (5*fiveCount)+(1*oneCount)+(0.25*quarterCount)+(0.1*dimeCount)+(0.05*nickelCount)+(0.01*pennyCount);
					difference = totalAmount - money;
					System.out.println("1. $5.00 	2. $1.00 	3. Quarter 		4. Dime	 	5. Nickel 	 6. Penny");
					System.out.println("$"+(String.format("%.02f", difference))+" left");
					moneyChoice = sc.nextInt();
					if (moneyChoice == 1)
						fiveCount++;
					else if (moneyChoice == 2)
						oneCount++;
					else if (moneyChoice == 3)
						quarterCount++;
					else if (moneyChoice == 4)
						dimeCount++;
					else if (moneyChoice == 5)
						nickelCount++;
					else if (moneyChoice == 6)
						pennyCount++;}
				while (moneyChoice != 0);
					System.out.println("you have put in $"+(String.format("%.02f", money))+", and your total was $"+(String.format("%.02f", totalAmount))+".");
				change = money - totalAmount;  //method to keep count of total amount of money entered
				if (money < totalAmount)System.out.println("Insufficient Fund. Please try again");}
			while (money < totalAmount);
				sc.close();			
			System.out.println("Here is/are your purchase(s): "+dk1Count+" Coke(s), "+dk2Count+" Sprite(s), "+dk3Count+" Ginger Ale(s), "+dk4Count+" Orange Juice(s), and "+dk5Count+" Water Bottles.");	
			System.out.println("Your change is $"+String.format("%.02f", change)+":");
			fiveChange =(int)change/5;	//conversion amount of change to number of coins and bills
			change= change - 5*fiveChange;
			oneChange = (int)change/1;
			change= change - 1*oneChange;
			quarterChange = (int)(change/0.25);
			change= change - 0.25*quarterChange;
			dimeChange = (int)(change/0.10);
			change= change - 0.10*dimeChange;
			nickelChange = (int)(change/0.05);
			change= change - 0.05*nickelChange;
			pennyChange = (int)(change/0.01);
			System.out.println(fiveChange+" Five Dollar Bill(s)");
			System.out.println(oneChange+" One Dollar Bill(s)");
			System.out.println(quarterChange+" Quarter(s)");
			System.out.println(dimeChange+" Dime(s)");
			System.out.println(nickelChange+" Nickel(s)");
			System.out.println(pennyChange+" Penny(-ies)");
				
	}	
}	
