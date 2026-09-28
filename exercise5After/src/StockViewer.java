class StockViewer {

    private final InventorySnapshot stock;


    StockViewer(InventorySnapshot stock) {

        this.stock = stock;

    }


    void showWood() {

        System.out.println(

                "Viewer remembers WOOD-A: "

                        + stock.available("WOOD-A")

        );

    }

}