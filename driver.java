public class driver
{
    public static void main(String[] args)
    {
        Account account1 = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println("Your balance is " + account1.getBalance());
        System.out.println("Your monthly rate is " + account1.getMonthlyInterest());
        System.out.println("This account was created on " + account1.getDate());
    }
}