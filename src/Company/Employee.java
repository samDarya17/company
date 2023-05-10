package Company;

import java.util.Arrays;

public abstract class Employee extends Person {

    private int exp;
    protected PROF prof;
    private final int basic = 1000;
    Employee[] employees;
    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0] = employee;
        }else {
            employees = Arrays.copyOf(employees,employees.length+1);
            employees[employees.length-1] = employee;
        }
    }

    public Employee(String name, String secondName, int exp) {
        super(name, secondName);
        this.exp = exp;
        setProf();
    }

    public int getSalary(){
        return basic * prof.getKoef() * exp;
    }
    public abstract  void setProf();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", secondName=" + secondName +
                ", exp=" + exp +
                ", prof=" + prof +
                ", salary=" + getSalary() +
                '}';
    }
}