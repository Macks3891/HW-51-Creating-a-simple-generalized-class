public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();


        stringBox.set("Hello, World!");
        integerBox.set(42);


        System.out.println("stringBox: " + stringBox);
        System.out.println("integerBox: " + integerBox);


        System.out.println("stringBox is empty: " + stringBox.isEmpty());
        System.out.println("integerBox is empty: " + integerBox.isEmpty());


        String stringValue = stringBox.get();
        Integer integerValue = integerBox.get();


        System.out.println("stringValue: " + stringValue);
        System.out.println("integerValue: " + integerValue);


        stringBox.clear();
        integerBox.clear();


        System.out.println("stringBox is empty after clear: " + stringBox.isEmpty());
        System.out.println("integerBox is empty after clear: " + integerBox.isEmpty());
    }
}