import java.util.*;

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return name;
    }
}

class Category {
    private String name;
    private List<Item> items;

    public Category(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String toString() {
        return name + "  " + items;
    }
}

class TestMain {
    public static void main(String args[]) {
        
        Map<String,Category> categoryMap = new HashMap<>();

        
        Category furniture = new Category("Furniture");
        furniture.addItem(new Item("Chair"));
        furniture.addItem(new Item("Table"));
        furniture.addItem(new Item("Bed"));
        categoryMap.put(furniture.getName(), furniture);

        
        Category cosmetic = new Category("Cosmetic");
        cosmetic.addItem(new Item("Vaseline"));
        cosmetic.addItem(new Item("Eyeliner"));
        cosmetic.addItem(new Item("Lipstick"));
        categoryMap.put(cosmetic.getName(), cosmetic);

        
        Category electronic = new Category("Electronic");
        electronic.addItem(new Item("Mobile"));
        electronic.addItem(new Item("Charger"));
        electronic.addItem(new Item("Laptop"));
        categoryMap.put(electronic.getName(), electronic);

        
        System.out.println("All Categories and Items:");
        for (Category c : categoryMap.values()) {
            System.out.println(c);
        }

    
        System.out.println("\nItems in Cosmetic:");
        for (Item i : categoryMap.get("Cosmetic").getItems()) {
            System.out.println("- " + i.getName());
        }
    }
}
