package InheritanceChallenge;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String birthDate, String name, String hireDate, double hourlyPayRate) {
        super(birthDate, name, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
