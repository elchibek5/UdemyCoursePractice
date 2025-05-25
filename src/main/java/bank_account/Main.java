package bank_account;

public class Main {
    public static void main(String[] args) {
        Account ericsAccount = new Account();

        ericsAccount.setBalance(200);
        ericsAccount.setCustomerEmail("eric2@gmail.com");
        ericsAccount.setCustomerName("Eric");
        ericsAccount.setNumber("12123");
        ericsAccount.setCustomerPhone("+10293943090");



        ericsAccount.setBalance(200);
        ericsAccount.withdrawFunds(20);
        ericsAccount.depositFunds(2000);
        ericsAccount.withdrawFunds(2180);

    }
}
