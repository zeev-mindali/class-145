package project1;

public class NirException extends Exception{
    public NirException() {
        super("General error, don't know what happened");
    }

    public NirException(String message) {
        //
        super(message);
    }
}
