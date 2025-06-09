import java.io.IOException;

public class ExceptionDemo6 {

    public static void handleIoException() throws IOException { // the method "might" throw exception. We have a checked exception
        throw new IOException("Throwing ***checked*** exception");
    }


    public static void main(String[] args) {
        try {
            handleIoException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception handled");
        }


    }


}
