import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);


//variables 

double amount = 0;
amount = in.nextDouble();
BankAccount myBankaccount = new BankAccount(amount);
System.out.println("Enter the starting balance of your bank account: ");
amount = in.nextDouble();

System.out.println("Eneter how much would you like to withdraw: ");
double withdrawamount = in.nextDouble();
myBankaccount.withdraw(withdrawamount);

System.out.println("Eneter how much would you like to deposite: ");
double depositamount = in.nextDouble();
myBankaccount.deposit(depositamount); 

System.out.println(amount);


		
	}

}
