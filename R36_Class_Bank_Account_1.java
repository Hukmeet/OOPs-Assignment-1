class BankAccount {
    int accountNo;
    double balance;
    double interestRate;
    void deposit(double amnt) {
        this.balance+=amnt;
    }
}
class SavingsAccount extends BankAccount {
    double minBal=30000;
    void withdraw(double amnt) {
        if (this.balance-amnt < minBal) {
            System.out.println("Can't Withdraw!!!");
            return;
        }
        this.balance-=amnt;
    }
}
public class R36_Class_Bank_Account_1 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNo=1234567890;
        ba.balance=40000;
        ba.deposit(30000);
        System.out.println("Balance: "+ba.balance);
        SavingsAccount sa=new SavingsAccount();
        sa.balance=ba.balance;
        sa.withdraw(20000);
        System.out.println("Balance: "+sa.balance);
    }
}