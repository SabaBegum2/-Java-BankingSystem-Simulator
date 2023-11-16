/****************************************************************************************************
 * 
 * Name: Saba Begum
 * Access ID: Hg7548
 * Date: 10/03/2023
 * 
 ***************************************************************************************************/



package Lab04;
import java.lang.ProcessHandle.Info;
import java.util.Scanner;



public class BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		int Type;
		String holderName;
		int openingBalance;
		System.out.println("The Menu for Banking Operations: ");
	    System.out.println("1) Create an account: ");
	    System.out.println("2) Display account details: ");
	    System.out.println("3) Search by account Numeber: ");
	    System.out.println("4) Deposit an Ammount: ");
	    System.out.println("5) Withdraw an Ammount ");
	    System.out.println("6)Exit");
	    choice= sc.nextInt();
		
		public void CreateAccount() {
			String Info [][][][] = new String [100][100][100][100];
	        System.out.println("Create a new account");
	        for(int i=0;i<+Info.length;i++ ){
	            for(int j=0;j<1;j++){
	            	for(int k=0;k<1;k++) {
	            		for(int l=0;l<1;l++) {
	            	System.out.println("Customer ID number :");
	            		Info [i][j][k][l] = sc.next();
	            		System.out.println("Customer Name :");
	            		Info [i][j+1][k+1][l+1] = sc.next();
	            		System.out.println("Customer password :");
	            		Info [i][j+2][k+2][l+2] = sc.next();
	            		System.out.println("Customer's phone number :");
	            		Info [i][j+3][k+3][l+3] = sc.next();
	            	}
	            	}
	            	}
	        	}
	        	}
		public void displayAccount() {
			String Info [][][][] = new String [100][100][100][100];
	    	for(int i=0;i<Info.length;i++ ){
	    		for(int j=0;j<1;j++){
	    			for(int k=0;k<1;k++) {
	    				for(int l=0;l<1;l++) {
	    			System.out.println(Info [i][j][k][l]);  
	    			System.out.println(Info [i][j+1][k+1][l+1]);
	    			System.out.println(Info [i][j+2][k+2][l+2]);
	    			System.out.println(Info [i][j+3][l+3][l+3]);
	    			}
	    			}
	    		}
	    	}
	    	public void Search() {
	    		System.out.println("This functionality is pending ");
	    	}
	    	public void Deposit() {
	    		System.out.println("This functionality is pending ");
	    	}
	    	public void Withdraw() {
	    		System.out.println("This functionality is pending ");
	    	}
		
		while(choice!=6) {
		switch (choice) {
		case 1:
			for(int i=0;i<choice.length;i++) {
				choice[i].CreateAccount();
				}
			//CreateAccount();
			break;
		case 2:
			System.out.println("Enter the account Number ");
			String Info [i][j]=sc.next();
			//displayAccount();
			for(int i=0; i<choice.length;i++) {
				found=choice[i].search(info [i][j]);
				if(found) {
					break;
				}
			}
			break;
		
		case 3: 
			Search();
		
		case 4:
			Deposit();
		case 5: 
			Withdraw();
		case 6:
			if(choice==6) {
				break;
			}
	    	 }
		}
	}
}
