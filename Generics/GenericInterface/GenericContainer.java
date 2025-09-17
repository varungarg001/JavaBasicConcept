package Generics.GenericInterface;

public class GenericContainer<T> implements Container<T>{


    private T item;
    @Override
    public void addItem(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }
    
}