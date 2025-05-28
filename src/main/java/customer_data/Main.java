package customer_data;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Muha", 700, "muha@gmail.com");

        System.out.println(customer.getEmail());
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());

        Customer secondCustomer = new Customer();

        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());

        Customer thirdCustomer = new Customer("Joe", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmail());
        System.out.println(thirdCustomer.getCreditLimit());
    }
}
