package Task2;

public class CustomerExeption extends RuntimeException{
    public CustomerExeption() {
    }

    public CustomerExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Введен не существующий покупатель ";
    }
}
