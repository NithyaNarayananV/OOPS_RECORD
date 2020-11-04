/*
EX NO : 7	PROGRAM TO IMPLEMENT USER DEFINED EXCEPTION HANDLING

AIM
To write a java program to implement user defined exception handling

PROCEDURE
1.Create  a class which extends Exception class.
2.Create a constructor which receives the string as argument.
3.Get the Amount as input from the user.
4.If the amount is negative , the exception will be generated.
5.Using the exception handling mechanism , the thrown exception is handled by the catch 
   construct.
6.After the exception is handled , the string “invalid amount “ will be displayed.
7.If the amount is greater than 0 , the message “Amount Deposited “ will be displayed 
*/


import java.util.Scanner;
class NegativeAmtException extends Exception
{
    String msg;
    NegativeAmtException(String msg)
    {
       this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
public class userdefined 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int a=s.nextInt();
        try
        {
            if(a<0)
            {
                throw new NegativeAmtException("Invalid Amount");
            }
            System.out.println("Amount Deposited");
        }
        catch(NegativeAmtException e)
        {
            System.out.println(e);
        }
    }
}
