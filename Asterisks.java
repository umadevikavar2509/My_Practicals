package corejava;

public class Asterisks 
{
	public static void main(String[] args) 
	{ 
		int rows = 5;
		for (int i = 1; i <= rows; i++) 
		{
            for (int j = 1; j <= i; j++) 
            {
            // print asterisks
            System.out.print("*");
            }
            System.out.println();    
        }
    }

}
