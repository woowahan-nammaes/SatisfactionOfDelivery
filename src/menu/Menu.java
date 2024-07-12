package menu;

public class Menu {
    private long id;
    private long storeId;
    private String name;
    private int price;

    public Menu(long storeId, String name, int price) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public long getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
