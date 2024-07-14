package order;

import java.util.List;
import java.util.Scanner;

public class OrderView {
    private Scanner sc = new Scanner(System.in);

    public void printCheckOrder(String menuName) {
        System.out.println("==========주문==========");
        System.out.println("'" + menuName + "'" + " 주문하시겠습니까?");
        System.out.println("1. 네");
        System.out.println("2. 아니오");
        System.out.println("=======================");
        System.out.print("입력: ");
    }

    public int getInputNumber() {
        int num = sc.nextInt();
        return num;
    }

    public void printOrderCompleteMessage(String storeName, String menuName) {
        System.out.println(storeName + "에서 " + menuName + "가 주문되었습니다. :) 맛있게 드세요");
    }

    public void printUserOrdersMessage(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void printErrorMessage() {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
    }
}
