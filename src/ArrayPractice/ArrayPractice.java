package src.ArrayPractice;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print all elements in the array
        for (int number : numbers) {
            System.out.println(number);
        }

        // Create an array of Student objects
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 19)
        };

        // Print names and ages of all students
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }


        // nested arrays (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Print elements of the 2D array - first method
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print elements of the 2D array - second method
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        // Jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };      
        // Print elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {  
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
