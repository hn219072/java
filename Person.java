package pr1.src;
Javafx.application.Application;

public class Person 
{
    int age=21,weight=56;
    //string color="light";

    void eat()
    {
        System.out.println("I am eating");
    }
    void sleep()
    {
        System.out.println("I am sleeping");
    }
     public static void main(String[] args)
     {
        Person p= new Person();
        System.out.println(p.weight);
        System.out.println(p.age);
        //System.out.println(p.color);
        p.eat();
        p.sleep();
     } 
    
    
}
