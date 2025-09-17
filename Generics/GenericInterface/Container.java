package Generics.GenericInterface;

public interface Container<T> {
    void addItem(T item);

    T getItem();
}