class BankAccount {
    int accountNo;
    double bal;
    double interestRate;
    void deposit(double amnt) {
        this.bal+=amnt;
    }
}
class SavingsAccount extends BankAccount {
    @Override
    void deposit(double rate) {
        bal+=bal*rate;
    }
}
class CheckingAccount extends BankAccount {
    void display() {
        System.out.println("Balance: "+bal);
    }
}
public class R38_Class_Bank_Account_2 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNo=1234567890;
        ba.bal=70000;
        ba.deposit(30000);
        SavingsAccount sa=new SavingsAccount();
        sa.accountNo=ba.accountNo;
        sa.bal=ba.bal;
        sa.deposit(0.5);
        CheckingAccount ca=new CheckingAccount();
        ca.accountNo=sa.accountNo;
        ca.bal=sa.bal;
        ca.display();
    }
}