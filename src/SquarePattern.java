import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Nested Loop
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}