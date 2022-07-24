package practice_solutions.pen_exceptions;

public class InvalidColorException extends Exception{

    public InvalidColorException(String message) {
        super(message);
    }
}

// Creating a class as a subclass of the Exception class will create a checked exception

