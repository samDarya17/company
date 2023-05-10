package Exceptions;

public class InvalidUserAge extends RuntimeException {
    public InvalidUserAge(User user) {
        super("User has invalid age");
    }
}


