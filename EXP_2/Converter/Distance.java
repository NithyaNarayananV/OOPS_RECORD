package Converter;
import java.util.Scanner;
public class Distance 
{
    public void CD()
    {
        double O,I;
        Scanner S = new Scanner(System.in); 
        System.out.print("Convert from (K-KM,M,I-Mile): ");
        char A = S.next().charAt(0);
        System.out.print("   Distance :");
        I = S.nextInt();
        System.out.print(" Convert to (K-KM,M,I-Mile) : ");
        char B = S.next().charAt(0);

        if ( A == 'K' && B == 'M')
        {    
            O = I * 1000 ;
            System.out.println("Distance in Meter : "+O);
        } 
        if ( A == 'M' && B == 'K')
        {    
            O = I / 1000 ;
            System.out.println("Distance in KM  : "+O);
        } 
        if ( A == 'K' && B == 'I')
        {    
            O = I / 1.6 ;
            System.out.println("Distance in Miles : "+O);
        } 
        if ( A == 'I' && B == 'K')
        {    
            O = I * 1.6 ;
            System.out.println("Distance in KM : "+O);
        } 
    }
}
