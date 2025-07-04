package InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("11/11/2000", "tim",
                "07/04/2025");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/2000",
                "09/09/2025", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
    }
}
