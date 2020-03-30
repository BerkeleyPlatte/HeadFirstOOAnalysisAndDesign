import java.util.*;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocaster", "electric", "Alder", "Alder");
        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("  We have a " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType()
                    + " guitar:\n     " + guitar.getBackWood() + " back and sides,\n     " + guitar.getTopWood()
                    + " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");

        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("US17022377", 900.00, "Fender", "Stratocaster", "electric", "Maple", "Maple");
        inventory.addGuitar("14052306412", 400.00, "Epiphone", "Joe Pass", "hollowbody", "Rosewood", "Rosewood");
    }
}
