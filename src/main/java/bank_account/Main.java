package bank_account;

public class Main {
    public static void main(String[] args) {

        Account ericsAccount = new Account("12345123", 1000.000, "eric Eric",
                "eric@gmail.com", "+08871232");

        System.out.println(ericsAccount.getNumber());
        System.out.println(ericsAccount.getBalance());
//        ericsAccount.setBalance(200);
//        ericsAccount.setCustomerEmail("eric2@gmail.com");
//        ericsAccount.setCustomerName("Eric");
//        ericsAccount.setNumber("12123");
//        ericsAccount.setCustomerPhone("+10293943090");



        ericsAccount.setBalance(200);
        ericsAccount.withdrawFunds(20);
        ericsAccount.depositFunds(2000);
        ericsAccount.withdrawFunds(2180);

    }
}
