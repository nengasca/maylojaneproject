package banking;

public class bankingClass {
       private int accNo;
       private double balance;
       private int pin;

    public bankingClass() {
        this.accNo = 0;
        this.pin = 0;
        this.balance = 0.0; 
    }

    public bankingClass(int accountNo, int pin) {
        this.accNo = accountNo;
        this.pin = pin;
        this.balance = 0.0;
    }
       
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccNo() {
        return this.accNo;
    }
    public double getBalance() {
        return this.balance;
    }

    public boolean verifyAccount(int accNo, int pin) {
        return this.accNo == accNo && this.pin == pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}