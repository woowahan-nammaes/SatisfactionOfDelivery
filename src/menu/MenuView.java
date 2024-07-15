package menu;

import java.util.List;
import java.util.Scanner;

public class MenuView {
    private static Scanner sc = new Scanner(System.in);
    
    public Menu getMenu(List<Menu> menus, String storeName){
        printStoreTitle(storeName);
        printMenus(menus);
        printEndLine();
        int selectedMenu = enterUserInput();
        if (selectedMenu == 0) {
            return null;
        } else {
            return menus.get(selectedMenu - 1);
        }
    }

    private static void printMenus(List<Menu> menus) {
        int index = 1;
        for (Menu menu : menus) {
            System.out.println(index + ". " + menu.getName());
            index++;
        }
        System.out.println("0. 뒤로가기");
    }

    private static int enterUserInput() {
        System.out.print("입력: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void printEndLine() {
        System.out.println("=======================");
    }

    private static void printStoreTitle(String storeName) {
        System.out.println("======" + storeName + "======");
    }
}
