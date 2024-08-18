import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0, width = 0, area, perimeter, diagonalLength;

        System.out.println("What is the length: ");
        if (scanner.hasNextDouble()) {
            length = scanner.nextDouble();
            if (length < 0) {
                System.out.println("Invalid: Length cannot be negative ");
            } else {
                System.out.println("What is the width: ");
                if (scanner.hasNextDouble()) {
                    width = scanner.nextDouble();
                    if (width < 0) {
                        System.out.println("Invalid: Width cannot be negative ");
                    } else {
                        area = length * width;
                        perimeter = 2 * (length + width);
                        diagonalLength = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

                        System.out.println("Area of the rectangle: " + area);
                        System.out.println("Perimeter of the rectangle: " + perimeter);
                        System.out.println("Length of the diagonal: " + diagonalLength);
                    }
                } else {
                    System.out.println("Invalid input for width. Please enter a valid number.");
                }
            }
        } else {
            System.out.println("Invalid input for length. Please enter a valid number.");
        }
    }
}

