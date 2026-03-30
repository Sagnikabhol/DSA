import java.util.*;
import java.io.*;
public class Inventory {
    private Map<Integer, Product> products;
    public Inventory() {
        products = new HashMap<>();
    }
    public void addProduct(Product p) {
        if (products.containsKey(p.getId())) {
            System.out.println("Product with ID " + p.getId() + " already exists.");
        } else {
            products.put(p.getId(), p);
            System.out.println("Product added: " + p);
        }
    }
    public void removeProduct(int productId) {
        Product removed = products.remove(productId);
        if (removed == null) {
            System.out.println("Product with ID " + productId + " not found.");
        } else {
            System.out.println("Product removed: " + removed);
        }
    }
    public void updateQuantity(int productId, int newQuantity) {
        Product p = products.get(productId);
        if (p == null) {
            System.out.println("Product with ID " + productId + " not found.");
        } else {
            p.setQuantity(newQuantity);
            System.out.println("Quantity updated for product: " + p);
        }
    }
    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory list:");
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
    public void generateLowStockReport(int threshold) {
        System.out.println("Low stock items (threshold: " + threshold + "):");
        boolean found = false;
        for (Product p : products.values()) {
            if (p.getQuantity() <= threshold) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items with quantity <= " + threshold);
        }
    }
    // File handling: load and save
    public void loadFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int qty = Integer.parseInt(parts[2]);
                double price = Double.parseDouble(parts[3]);
                Product p = new Product(id, name, qty, price);
                products.put(id, p);
            }
            System.out.println("Loaded inventory from file: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename + ". Starting with empty inventory.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Product p : products.values()) {
                bw.write(p.getId() + "," + p.getName() + "," + p.getQuantity() + "," + p.getPrice());
                bw.newLine();
            }
            System.out.println("Saved inventory to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
