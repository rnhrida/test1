// Save this file exactly as PrintSample.java
public class PrintSample {
    public static void main(String[] args) {
        // System.out.println prints the text and moves to a new line
        System.out.println("Hello, World!");
        System.out.println("This is a standard Java print statement.");

        // System.out.print prints text without adding a new line
        System.out.print("This text stays ");
        System.out.print("on the same line.\n"); // \n manually adds a new line

        // System.out.printf allows for formatted strings
        int year = 2026;
        System.out.printf("The current year is %d.%n", year);
    }
}
