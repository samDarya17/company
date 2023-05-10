package Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class MyExcServise {

    public void div(){
        int i = 10;
        int j = 0;
        System.out.println(i/j);
    }

//    public void printArrEl();

    public void stackError(){
        System.out.println("add method to stack");
        stackError();
    }

//    public void nullPExc(){
//        System.out.println("nullPExc");
//        User user = new User(null);
//        String name = user.getName();
//        System.out.println(name.toUpperCase());
//    }

    public void processFile() throws IOException {
        System.out.println("FileWriter");
        FileWriter write = new FileWriter("/users/text.txt");
    }

    public void validateUserInput(User user){

        if(user.getName().length() < 3){
            throw new InvalidUserName(user);
        }
        if(user.getAge() < 5){
            throw new InvalidUserAge(user);
        }
    }
}