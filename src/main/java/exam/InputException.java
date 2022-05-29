package exam;

import java.io.IOException;

public class InputException extends IOException {

    public InputException() {
        super("Invalid input");
    }
}
