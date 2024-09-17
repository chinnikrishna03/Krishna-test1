public class TaskFunctions {

    // Function a to Check if the given number is odd or even
    public static void isOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
    
    // Function b to Check if the number is divisible by 2 to 9
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    // Function c to Compare two numbers and return the bigger number
    public static int compareNumbers(int x, int y) {
        return Math.max(x, y);
    }

    // Function d to Find the biggest number among three given numbers
    public static int findBiggest(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    // Function e to Print the numbers from 1 to 10
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Function f to Check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function g to Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function h to Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function i to Divide two numbers
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
    }

    // Function j to Calculate (a + b)^2
    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // Function k to Find the area of a circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Function l to Find the area of a square
    public static int areaOfSquare(int side) {
        return side * side;
    }

    // Function m to Find the area of a rectangle
    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    // Function n to Find the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Function o to Find the square root of a number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Main method to test the functions
    public static void main(String[] args) {
        System.out.println("I am Steve");

        // Test Function a
        isOddOrEven(7);

        // Test Function b
        System.out.println("Is 15 divisible by 3? " + isDivisibleBy(15, 3));

        // Test Function c
        System.out.println("Bigger number: " + compareNumbers(10, 20));

        // Test Function d
        System.out.println("Biggest number: " + findBiggest(5, 12, 7));

        // Test Function e
        printNumbers();

        // Test Function f
        System.out.println("Is 2024 a leap year? " + isLeapYear(2024));

        // Test Function g
        System.out.println("Sum: " + add(5, 3));

        // Test Function h
        System.out.println("Product: " + multiply(4, 5));

        // Test Function i
        System.out.println("Division: " + divide(10, 2));

        // Test Function j
        System.out.println("(a + b)^2: " + squareOfSum(3, 4));

        // Test Function k
        System.out.println("Area of Circle: " + areaOfCircle(7));

        // Test Function l
        System.out.println("Area of Square: " + areaOfSquare(5));

        // Test Function m
        System.out.println("Area of Rectangle: " + areaOfRectangle(6, 8));

        // Test Function n
        System.out.println("Area of Triangle: " + areaOfTriangle(10, 5));

        // Test Function o
        System.out.println("Square Root: " + squareRoot(16));
    }
}
