package store;

import java.util.List;
import java.util.Scanner;

public class StoreView {

    private StoreController storeController;
    private Scanner scanner;

    public StoreView() {
        this.scanner = new Scanner(System.in);
    }

    public Category selectCategory() {
        showCategories();
        int choice = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        if (choice > 0 && choice <= Category.values().length) {
            Category selectedCategory = Category.values()[choice - 1];
            return selectedCategory;
        } else if (choice == 0) {
            System.out.println("뒤로 돌아갑니다.");
            return null;
        } else {
            System.out.println("잘못된 입력입니다.");
            //TODO: 잘못된입력일 경우 다시 view를 보여줘야해서 재귀형태가 됨 상의하기
            return selectCategory();
        }
    }

    public void showCategories() {
        Category[] categories = Category.values();
        System.out.println("======카테고리======");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i].getDescription());
        }
        System.out.println("0. 뒤로");
        System.out.println("==================");
        System.out.print("입력: ");
    }
    public long selectStore(List<Store> stores) {
        showStores(stores);
        int choice = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        if (choice > 0 && choice <= stores.size()) {
            Store selectedStore = stores.get(choice - 1);
            return selectedStore.getId();
        } else if (choice == 0) {
            System.out.println("뒤로 돌아갑니다.");
            return -1;
        } else {
            System.out.println("잘못된 입력입니다.");
            //TODO: 잘못된입력일 경우 다시 view를 보여줘야해서 재귀형태가 됨 상의하기
            return selectStore(stores);
        }
    }
    public void showStores(List<Store> stores) {
        System.out.println("======가게 리스트======");
        int idx = 1;
        for (Store store : stores) {
            System.out.println(idx + ": " + store.getName());
        }
        System.out.println("0. 뒤로");
        System.out.println("==================");
        System.out.print("입력: ");
    }
}