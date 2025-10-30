class CustomDivisionException extends Exception {
    public CustomDivisionException(String message) {
        super(message);
    }
    
    public CustomDivisionException(String message, Throwable cause) {
        super(message, cause);
    }
}