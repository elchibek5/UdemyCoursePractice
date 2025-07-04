package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("11/11/2000", "tim",
                "07/04/2025");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "11/11/2000",
                "09/09/2025");
        System.out.println(joe);
    }
}
