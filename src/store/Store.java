package store;

public class Store {
    private long id;
    private String name;
    private String address;
    private Category category;

    public Store( String name, String address, Category category) {
        this.name = name;
        this.address = address;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Category getCategory() {
        return category;
    }
}
