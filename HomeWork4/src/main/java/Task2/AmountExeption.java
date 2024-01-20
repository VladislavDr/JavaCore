package Task2;

public class AmountExeption extends RuntimeException{
    public AmountExeption() {
    }

    public AmountExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Введено не корректное значение количества товара";
    }
}
