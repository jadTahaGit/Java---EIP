public class Main {
    public static void main(String[] args) {
        Account jadsAccount = new Account("12213", 0.00, "Jad Taha", "sdafads@sdf.sdf", "048 15221014525");

        /*
        jadsAccount.setAccountBalance(100);
        jadsAccount.setAccountNumber("12311241224");
        jadsAccount.setCustomerEmailAddress("jadtaha@gmai.com");
        jadsAccount.setCustomerName("Jad Taha");
        */


        jadsAccount.withdrawal(100.0);
        jadsAccount.deposit(59);

        jadsAccount.withdrawal(100);
        jadsAccount.deposit(60);

        jadsAccount.withdrawal(100);
    }
}
