package Exceptions;

public class InvalidUserName  extends RuntimeException{
    public InvalidUserName(User user) {
        super("User has invalid name" + user.getName());
    }
}

