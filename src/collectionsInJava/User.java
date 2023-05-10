package collectionsInJava;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Object o) {
        User newUser = (User) o;
        if(age> newUser.age){
            return 1;
        }return -1;
    }



}