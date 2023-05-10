package Company;


public class Person {
    protected String name;
    protected String secondName;

    public Person(String name,String secondName){
        this.name=name;
        this.secondName=secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
