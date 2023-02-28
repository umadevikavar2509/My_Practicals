import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter the Three Numbers: ");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d= a+b+c;
        System.out.println("Addition of three numbers are = "+d);
    }
}