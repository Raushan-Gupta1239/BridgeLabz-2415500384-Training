import java.util.Scanner;
public class HandShakes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int handshakes = (n * (n - 1)) / 2;
            System.out.println("Maximum number of handshakes: " + handshakes);
        }
        sc.close();
    }
}