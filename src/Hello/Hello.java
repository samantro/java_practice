package Hello;
class Calculator {
    private int num1, num2;
    Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public int add() {
        System.out.println("in add method");
        return num1 + num2;
    }

    public int multiply(){
        System.out.println("in multiply method");
        return num1 * num2;
    }
}

public class Hello {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Hello, World!");
        Calculator calc = new Calculator(a, b);
        int result = calc.add();
        System.out.println("Result: " + result);
        int mul = calc.multiply();
        System.out.println("Multiplication Result: " + mul);
    }
}
