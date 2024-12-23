import java.lang.reflect.Method;

class Printer {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        Method[] methods = Printer.class.getDeclaredMethods();
        int count = 0;

        for (Method method : methods) {
            if (method.getName().equals("printArray")) {
                count++;
            }
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
    }
}
