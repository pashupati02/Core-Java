package mainfile;

import java.util.Scanner;

import testPackage.TestClass;



public class StmFiles 
{

		static TestClass obj1 = new TestClass();
	
	
	public static void main (String[] args)
	{
	System.out.println("Paytm UPI India's Most-loved Payments App");
	System.out.println("Choose Your Option");
	System.out.println("1 :UPI Money Transfer");
	System.out.println("2 :Recharge Prepaid Mobile");
	System.out.println("3 :Pay Electricity Bill");
	System.out.println("4 :Recharge DTH Connection");
	System.out.println("5 :Pay Landline Bill ");
	System.out.println("6 :Buy Insurance");
	System.out.println("7 :Close Application");
	Scanner obj = new Scanner(System.in);
	int option = obj.nextInt();
	boolean flag = true;
	do {
		
		switch (option) {
		case 1:
		{ 
			TestClass.Add(56, 44);
			int c = obj1.sub(5,3);
			System.out.println(c);
			System.out.println("Enter UPI Id ");
			String s1 =obj.next();	
			System.out.println("Enter Your Ammount ");
			obj.nextInt();
			System.out.print("Enter Message :");
			obj.next();
			System.out.print("Enter UPI Pin **** :");
			obj.nextInt();
			
			System.out.println("Your Transicition is Done to "+s1);
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
		case 2:
		{
			System.out.print("Enter Mobile no to Recharge :");
			long m1 = obj.nextLong();	
			System.out.println("Choose Your Operator ");
			System.out.println("1 Airtel \n2 Jio \n3 VI ");
			obj.nextInt();
			System.out.print("Enter Your Ammount");
			obj.nextInt();
			System.out.println("Enter UPI Pin **** ");
			obj.nextInt();
			System.out.println("Your Recharge is Done to "+m1);
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
		case 3:
		{
			System.out.print("Enter Your Consumer no to Recharge : ");
			int m1 = obj.nextInt();	
			System.out.print("Enter Your Ammount :");
			obj.nextInt();
			System.out.print("Enter UPI Pin **** : ");
			obj.nextInt();
			System.out.println("Your Eletricity Recharge is Done to "+m1);
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
		case 4:
		{
			System.out.print("Enter Your C-no to Recharge DTH : ");
			int m1 = obj.nextInt();	
			System.out.println("Choose Your Service Provider \n1 :Dish Tv \n2 :Airtel \n3 :Tata Sky");
			int b1 = obj.nextInt();
			switch(b1){
				case 1:
				{ System.out.println("Choose your plan Ammount \nfor 1 months => 345 \nfor 3 months =>900 \nfor 1 year => 3000  ");
				 break;
				}
				case 2:
				{ System.out.println("Choose your plan Ammount \nfor 1 months => 300 \nfor 3 months =>500 \n for 1 year => 1800 ");
				 break;
				}
				case 3:
				{ System.out.println("Choose your plan Ammount \nfor 1 months => 245 \nfor 3 months =>400 \n for 1 year => 1000  ");
				 break;
				}
				default :
					System.out.println("You are inter invalid input ");
				}
			System.out.print("Enter Your Ammount :");
			
			obj.nextInt();
			System.out.print("Enter UPI Pin **** : ");
			obj.nextInt();
			System.out.println("Your DTH Recharge is Done to "+m1);
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
		case 5:
		{
			System.out.print("Enter Your Land line no : ");
			int m1 = obj.nextInt();	
			System.out.print("Choose Your Service Provider \n1 :Dish Tv \n2 :Airtel \n3 :Tata Sky");
			System.out.print("Enter Your Ammount :");
			obj.nextInt();
			System.out.print("Enter UPI Pin **** : ");
			obj.nextInt();
			System.out.println("Your Landline Recharge is Done to "+m1);
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
		case 6:
		{
			System.out.print("Click Here To Buy Insurance : ");
			
			System.out.print("Choose Your plan \n1 :Mobile \n2 :Term  life \n3 :Vehiacle");
			obj.nextInt();	
			System.out.print("Enter Your Ammount :");
			obj.nextInt();
			System.out.print("Enter UPI Pin **** : ");
			obj.nextInt();
			System.out.println("Your Insurance is Confirm to ");
			System.out.println("Thank you {*} \nChoose your option \n1 :UPI Money Transfer\n2 :Recharge Prepaid Mobile \n3 :Pay Electricity Bill Enter \n4 :Recharge DTH Connection \n5 :Pay Landline Bill \n6 :Buy Insurance \n7 for Close the App");
			option = obj.nextInt();
			break;
		}
							
			
		case 7:
			System.out.println("Thank You");
			System.out.println("Paytm Made IN INDIA");
			flag = false;
			break;
		
		default:
			System.out.println("Sorry you are not entered predefined option.");

			
			System.out.print("Please enter a respective option: ");
			option = obj.nextInt();
			if(option < 1 || option > 7) {
				System.out.println("Sorry you are not entering accepted options");
				option = 7;
			    
			    } 
			
		
		}
		
	}
	while(flag);
	
	
	obj.close();

}
}

