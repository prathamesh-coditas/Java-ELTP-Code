package Feb8;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException() {

        System.out.println("InvalidAmountException ");
    }

    public InvalidAmountException(String message) {

        System.out.println("InvalidAmountException " + message);
    }

    public InvalidAmountException(String message, Throwable cause) {
        System.out.println("InvalidAmountException " + message + "" + cause);
    }

    public InvalidAmountException(Throwable cause) {

        System.out.println("InvalidAmountException " + cause);
    }



}
