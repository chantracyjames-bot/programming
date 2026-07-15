package inventory;

public class CustomExceptions {
    public static class ProductIDAlreadyExistsException extends RuntimeException {
        public ProductIDAlreadyExistsException(String errText) {
            super(errText);
        }
    }

    public static class ProductIDNotFoundException extends RuntimeException {
        public ProductIDNotFoundException(String errText) {
            super(errText);
        }
    }
}

