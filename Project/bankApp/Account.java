package bankApp;

public class Account {
    private String number;
    private double balance;
    private String pinCode;
    private String name;
    private String phoneNumber;

    public Account(String number, String name, String pinCode, String phoneNumber) {
        this.number = number;
        this.pinCode = pinCode;
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public double getBalance(String pinCode) {
        validatePin(pinCode);
        return this.balance;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        this.balance += amount;
    }

    public void withdraw(double amount,String pinCode) {
        validatePin(pinCode);
        validateAmount(amount);
        if(this.balance >= amount)this.balance -= amount;
        else throw new IllegalArgumentException("Insufficient Balance");
    }

    public String getNumber() {
        return number;
    }

    private void validatePin(String pinCode) {
        if(!this.pinCode.equals(pinCode)) throw new IllegalArgumentException("Pin does not match");
    }

    private void validateAmount(double amount) {
        if(amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
    }
}

