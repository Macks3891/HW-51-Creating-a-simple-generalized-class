public class Box<T> {
    private T item;


    public Box() {
        this.item = null;
    }


    public Box(T item) {
        this.item = item;
    }


    public T get() {
        return item;
    }


    public void set(T item) {
        this.item = item;
    }


    public boolean isEmpty() {
        return item == null;
    }


    public void clear() {
        this.item = null;
    }

    @Override
    public String toString() {
        return "Box{item=" + item + "}";
    }
}