package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Oz",23582374);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        System.out.println("--------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun Teyze",5789630);

        System.out.println(account2);

        account2.deposit(20000);
        account2.checkBalance();





    }

}
