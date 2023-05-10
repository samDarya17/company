package Exceptions;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException (String message){
        super(message);}

    public MyUncheckedException(User user){
        super(user.toString() + "check all fields");
    }
}