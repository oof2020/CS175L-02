/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double InterestPct;
   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double amount, double InterestRate)
   {
      balance = 0;
      InterestPct = InterestRate;
   }
   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("Deposited:" + amount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	   if(amount <= balance) {
		   balance = balance - amount;
		   System.out.println("withdrew:" + amount);
	   }
	   else {
		   System.err.println("Transaction canceled due to insufficient funds");
	   }

   }
   
   public void calcInterest() {
	   double Interest = balance * InterestPct;
	   balance = balance + Interest; 
	   System.out.println("Interet" + Interest);
   }
   
   
   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
}
