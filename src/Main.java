import order.OrderController;
import store.StoreController;
import user.User;
import user.UserController;

import java.util.Scanner;

public class Main {
    private static UserController userController = new UserController();
    private static StoreController storeController = new StoreController();
    private static OrderController orderController = new OrderController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        boolean isLogin = user.getIsLogin();
        int option = -1;

        printLogo();

        while (option != 0) {
            if (isLogin) {
                printNonMemberMainPage();
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        userController.signUp();
                        break;
                    case 2:
                        userController.signIn();
                        break;
                    case 3:
                        storeController.getStores();
                        break;
                    case 0:
                    default:
                        printExitMessage();
                        return;
                }
            } else {
                printMemberMainPage();
                option = scanner.nextInt();
            }
        }
    }

    static void printLogo() {
        String logo = """
                
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⠄⡄⡔⡄⡄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢂⠅⡕⢔⢕⢱⢱⢱⢱⢍⢗⢢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠨⡂⢅⠕⠸⠰⠱⡱⡱⡱⡱⡱⡱⡱⡱⣱⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠡⢑⠨⡐⡸⡸⡸⡸⡰⣒⠬⡌⣊⠪⡪⡺⣜⣝⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⢅⣆⠇⠊⠊⠈⠁⢹⠼⠚⠵⡹⣜⢜⣔⡑⡕⡮⣺⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢐⠜⠁⣁⣩⡁⡀⠈⢠⡰⠒⠒⠦⣄⠑⢣⢣⠳⡌⡯⣞⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⡼⠀⠀⠈⢱⣤⡓⠀⠀⢀⠀⠸⡆⠐⡕⡝⣎⢽⣺⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⢇⠀⠀⡀⢰⡃⠣⡄⠂⠀⡀⡾⡁⠅⣣⣫⢮⡻⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⡈⠒⠖⠖⠋⢀⠀⡈⠓⠛⡉⠅⡐⠄⡕⣞⠷⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠈⠠⠈⠄⠢⠒⡉⠠⢁⠂⢅⢂⢇⢇⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠅⠌⡐⠠⡑⡐⡕⢕⣕⡵⢧⠀⠀⠀⠀⢔⢨⢢⢪⢰⢰⢰⢠⢢⢤
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⡁⢕⢝⢝⢜⢼⢝⣆⠀⠀⠠⡑⡕⣕⢕⠕⠇⠧⡣⡣⡳
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢔⠢⡠⠀⡐⡔⢅⢇⢎⢎⢮⣪⢷⡽⣻⡺⡀⠀⢀⢪⢪⠂⠀⠀⠀⠀⠈⢎⢞
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣘⣷⣬⡿⠁⠁⠉⠑⠑⠉⢝⢽⢺⢹⢸⢸⢺⡂⠀⢀⢪⡂⠀⡢⠡⠨⠂⠁⢐⢝
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣺⣺⡇⠀⠀⠀⠀⠀⠀⠀⡊⡎⢎⢪⢪⢪⣫⡆⠀⠀⢆⠧⡀⠀⠁⠈⠈⢀⢜⢜
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⢀⢪⣟⣾⠂⠀⠀⠀⠀⠀⡀⡤⠮⡮⡳⣓⢗⣳⣷⡇⠀⠨⡨⡣⡣⡣⢤⢄⢆⢇⢇⢗
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢵⠱⡵⣳⡇⠀⠀⠀⠀⢀⢜⢔⢗⣝⣎⣗⣵⢯⣾⡷⣧⡀⢀⡾⡼⡵⣝⣼⣪⣞⡼⠵⠝
                ⠀⠀⠀⠀⠀⠀⠀⠀⡀⡀⡄⢄⠜⠡⡳⡽⡽⡇⠀⠀⠀⠀⡰⡕⣽⣻⡾⣽⣽⡽⣯⡷⣯⢯⡿⣯⣟⡿⠻⠟⠿⠝⠟⠏⠀⠀
                ⠀⠀⠀⠀⠀⠀⠰⡼⣺⣞⣾⣳⣯⣧⢊⢎⡯⣿⠀⠀⠀⠀⢮⢺⠇⢯⢺⡱⡵⣝⢮⡺⡪⡓⡕⣆⣖⡜⡔⡄⡀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⡮⣟⠯⠉⠅⠉⠺⡽⣷⡡⡫⣞⣇⠀⠀⠀⡳⢽⠁⠨⣺⣪⡳⣕⢗⡝⡜⣮⡿⡻⡹⡛⣿⢮⡪⡢⡐⠀⠀⠀
                ⠀⠀⠀⠀⠀⢐⢽⡻⠈⠀⠀⠀⢀⠹⣽⡗⠸⡸⣺⢲⡲⡳⡝⣞⢖⢮⡳⢵⢝⢮⢏⢢⣻⡯⠊⠀⠀⠀⠈⣟⣎⢎⠄⠀⠀⠀
                ⠀⠀⠀⠀⠀⠨⣻⣽⡔⢀⠀⠄⡠⡮⣿⠁⠀⠑⠕⠕⠕⠵⠱⠱⠱⠕⠎⠇⠇⠇⠇⠗⣿⣯⡂⡀⠀⠀⢄⣗⣽⠊⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠘⠮⣟⣗⡾⣼⢽⠽⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢷⣻⣲⡪⣞⣽⠞⠃⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠙⠉⠀⠀⠀⠀⠀⠀⠀⠀
                """;
        System.out.println(logo);
    }

    static void printNonMemberMainPage() {
        System.out.println("===============배달의만족===============");
        System.out.println("환영합니다. 배달의만족입니다. 동작을 선택해주세요.");
        System.out.println("주문은 회원만 가능합니다 :)");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("3. 가게 조회하기");
        System.out.println("0. 종료");
        System.out.println("=====================================");
        System.out.print("입력: ");
    }

    static void printMemberMainPage() {
        System.out.println("===============배달의만족===============");
        System.out.println("환영합니다. 배달의만족입니다. 동작을 선택해주세요.");
        System.out.println("주문은 회원만 가능합니다 :)");
        System.out.println("1. 가게 조회하기");
        System.out.println("2. 주문 기록 조회");
        System.out.println("3. 로그아웃");
        System.out.println("0. 종료");
        System.out.println("=====================================");
        System.out.print("입력: ");
    }

    static void printExitMessage() {
        System.out.println("감사합니다! 또 오세요!");
    }

}
