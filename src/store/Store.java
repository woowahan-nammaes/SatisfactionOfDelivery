package store;

public class Store {
    private Long id;
    private String name;
    private String address;
    private Category category;

    public Store( String name, String address, Category category) {
        this.name = name;
        this.address = address;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }
}
