package pr1;
import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static void main(String[]args)
    {
        int a[]=new int[5];
        System.out.println("Enter array elements: ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int b:a)
        {
            System.out.print(b+" ");
        }
    }    
    
}
