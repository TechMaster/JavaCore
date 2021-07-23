import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            
            case 1: 
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            
            case 2: 
                break;
        }
    }
}
