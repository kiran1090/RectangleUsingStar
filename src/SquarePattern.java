import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
        int i, j, my_input;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the length of a side : ");
        my_input = my_scanner.nextInt();
        System.out.println("The square pattern : ");
        for(i = 1; i <= my_input; i++){
            for(j = 1; j <= my_input; j++){
                System.out.print("*");
            }
            System.out.print("");
        }
    }
}