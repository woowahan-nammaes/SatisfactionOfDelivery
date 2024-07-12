package store;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StoreDAO {
    private Map<Long,Store> storeDB;
    private Long idx;



    public StoreDAO() {
        storeDB = new HashMap<>();
        idx= 0L;
    }

    void save(Store store) {
        store.setId(idx++);
        storeDB.put(store.getId(), store);
    }

    Store findById(Long id) {
        return storeDB.get(id);
    }

    List<Store> findByCategory(String category) {
        return storeDB.values().stream()
                .filter(store -> store.getCategory().name().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    void delete(Long id) {
        storeDB.remove(id);
    }
}