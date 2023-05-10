package Company;

import java.util.Arrays;


public class Director extends Employee {

    Employee[] employees;
    public Director(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public void setProf() {
        this.prof = PROF.DIRECTOR;
    }




    @Override
    public int getSalary() {
        if(employees==null){ return super.getSalary();}
        else {
            return super.getSalary()+(employees.length*100);
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "prof=" + prof +
                ", salary= " + getSalary() +
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}