/**
 * The program outputs a circle to the console as symbols, using the diameter entered by the user.
 * The user can choose between two types of circle: filled and with only a stroke.
 * The circle is output line by line, taking into account the entered data.
 */

package Circle;

import java.util.Scanner;
/**
 * Circle is the main class of the program, which manages user input,
 * creating circle objects, and outputting the circle to the console.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entering the circle diameter
        System.out.print("Enter the diameter of the circle: ");
        int diameter = scanner.nextInt();

        // Selection of the circle type (filled or stroke only)
        System.out.print("Choose the type of circle: 1 - filled, 2 - stroke only: ");
        int circleType = scanner.nextInt();

        CircleCols cols;
        if (circleType == 1) {
            // Creating an object for a filled circle
            cols = new CircleColsFill(diameter);
        } else if (circleType == 2) {
            // Creating an object for a circle with a stroke only
            cols = new CircleColsStroke(diameter);
        } else {
            // If an incorrect value is entered, we notify the user and terminate the program
            System.out.println("Incorrect selection of circle type.");
            return;
        }

        // Circle row output
        CircleRowOut circleRowOut = new CircleRowOut(diameter);

        // Loop for output of circle in console
        for (int row = 0; row < diameter; row++) {
            cols.calculate(row); // Calculate results for circle rows
            circleRowOut.print(cols); // Output to the console
        }
    }
}
