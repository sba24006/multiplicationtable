/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
         https://github.com/sba24006/multiplicationtable/blob/master/src/multiplicationtable/MultiplicationTable.java
 */
package multiplicationtable;


 import java.util.Scanner;
    public class MultiplicationTable {
        
        
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int n = scanner.nextInt();

        // Create a 2D array to hold the multiplication values
        // A 2D array is like a table with rows and columns
        int[][] table = new int[n][n];

        // Populate the 2D array with multiplication values
        // The outer loop goes through each row of the table
        for (int i = 0; i < n; i++) {
            // The inner loop goes through each column of the current row
            for (int j = 0; j < n; j++) {
                // Multiply the row index + 1 by the column index + 1
                // Add 1 because array indices start at 0, but the table starts at 1
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        // Outer loop prints each row
        for (int i = 0; i < n; i++) {
            // Inner loop prints each value in the current row
            for (int j = 0; j < n; j++) {
                // Print each value with some space for alignment
                // %4d means the value will take up at least 4 spaces
                System.out.printf("%4d", table[i][j]);
            }
            // Print a new line after finishing one row
            System.out.println();
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}