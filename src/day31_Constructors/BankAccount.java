package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= £" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){ //deposit action u icin amount u bilmemiz gerekiyor, ondan yaziyoruz
        if (amount <= 0){
            System.err.println("Depositing amount can not be zero or negative");
            return; //to exit the method
        }
        balance +=amount;
    }

    public void withdraw(double amount){
        if (amount > balance) {
            System.err.println("Insufficient balance ");
            return; //to exit the method
        }

        if (amount<=0){
            System.out.println("Withdrawing amount can NOT be negative or zero");
            return;
        }
        balance -= amount;
    }

}
