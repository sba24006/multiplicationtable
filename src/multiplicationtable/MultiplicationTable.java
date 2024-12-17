/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationtable;


 import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the table
        System.out.print("Enter size of multiplication table: ");
        int n = scanner.nextInt();

        // Create a 2D array to hold the multiplication values
        int[][] table = new int[n][n];

        // Populate the 2D array with multiplication values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", table[i][j]); // Format the output for alignment
            }
            System.out.println(); // Move to the next row
        }

        // Close the scanner
        scanner.close();
    }
}
