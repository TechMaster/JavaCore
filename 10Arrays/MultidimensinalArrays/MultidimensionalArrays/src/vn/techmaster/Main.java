package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        System.out.println("Mảng nhiều chiều: ");
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + "\t");
            }
            System.out.println();
        }
        int x = myNumbers[1][2];
        System.out.println("Phần tử ở vị trí 1-2 là: "+x);
    }
}
