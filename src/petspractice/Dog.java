package petspractice;

public class Dog extends Pet {


    public Dog(String name, int age) {
        super(name, age);
    }

    public void say(){
        System.out.println("Гав-Гав");
    }
    public void playWithBall(){
        System.out.println();
    }
}