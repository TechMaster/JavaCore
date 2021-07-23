import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        repository.getData();
        Menu.mainMenu();

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                //Đăng nhập
                break;
            case 2:
                //Đăng ký
                break;
            default:
                break;
        }

    }
}