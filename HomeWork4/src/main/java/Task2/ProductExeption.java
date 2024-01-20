package Task2;

public class ProductExeption extends RuntimeException{
    public ProductExeption() {
    }

    public ProductExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Товар не существует";
    }
}
