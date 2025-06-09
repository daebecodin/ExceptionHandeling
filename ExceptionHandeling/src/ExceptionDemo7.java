public class ExceptionDemo7 {



    public static void main(String[] args) {
        String str = "Hello Exception Demo 7";

        int arr[] = {1,3,5,7,9,12};


        try {

            System.out.println(arr[65]); // will  throw array index out of bounds
            System.out.println(str.charAt(55)); // will throw string out of index
        } catch ( ArrayIndexOutOfBoundsException| StringIndexOutOfBoundsException e) { // the catch does not care which one it gets
            System.out.println(e.getMessage()); // print first error caught
        }
    }
}
