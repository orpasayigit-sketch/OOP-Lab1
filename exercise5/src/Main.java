import java.util.Map;


public class Main {

    public static void main(String[] args) {

        InventorySnapshot stock =

                new InventorySnapshot(

                        Map.of("WOOD-A", 3000L)

                );
        StockViewer viewer =

                new StockViewer(stock);


        viewer.showWood();

        viewer.showWood();


        MaterialPlanner planner =

                new MaterialPlanner();


        planner.showWoodStock(stock);

    }

}