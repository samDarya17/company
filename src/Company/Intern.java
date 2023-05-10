package Company;

import java.util.Arrays;

public class Intern extends Employee {
    public Intern(String name, String secondName, int exp) {

        super(name, secondName, exp);
    }

    @Override
    public void setProf() {

        this.prof = PROF.INTERN;
    }
    @Override
    public String toString() {
        return "Intern{" +
                "prof=" + prof +
                ", salary= " + getSalary() +
                " employees=" + Arrays.toString(employees) +
                '}';
    }
}