import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Beverage> bev = new ArrayList<>();
        bev.add(new Tea());
        bev.add(new Coffee());

        for( Beverage b : bev) {
            b.prepareRecipe();
        }
    }
}
