package co.com.uninorte.exceptions;

public class ValidateMessageException extends Error {

    public static final String MESSAGE_LOGIN_ERROR = "Sorry, It was not possible to validate the message error";

    public ValidateMessageException(String message, Throwable cause) {
        super(message, cause);
    }
}
