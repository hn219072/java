package pr1;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Even
 {
    public static void main(String[]args)
    {
        int num;
        System.out.println("enter a number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>0)
        {
            if(num%2==0)
            {
                System.out.println("even");
                break;
            }
            else
           {
            System.out.println("odd");
            break;
            }
            
        }
        
    }  
 }
