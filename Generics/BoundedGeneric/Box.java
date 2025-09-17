package Generics.BoundedGeneric;

public class Box<T extends Number> { // and we set bounderies like it can only accept the integer value like that

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // now box is generic class 
}