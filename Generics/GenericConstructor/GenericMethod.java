package Generics.GenericConstructor;

enum operation {
    ADD, MULTIPLY, SUBTRACT, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
        };
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(operation.ADD.apply(10,12 ));
        System.out.println(operation.MULTIPLY.apply(1045,12 ));
    }
}
