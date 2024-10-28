package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount(20,"Sayana Surendran","sayana@gmail.com",123456789);
        account1.deposit(2000);

        BankAccount account2=new BankAccount(1000,"Sayana","abc@gmail.com",123456789);
        account2.withdraw(2000);


        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());


    }
}