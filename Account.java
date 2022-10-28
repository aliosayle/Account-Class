import java.util.*;

public class Account
{
    private int id;
    public double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    public Account()
    {
        dateCreated = new Date();
    }

    public Account(int i, double b)
    {
        id = i;
        if (b > 0)
            balance = b;
        else
            balance = 0;
        dateCreated = new Date();
    }

    public void setId(int i)
    {
        id = i;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double a)
    {
        Account.annualInterestRate = a;
    }

    public Date getDate()
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterest() / 100;
    }

    public boolean withdraw(double amount)
    {
        if(amount < balance)
        {
            balance -= amount;
            return true;
        }
        else
        return false;
    }

    public boolean deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            return true;
        }
        return false;
    }
}