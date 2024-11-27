import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        int a = 10;
        int b = 30;

        System.out.println("Enter a number:");
        int input = myobj.nextInt();  

        System.out.println("The input is: " + input);
        System.out.println("The sum of a and b is: " + (a * b));  
    }
}


    