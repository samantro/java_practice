package src.StringPractice;

public class StringPractice {
  public static void main(String[] args) {
    String str1 = "Hello, ";
    String str2 = "World!";
    
    // Concatenate two strings
    String greeting = str1 + str2;
    System.out.println(greeting);
    
    // Find the length of the concatenated string
    int length = greeting.length();
    System.out.println("Length of greeting: " + length);
    
    // Convert to uppercase
    String upperCaseGreeting = greeting.toUpperCase();
    System.out.println("Uppercase Greeting: " + upperCaseGreeting);
    
    // Replace a substring
    String newGreeting = greeting.replace("World", "Java");
    System.out.println("New Greeting: " + newGreeting);
  }
}
