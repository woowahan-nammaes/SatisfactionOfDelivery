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

        printLogo();
    
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
    }
}
