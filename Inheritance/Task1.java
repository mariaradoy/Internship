//Create a class BankAccount with the following properties: account number and account balance.
//Implement encapsulation principle to create the following scenario...

class BankAccount{
    private int number;
    private double balance;

    public BankAccount(int number, double balance){
        this.number = number;
        this.balance = balance;
    }

    public void addBalance(double money){
        this.balance += money;
    }
    public double getBalance(){
        return this.balance;
    }

    public double getNumber(){
        return this.number;
    }

    public void transferBalance(double money, BankAccount account){
        if(this.balance > money){
        this.balance -= money;
        account.balance += money;
        } else {
            System.out.println("You can't make this transfer");
        }
    }
}

public class methods {

    public static void main(String[] args) {
        BankAccount A1 = new BankAccount(1, 0);
        A1.addBalance(105);

        BankAccount B2 = new BankAccount(2, 0);
        B2.addBalance(95);

        BankAccount C3 = new BankAccount(3, 0);
        C3.addBalance(35);

        System.out.println("Account " + A1.getNumber() + " have " + A1.getBalance() + "$");
        System.out.println("Account " + B2.getNumber() + " have " + B2.getBalance() + "$");
        System.out.println("Account " + C3.getNumber() + " have " + C3.getBalance() + "$");

        A1.transferBalance(50, B2);
        C3.transferBalance(50, B2);
        A1.transferBalance(50, C3);
        A1.transferBalance(50, B2);

        System.out.println("Account " + A1.getNumber() + " have " + A1.getBalance() + "$");
        System.out.println("Account " + B2.getNumber() + " have " + B2.getBalance() + "$");
        System.out.println("Account " + C3.getNumber() + " have " + C3.getBalance() + "$");
    }
}
