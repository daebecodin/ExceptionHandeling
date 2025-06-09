public class ExceptionDemo4 {

    public static void main(String[] args) {
        String str = "Hello Exception Demo 3"; // index of 22

        try {
            System.out.println(str.charAt(67)); // get index 67
        } catch (StringIndexOutOfBoundsException e) { // catch  exception
            System.out.println("In Catch");
            System.out.println(e.getMessage()); // print the message
        } finally {
            System.out.println("Finally Exception Handled"); // do this no matter what
        }
    }


}
