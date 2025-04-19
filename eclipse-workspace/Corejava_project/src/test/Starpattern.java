package test;
public class Starpattern {
    public static void main(String[] args) {
        // Loop to print the pattern
        for (int i = 1; i <= 2; i++) {
            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
