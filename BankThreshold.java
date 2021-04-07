import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int months;
//getting intial account balance along with interest rate
System.out.println("Please enter starting balance: ");
int balance = in.nextInt();

System.out.println("Please enter the interest rate for the account: ");
double intPct = in.nextDouble();
//creating a bank account to calculate
BankAccount myBankAccount = new BankAccount(balance, intPct);
//getting the threshold through a loop 
System.out.println("Enter the threshold for your account to reach or to 'end': ");
while (in.hasNextDouble()) {
	double threshold = in.nextDouble();
	months = 0;
	//loop that only calculates the interest until you reach the threshold
	while (myBankAccount.getBalance() < threshold) {
		months++;
		myBankAccount.calcInterest();
	}
	//statement that print out the text to inform the user how long it would take to reach threshold
	System.out.println("It would take "+months+ " months to reach your threshold" );
	//statement should restart program or end it depending on what the user decides to do
	System.out.println("Enter the threshold for your account balance to reach or to 'End': ");
}


	}

}





