//filename: SavingAccount.java
// SavingAccount class
public class SavingsAccount {
    static double annualIntrestRestRate;
   private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

   public void calculateMonthlyIntrest(){

       savingsBalance=savingsBalance+(savingsBalance*annualIntrestRestRate/12);

   }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

 public static void modifyIntrestRate(double intrestRate){
    annualIntrestRestRate=intrestRate/100;
 }
    }
    //filename: SavingsAccountTest.java
    // SavingsAccount testing class with the main() method
    