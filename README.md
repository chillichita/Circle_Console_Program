# Circle Console Program

This program renders a circle in the console using ASCII characters. The user provides the diameter and selects between a filled circle or a circle with only an outline (stroke). The program then prints the circle row by row.

It was made to practice OOP (inheritance, encapsulation, abstraction, polymorphism).

## Features
- Accepts user input for the diameter of the circle.
- User can choose between:
  - A filled circle.
  - A circle with only the outline (stroke).
- Outputs the circle as ASCII characters in the console.

## Usage

### Input
1. The program first asks the user for the diameter of the circle.
2. Then the user selects the type of circle:
   - `1` for a filled circle.
   - `2` for a stroke-only circle.

### Output
The program will output the chosen circle to the console using ASCII characters, where `*` represents the circle, and spaces represent the background.

### Example
**1) If user choose a filled circle.**
```
Enter the diameter of the circle: 10
Choose the type of circle: 1 - filled, 2 - stroke only: 1
    *     
 *******  
********* 
********* 
********* 
********* 
********* 
********* 
 *******  
    *     
```

**2) If user choose stroke-only circle.**
```
Enter the diameter of the circle: 10
Choose the type of circle: 1 - filled, 2 - stroke only: 2
    *     
 *     *  
*       * 
*       * 
*       * 
*       * 
*       * 
*       * 
 *     *  
    *      
```

### Requirements
- Java 8 or higher
- Console or terminal to run the program

## Files
- **Circle.java** - Main class for handling user input and output.
- **CircleCols.java** - Interface defining the structure for circle drawing.
- **CircleColsBase.java** - Abstract class for common calculations used in circle rendering.
- **CircleColsFill.java** - Class for rendering a filled circle.
- **CircleColsStroke.java** - Class for rendering a circle with only a stroke.
- **CircleRowOut.java** - Class responsible for printing the circle row by row.

## Installation
1. Clone the repository: git clone [https://github.com/chillichita/Circle-Console-Program.git](https://github.com/chillichita/Circle_Console_Program.git)
2. Navigate to the project directory: cd Circle
3. Compile the program: javac Circle.java
4. Run the program: java Circle
