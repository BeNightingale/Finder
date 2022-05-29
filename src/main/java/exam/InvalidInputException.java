package exam;

import java.io.IOException;

public class InvalidInputException extends IOException {

    public InvalidInputException() {
        super("Invalid input");
    }
}
