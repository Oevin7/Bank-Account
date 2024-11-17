public class TestClass {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setFirstName("John");
        bank.setLastName("Doe");
        bank.setAccountID(123456789);
        bank.deposit(1000);
        bank.withdrawal(500);
        bank.accountSummary();

        System.out.println();

        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.setFirstName("Jane");
        checkAcc.setLastName("Doe");
        checkAcc.setAccountID(123456789);
        checkAcc.deposit(1000);
        System.out.println(checkAcc.getBalance());
        checkAcc.applyInterest();
        System.out.println(checkAcc.getBalance());


        checkAcc.withdrawal(1026);
    }
}
