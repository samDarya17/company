package Exceptions;

public class Main {
    public static void main(String[] args) {
        MyExcServise service = new MyExcServise();
//        service.div();
//        service.printArrEl();
//        service.stackError();
//        service.nullPExc();
//        service.processFile();
        User user = new User("Vasya", 10);
        try {
            service.validateUserInput(user);
        }catch (InvalidUserName e){
            System.out.println(e.getMessage());
        }catch (InvalidUserAge e){
            System.out.println(e.getMessage());
        }
//        service.throwMyExc();

        System.out.println("closing");


    }}