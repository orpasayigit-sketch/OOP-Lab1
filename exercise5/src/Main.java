import java.util.Map;

public class Main {

    public static void main(String[] args) {

        InventorySnapshot stock =
                new InventorySnapshot(
                        Map.of("WOOD-A", 3000L)
                );

        MaterialPlanner planner =
                new MaterialPlanner();

        planner.showWoodStock(stock);
    }
}