package InheritanceChallenge;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String birthDate, String name, String hireDate) {
        super(birthDate, name);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate ;
    }

    @Override
    public String toString()  {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
