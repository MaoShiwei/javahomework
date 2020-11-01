import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated = new java.util.Date();
    public Account(){
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public int setId(int newId){
        id = newId;
        return id;
    }

    public double setBalance(double newBalance){
        balance = newBalance;
        return balance;
    }

    public double setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return balance*annualInterestRate/1200;
    }

    public double withDraw(double withdraw){
        if (withdraw > balance){
            System.out.println("余额不足，请输入正确金额！");
        }
        else{
            balance = balance - withdraw;
        }
        return balance;
    }

    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    public static void main(String[] args){
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);

        System.out.println("账户ID为：" + account.getId());
        System.out.println("账户内余额为：" + account.getBalance());
        System.out.println("账户月利息为：" + account.getMonthlyInterest());
        System.out.println("账户开户日期为：" + account.getDateCreated());
    }
}
