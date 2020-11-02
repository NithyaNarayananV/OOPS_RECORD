/*
EX NO :9	PROGRAM TO IMPLEMENT MULTITHREADED APPLICATION

AIM

To write a java program that implements a multi-threaded application .


PROCEDURE

1.Create a class even which implements first  thread that computes .the square of the number .

2. run() method implements the code to be executed when thread gets executed.

3.Create a class odd which implements second thread that computes the cube of the number.

4.Create a third thread that generates random number.If the random number is even , it displays 
 the square of the number.If the random number generated is odd , it displays the cube of the 
given number .

5.The Multithreading is performed and the task switched between multiple threads.

6.The sleep () method makes the thread to suspend for the specified time.



12.Write a java program that implements a multi-threaded application. First thread generates a random integer every 1 second and if the value is even, second thread computes the square of the number and prints. if the value is odd, the third thread will print the value of cube of the number.  

*/






















import java.util.*;
class even implements Runnable
{
    public int x;
    public even(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is EVEN and Square of " + x + " is: " + x * x);
    }
}
class odd implements Runnable
{
    public int x;
    public odd(int x)
    {
        this.x = x;
    }
    public void run()
    {
        System.out.println("New Thread "+ x +" is ODD and Cube of " + x + " is: " + x * x * x);
    }
}
class A extends Thread
{
    public void run()
    {
        int num = 0;
        Random r = new Random();
        try
        {
            
            for (int i = 0; i < 2; i++)
            {
                num = r.nextInt(100);
                System.out.println(i+") Main Thread and Generated Number is " + num);
                if (num % 2 == 0)
                {
                    Thread t1 = new Thread(new even(num));
                    t1.start();
                }    
                else
                {
                    Thread t2 = new Thread(new odd(num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("--------------------------------------");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
public class multithreadprog
{
    public static void main(String[] args)
    {
        A a = new A();
        a.start();
    }
}

