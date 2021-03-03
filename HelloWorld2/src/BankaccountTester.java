import java.util.Scanner;
public class BankaccountTester {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Balance amount:");
	double amount = in.nextDouble();
	System.out.println("Enter the interest rate for this account:");
	double InterstPct = in.nextDouble();


 	BankAccount myBankAccount= new BankAccount(amount, InterstPct);



 	System.out.println("Created new account with:" + amount); 
 	System.out.println("and the interest rate of:" + InterstPct);

 	System.out.println("Enter how much you would like to deposit:");
 	double depositamount= in.nextDouble();

 	myBankAccount.deposit(depositamount);

 	System.out.println("Enter how much you would like to withdraw:");
 	double withdrawamount= in.nextDouble();
 	in.nextLine();
 	myBankAccount.withdraw(withdrawamount);

 	System.out.println("Eneter how much you would like to withdraw:");
 	double withdrawamount2=in.nextDouble();
 	in.nextLine();
 	myBankAccount.withdraw(withdrawamount2);
 	System.out.println("Do you want to generate your interest, enter Yes");
 	String response=in.nextLine();

 	if (response.equals("Yes") ) {
 		myBankAccount.calcInterest();
 		System.out.println("This is your total Balance:" +myBankAccount.getBalance());
 			}

 	
}
}