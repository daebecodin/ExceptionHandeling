public class ExceptionDemo2 {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};

        try {
            // risky code
            System.out.println(arr[35]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // do what inside catch
            System.out.println("Inside Catch");
            System.out.println(e.getMessage());
        } finally {
            // do this no matter what
            System.out.println("In Finally");

        }


    }
}
