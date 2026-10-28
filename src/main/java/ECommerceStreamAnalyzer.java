import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {

    private int id;
    private String name;
    private String category;
    private double price;

    // 2. Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}
public class ECommerceStreamAnalyzer {
    public static void main(String[] args) {
        List<Product> inventory = Arrays.asList(new Product(1, "Laptop", "Electronics", 1200.00),
                new Product(2, "Coffee Maker", "Appliance", 80.00),
                new Product(3, "Headphones", "Electronics", 150.00),
                new Product(4, "Smartphone", "Electronics", 800.00),
                new Product(5, "Desk Chair", "Furniture", 200.00));

        List<String> premiumElectronics = inventory.stream()
                .filter(p -> p.getPrice() > 100)
                .map(p -> p.getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(premiumElectronics);

        double totalElectronicsRevenue = inventory.stream()
                .filter(p-> p.getCategory().equals("Electronics"))
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("Total Electronics Revenue: $" + totalElectronicsRevenue);

        Map<String, List<Product>> productsByCategory = inventory.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("Products grouped by Category: " + productsByCategory);




    }

}


