package src.Variables;

public class Integers {
    public static void main(String[] args) {
        // Size of each integer type in bytes
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");   
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");

        // size in bits
        System.out.println("Sise in bits:");
        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits"); 
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
    }
} 