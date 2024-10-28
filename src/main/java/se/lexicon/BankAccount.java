package se.lexicon;

public class BankAccount {

    private static long counter=1000;
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(double balance,String customerName,String email,int phoneNumber){
       this.accountNumber=++counter;
       this.setBalance(balance);
       this.customerName=customerName;
       this.email=email;
       this.phoneNumber=phoneNumber;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
        System.out.println("Amount deposited: "+balance+" SEK");
        System.out.println("Total balance available in account :"+ balance +" SEK");
    }


    public void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance=balance-amount;
            System.out.println("Amount withdrawn: "+balance+" SEK");
            System.out.println("Total balance available in account :"+ balance +" SEK");
        }else{
            System.out.println("Insufficient balance");
        }

    }

    public String getAccountInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Account Info: ");
        stringBuilder.append("Account Number: ");
        stringBuilder.append(accountNumber);
        stringBuilder.append(" , Account Balance: ");
        stringBuilder.append(balance);
        stringBuilder.append(" SEK");
        stringBuilder.append(" , Name: ");
        stringBuilder.append(customerName);
        stringBuilder.append(" , email: ");
        stringBuilder.append(email);
        stringBuilder.append(" , Phone number: ");
        stringBuilder.append(phoneNumber);


        return stringBuilder.toString();
    }
}
