import menu.Menu;
import menu.MenuController;
import menu.MenuInit;
import order.OrderController;
import store.StoreController;
import store.StoreInit;
import user.User;
import user.UserController;

import java.util.Scanner;

public class Main {
    private static final UserController userController = new UserController();
    private static final StoreController storeController = new StoreController();
    private static final MenuController menuController = new MenuController();
    private static final OrderController orderController = new OrderController();

    public static void main(String[] args) {
        initData();

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        boolean isLogin = false;
        int option = -1;

        printLogo();

        while (option != 0) {
            if (!isLogin) {
                printNonMemberMainPage();
                option = inputOption(scanner);
                if (option == -1) continue;
                switch (option) {
                    case 1:
                        userController.signUp();
                        break;
                    case 2:
                        user = userController.signIn();
                        if (user != null) {
                            isLogin = true;
                        }
                        break;
                    case 3:
                        getStores(user, isLogin);
                        break;
                    case 0:
                    default:
                        printExitMessage();
                        return;
                }
            } else {
                printMemberMainPage();
                option = inputOption(scanner);
                if (option == -1) continue;
                switch (option) {
                    case 1:
                        getStores(user, isLogin);
                        break;
                    case 2:
                        orderController.getUserOrders(user);
                        break;
                    case 3:
                        if (isLogin) {
                            user = userController.signOut(user.getLoginId());
                            if (user != null) {
                                isLogin = false;
                            }
                        }
                        break;
                    case 0:
                    default:
                        printExitMessage();
                        return;
                }
            }
        }
    }

    private static void initData() {
        StoreInit storeInit = new StoreInit();
        MenuInit menuInit = new MenuInit();
        menuInit.init();
        storeInit.init();
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
        System.out.println("1. 가게 조회하기");
        System.out.println("2. 주문 기록 조회");
        System.out.println("3. 로그아웃");
        System.out.println("0. 종료");
        System.out.println("=====================================");
        System.out.print("입력: ");
    }

    static int inputOption(Scanner scanner) {
        String input = scanner.next();
        if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("0")) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.\n");
            return -1;
        }
        int option = Integer.parseInt(input);
        return option;
    }

    static void getStores(User user, boolean isLogin) {
        long storeId = 0;

        while (storeId != -1) {
            Menu menu = new Menu();
            storeId = storeController.getStoreCategories();
            if (storeId != -1)  {
                while (menu != null) {
                    menu = menuController.getStoreMenus(storeId);
                    if (menu == null) break;
                    if (!isLogin) {
                        printUnableOrderToNonMember();
                        return;
                    }
                    orderController.create(user, menu);
                }
            }
        }
    }

    static void printExitMessage() {
        System.out.println("감사합니다! 또 오세요!");
    }

    static void printUnableOrderToNonMember() {
        System.out.println("주문은 회원만 가능합니다. 로그인해주세요!\n");
    }

}
