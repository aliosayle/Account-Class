import javax.lang.model.util.ElementScanner6;

public class driver
{
    public static void main(String[] args)
    {
        Account account1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        
        if(account1.withdraw(2500))
        System.out.println("Your balance is " + account1.getBalance());
        else
        System.out.println("please enter a valid amount");

        if(account1.deposit(3000))
        System.out.println("Your balance is " + account1.getBalance());
        else
        System.out.println("Please entr a valid amount");

        System.out.println("Your monthly rate is " + account1.getMonthlyInterest());
        System.out.println("This account was created on " + account1.getDate());
    }
}
