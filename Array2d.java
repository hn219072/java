package pr1;
import java.util.Scanner;

public class Array2d {
    public static void main(String[]args)
    {
        int a[][]=new int[2][2];
        System.out.println("Enter array elements: ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
            a[i][j]=s.nextInt();
            }
        }
        System.out.println("\nMatrix elements\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println( );

        }

        
        
    }    
    
}
