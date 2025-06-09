public class SuperClassOfException extends RuntimeException{
    private static final String SUPERCLASS = "Throwable";

    public SuperClassOfException(String message) { super(message);}

    public static String getSuperClassName() {
        return SuperClassOfException.SUPERCLASS;
    }
}
