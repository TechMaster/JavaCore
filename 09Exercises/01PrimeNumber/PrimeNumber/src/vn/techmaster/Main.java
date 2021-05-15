package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        Scanner sc = new Scanner(System.in);
        while(true){
            menu();
            int choose = sc.nextInt();
            int amount;
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách "+amount+" số nguyên tố đầu tiên, sử dụng for loop: ");
                    primeNumber.printFirstPrimeNumberUsingForLoop(amount);
                    break;
                case 2:
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách 10 số nguyên tố đầu tiên, sử dụng while loop: ");
                    primeNumber.printFirstPrimeNumberUsingWhileLoop(amount);
                    break;
                case 3:
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách 10 số nguyên tố đầu tiên, sử dụng do while loop: ");
                    primeNumber.printFirstPrimeNumberUsingDoWhileLoop(amount);
                    break;
                case 4:
                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng for loop: ");
                    primeNumber.printPrimeNumberUsingForLoop();
                    break;
                case 5:
                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng while loop: ");
                    primeNumber.printPrimeNumberUsingWhileLoop();
                    break;
                case 6:
                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng do...while loop: ");
                    primeNumber.printPrimeNumberUsingDoWhileLoop();
                    break;
        }
        }



    }

    static void menu(){
        System.out.println("\nNhập lựa chọn: ");
        System.out.println("1 - Liệt kê n số nguyên tố đầu tiên, sử dụng for loop");
        System.out.println("2 - Liệt kê n số nguyên tố đầu tiên, sử dụng while loop");
        System.out.println("3 - Liệt kê n số nguyên tố đầu tiên, sử dụng do while loop");
        System.out.println("4 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng for loop");
        System.out.println("5 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng while loop");
        System.out.println("6 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng do while loop");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

    }

}
