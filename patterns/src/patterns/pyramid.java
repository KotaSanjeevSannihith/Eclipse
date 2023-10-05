package patterns;

import java.util.Scanner;

public class pyramid
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        for (int r=0; r<n; r++)
        {
            for (int c=n-r; c>1; c--)
            {
                System.out.print(" ");
            }
            for (int c=0; c<=r; c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
