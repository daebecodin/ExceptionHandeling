public class ExceptionDemo3 {

    public static void main(String[] args) {
        String str = "Hello Exception Demo 3";

        try {
            System.out.println(str.charAt(45));
        } catch (Exception e) {
            System.out.println("In Catch");
            System.out.println(e.getMessage());
        }
    }
}
