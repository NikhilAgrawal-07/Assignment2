import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a string. ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            int square = number * number;
            System.out.println(square);
            System.out.println("The work has been done successfully");
        }
        catch(NumberFormatException e){
            System.out.println("Entered input is not a valid format for an Integer.");
        }
    }
}
