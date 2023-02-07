package exception;

import java.io.IOException;
import java.util.Arrays;

public class Exception {
    //    void sayNick(String nick) {
//        try {
//            if ("fool".equals(nick)) {
//                throw new MyException();
//            }
//            System.out.println("your nick is " + nick);
//        } catch (MyException e){
//            System.out.println("foooooooool");
//        }
//    }
    // using throws
    void sayNick(String nick) throws MyException{  // throws를 하면 이걸 호출한 부분에서 예외처리를 하도록 미룸
        if ("fool".equals(nick)) {
            throw new MyException("fool error");
        }
        System.out.println("your nick is " + nick);
    }

    public static void run() {
        // simple example
//        int a = 10;
//        int[] arr = new int[5];
//        int b = 0;
//        try {
////            b = a / 0;
//            arr[5] = 10;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            b = -1;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println(b);
//            System.out.println(Arrays.toString(arr));
//        }

        // use my own exception
        Exception n = new Exception();
//        n.sayNick("fool");  // without throws
        try{
            n.sayNick("fool");  // with throws
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
