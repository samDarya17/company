package Company;

public class Janitor extends Worker {
    @Override
    public void setProf() {
        super.setProf();
    }

    public Janitor(String name, String secondName, int exp) {
        super(name, secondName, exp);
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}