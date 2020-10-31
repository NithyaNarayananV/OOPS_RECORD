package Converter;
import java.util.Scanner;
public class Time 
{
    public void CT()
    {
        double O,I;
        Scanner S = new Scanner(System.in); 
        System.out.print("   Convert from (H,M,S) : ");
        char A = S.next().charAt(0);
        System.out.print("   Time :");
        I = S.nextInt();
        System.out.print("   Convert to (H,M,S) : ");
        char B = S.next().charAt(0);

        if ( A == 'H' && B == 'M')
        {    
            O = I * 60 ;
            System.out.println("   Time in Min : "+O);
        } 
        if ( A == 'M' && B == 'H')
        {    
            O = I / 60 ;
            System.out.println("   Time in Min : "+O);
        }    
        if ( A == 'H' && B == 'S')
        {    
            O = I * 60 * 60 ;
            System.out.println("   Time in Sec : "+O);
        } 
        if ( A == 'S' && B == 'H')
        {    
            O = I / 60 / 60 ;
            System.out.println("   Time in Hr  : "+O);
        } 

    }
}
