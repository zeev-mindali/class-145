package class8_2511_Exceptions;

public class TalException extends Exception {
    public TalException() {
        super("If i was a rotshiled, ya ba ba ba am");
    }

    public TalException(String message) {
        super(message);
    }
}
