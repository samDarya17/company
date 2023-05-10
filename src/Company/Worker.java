package Company;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String secondName, int exp) {

        super(name, secondName, exp);
    }

    @Override
    public void setProf() {

        this.prof = PROF.WORKER;
    }

    @Override
    public void addWorker(Employee employee) {
        if(employee.prof.equals(PROF.INTERN)){
            super.addWorker(employee);}
        else {
            System.out.println("Можно привязать только стажеров");
        }
    }
    @Override
    public int getSalary() {
        if (employees == null) {
            return super.getSalary();
        } else {
            return super.getSalary() + (employees.length * 50);
        }
    }
    @Override
    public String toString() {
        return "Worker{" +
                "prof=" + prof +
                ", salary= " + getSalary() +
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}