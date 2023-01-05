import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int accno=12345, input, pwd=4321;
		int inp = 0;
		double amnt=100000;
		double damnt;
		String uname = "Rathan";
		System.out.println("Choose Below Options:");
		
		System.out.println("1.Press 0 to Login");
		inp = in.nextInt();
		if(inp==0) {
		System.out.print("Please Enter Username:");
		uname = in.next();
		
		System.out.print("Please Enter the password:");
		pwd = in.nextInt();
		
		
		System.out.println();
		
		if(uname.equals("Rathan") && pwd == 4321) {
		do {
			System.out.println("1.Press 1 to know account details:");
			System.out.println("2.Press 2 to add amount:");
			System.out.println("3.Press 3 to withdraw amount:");
			System.out.println("4.Press 4 to Check Balance:");
			System.out.println("5.Press 5 to logout:");
			input = in.nextInt();
			
		switch(input) {	
		case 1: 
			
			System.out.println("Login Details:");
			
			System.out.println("Account details are:");
			System.out.println("Account number:"+ accno);
			System.out.println("BalanceAmount:"+ amnt);
			System.out.println("Username:"+ uname);
			System.out.println();
			break;
			
		case 2:
				System.out.print("Add the amount to deposit:");
				damnt = in.nextDouble();
				
			amnt = amnt + damnt;
			System.out.println("Amount deposited Rs."+ damnt + "Remaining Balance is Rs."+ amnt);
			break;
		
		case 3:
			
			System.out.println("Enter Amount to withdraw");
			damnt = in.nextDouble();
			
			if(amnt < 500) {
			System.out.println("Insufficient Balance");	
			}else {
				amnt = amnt - damnt;
			System.out.println("Withdraw succesful of Rs."+ damnt + "Remaining Balance is:"+amnt);	
			}
			break;
			
		case 4:
			System.out.println("The available balance is :"+amnt);
			break;
		
		case 5:
			System.out.println("Logging Out : Thank you for banking with us");
			System.exit(0);
			break;
			
		default:{	
			System.out.println("Please provide input between 1-4");
		} 
			}
		}while(input < 6);
		}else {System.out.println("Kindly enter proper login details");}
	}else {System.out.println("Kindly enter correct number");}
		in.close();
	}
} 