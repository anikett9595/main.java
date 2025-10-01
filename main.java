public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        int num1 = 10;   // primitive
        int num2 = 20;

        // Autoboxing: primitive -> Integer object
        Integer obj1 = num1;
        Integer obj2 = num2;

        // Unboxing: Integer -> primitive
        int sum = obj1 + obj2;

        System.out.println("Sum = " + sum);
    }
}
