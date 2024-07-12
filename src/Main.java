
import store.*;

;import java.util.List;

public class Main {
    public static void main(String[] args) {
        StoreController storeController = new StoreController();
        StoreInit storeInit = new StoreInit(storeController);
        storeInit.init();
    }
}
