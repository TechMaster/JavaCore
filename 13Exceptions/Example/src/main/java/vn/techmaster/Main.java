package vn.techmaster;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int result = 7/0;  // ArithmeticException
//        System.out.println(result);

//        String obj = null;
//        System.out.println(obj.length()); // NullPointerException
//
//        String str = "abc";
//        int num = Integer.parseInt(str); // NumberFormatException
//
//        int arr[] = new int[5];
//        arr[5] = 50; // ArrayIndexOutOfBoundsException
//
        ExceptionExample exception = new ExceptionExample();
//        exception.checkAge(10);


        //xử lý ngoiaj lệ tại đây
//        try {
//            int age = exception.setAge();
//            System.out.println("Tuổi của nhân viên: " + age);
//        } catch (IOException e) {
//            System.out.println("Tuổi vừa nhập không hợp lệ: " +e.toString());
//        }


        //Custom exception
//        try {
//            int age = inputAge();
//            System.out.println("Tuổi đã nhập: " + age);
//        } catch (AgeCheckingException e) {
//            System.out.println(e.getMessage());
//        }


    }

    static int inputAge() throws AgeCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
        } catch (InputMismatchException e) {
            throw new AgeCheckingException("tuổi phải là một số.");
        }
        return age;
    }
}
