package class8_2511_Exceptions;

public class AlonException extends Exception {
    public AlonException() {
        super("Alon is in the house");
    }

    public AlonException(String message) {
        super(message);
    }
}
