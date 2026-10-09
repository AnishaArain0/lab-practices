package lab04;

public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}