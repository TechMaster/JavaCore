package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        integerArray();

        stringArray();
    }

    static void stringArray(){
        //Mảng string

        String strArray[] = new String [5];
        //hoặc String strArray[] = {"Java", "HTML", "PHP", "Python", "C++"};
        strArray[0] = "Java";
        strArray[1] = "HTML";
        strArray[2] = "PHP";
        strArray[3] = "Python";
        strArray[4] = "C++";

        System.out.println("Mảng xâu: ");
        for (int i = 0; i < strArray.length; i++){
            System.out.printf("Phần tử thứ %d: %s\n", i, strArray[i]);
        }

        System.out.println("Phần tử ở có index = 3 là: " +strArray[3]);
    }

    static void integerArray(){
        //Mảng số nguyên
        int intArray[] = new int[5];  //Khởi tạo mảng intArray gồm các số nguyên, có kích thước bằng 5
        intArray[0] = 4;  //Gán phần tử ở index  0 = 4
        intArray[1] = 2;
        intArray[2] = 9;
        intArray[3] = 7;
        intArray[4] = 6;

        System.out.println("Số phần tử trong mảng là: " +intArray.length);
        show(intArray);

        intArray[1] = 0;   //Sửa phần tử có index = 1
        System.out.println("Mảng sau khi sửa là: ");
        show(intArray);
    }

    static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Phần tử thứ %d: %d\n", i, arr[i]);
        }
    }
}
