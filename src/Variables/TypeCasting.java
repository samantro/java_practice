package src.Variables;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Integer value: " + myInt);      // Outputs 9
        System.out.println("Double value: " + myDouble);    // Outputs 9.0

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("Double value: " + myDouble2);   // Outputs 9.78
        System.out.println("Integer value: " + myInt2);     // Outputs 9
    }
}
