import java.util.Objects;
import java.util.Scanner;

public class ExceptionDemo5 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do { // do this block of code before anything else
            System.out.println("What is the Super Class of all Exceptions?: "); // ask for a name
            String superClass = input.next(); // get a name

            try {
                if (!Objects.equals(superClass, SuperClassOfException.getSuperClassName())) { // if not correct name
                    throw new SuperClassOfException("wrong"); // throw error
                } else { // if it is right
                    System.out.println("\t Good Job!"); // good job
                    break; // break
                }
            } catch (SuperClassOfException e) { // custom exception
                System.out.println(e.getMessage()); // print message
            }
        } while(true);
    }
}
