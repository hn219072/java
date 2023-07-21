package pr1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[]args)
    {
        int a,b,c,ch;
        System.out.println("Enter your number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter your choice: ");
        ch=s.nextInt();
        
        switch(ch)
        {
            case 1:c=a+b;
            {
              System.out.println("answer:"+c); 
              break; 
            }
            case 2:c=a-b;
             {
              System.out.println("answer:"+c); 
              break; 
            }
            case 3:c=a*b;
             {
              System.out.println("answer:"+c); 
              break; 
            }
            case 4:c=a/b;
             {
              System.out.println("answer:"+c);
              break;  
            }
            default:
            {
                System.out.println("wrong input");
                break;
            }
        }
    }

    
}
