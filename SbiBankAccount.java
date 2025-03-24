public class SbiBankAccount {
    static double amount;
    static double balance;

    
    public static void credit(double amount){
        System.out.println("Credit Started");
        if(amount>0.0)
        balance = balance+amount;
        else
        System.out.println("Insufficient funds");
        System.out.println("Credit ended");
    }
    public static void debit(double amount){
        System.out.println("Debit started");
        if(amount<=0.0)
        System.out.println("Insufficent fund");
        else
        balance = balance-amount;
        System.out.println("Debit ended");


    }
    public static void getBalance(){
        System.out.println("The balance is "+balance);
    }
}