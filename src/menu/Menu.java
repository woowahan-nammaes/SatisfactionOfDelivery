package menu;

public class Menu {
    private Long id;
    private Long storeId;
    private String name;
    private int price;

    public Menu() {
    }

    public Menu(Long storeId, String name, int price) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
