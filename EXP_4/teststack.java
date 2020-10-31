import java.io.*;
interface stackoperation
{
    public void Push(int I);
    public void Pop();
}
class Astack implements stackoperation 
{
    int stack[] = new int[5];
    int top = 1;
    int i;
    public void Push(int Item)
    {
        if(top>=4)
            System.out.println("OVERFLOW");
        else
        {
            top+=1;
            stack[top] = Item;
            System.out.println("Item Pushed  "+stack[top]);
        }
    }
    public void Pop()
    {
        if(top<0)
            System.out.println("UnderFlow");
        else
        {
            System.out.println("Item Popped "+stack[top]);
            top-=1;
        }
    }
    public void Display()
    {
        if(top<0)
            System.out.println("No Element in Stack");
        else
        {
            for(i=2;i<=top;i++)
                System.out.println("Element : "+stack[i]);
        }
    }  
}
class teststack
{
    public static void main(String args[]) throws IOException
    {
        int Ch,C,I;
        Astack S = new Astack();
        DataInputStream in = new DataInputStream(System.in);
        do
        {
            C=1;
            System.out.println("ARRAY STACK");
            System.out.print("1.Push | 2.Pop | 3.Display | 4.Exit : ");
            Ch = Integer.parseInt(in.readLine());
            switch(Ch)
            {
                case 1:
                    System.out.print("Enter a Value to Push : ");
                    I = Integer.parseInt(in.readLine());
                    S.Push(I);
                    break;
                case 2:
                    S.Pop();
                    break;
                case 3:
                    System.out.println("The Elements are :- ");
                    S.Display();
                    break;
                case 4:
                    C=0;
                    break;
            }
        }while(C==1);
    }
}