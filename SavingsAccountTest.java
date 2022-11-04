public class SavingsAccountTest {
    public static void main(String[]arg){
        SavingsAccount saver1=new SavingsAccount();
        SavingsAccount saver2=new SavingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingsAccount.modifyIntrestRate(4);
        saver1.calculateMonthlyIntrest();
        saver2.calculateMonthlyIntrest();
        System.out.println("Balance for saver 1 is "+saver1.getSavingsBalance());
        System.out.println("Balance for saver 2 is "+saver2.getSavingsBalance());
         SavingsAccount.modifyIntrestRate(5);
         saver1.calculateMonthlyIntrest();
        saver2.calculateMonthlyIntrest();
        System.out.println("Balance for saver 1 on next month is "+saver1.getSavingsBalance());
        System.out.println("Balance for saver 2 on next month is "+saver2.getSavingsBalance());
    }
    }