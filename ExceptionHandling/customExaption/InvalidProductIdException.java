

// Custom exception class for invalid product ID
class InvalidProductIdException extends Exception {
    public InvalidProductIdException(String message) {
        super(message);
    }
}

public class ProductCatalog {

    public void checkProductId(String productId) throws InvalidProductIdException {
        // Simulating an invalid product ID
        if (productId.equals("invalid123")) {
            throw new InvalidProductIdException("Invalid product ID entered: " + productId);
        } else {
            System.out.println("Product found: " + productId);
        }
    }

    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        try {
            catalog.checkProductId("invalid123"); // This will throw InvalidProductIdException
        } catch (InvalidProductIdException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
