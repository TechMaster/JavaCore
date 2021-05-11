public class Main {
    public static void main(String[] args) {
        loopAString();

        System.out.println("Các số từ 0 -> 50: ");
        loopNumber();

        System.out.println("\nCác số từ 50 -> 0: ");
        loopNumberReversed();
    }

    //Lặp chuỗi "Hello Java" 10 lần
    static void loopAString(){
        for (int i = 0; i < 10; i++){ //Khởi tạo biến i = 0, bước này chỉ thực hiện 1 lần, điều kiện lặp là i < 10
            System.out.println("Hello Java");
        }
    }

    //In ra các số từ 0 -> 50
    static void loopNumber(){
        for (int i = 0; i <= 50; i++){
            System.out.print(i+"\t");
        }
    }

    //In các số từ 50 -> 0
    static void loopNumberReversed(){
        for (int i = 50; i >= 0; i--){
            System.out.print(i +"\t");
        }
    }
}
