public class BankAccountRun {
    public static void main(String[] args) {
        SbiBankAccount.getBalance();
        SbiBankAccount.credit(1000);
        SbiBankAccount.getBalance();
        SbiBankAccount.debit(500);
        SbiBankAccount.getBalance();

       
}
}
