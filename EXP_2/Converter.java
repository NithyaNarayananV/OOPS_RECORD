/*
EX NO: 2
PROGRAM TO IMPLEMENT CURRENCY CONVERTER, DISTANCE
CONVERTER AND TIME CONVERTER USING PACKAGES
AIM
To develop a javax application to implement currency converter, distance converter and time converter
using the concept of packages.
PROCEDURE
1. Create a Package currencyconversion and place the class currency under the package
2. Create the methods to perform currency conversion from dollar to rupee, rupee to dollar, euro to
rupee, rupee to euro, yen to rupee and rupee to yen.
3. Create the package distanceconverion and create the class distance within the package
4. Create the methods to convert from meter to km, km to meter, miles to km,km to miles
5. Create the package timeconversion and create the class timer .Create the methods to convert
from hours to minutes ,hours to seconds , minutes to hours and seconds to hours
6. Create a class and import the packages currencyconversion, distanceconversion and time
conversion. Create the objects for the class currency, distance and timer.
7. Get the choice from the user and invoke the methods to perform the corresponding conversion
and display the value.

*/
import java.util.Scanner;

import Converter.Currency; 
import Converter.Time;
import Converter.Distance;

public class Converter 
{
    public static void main(String args[])
    {
        Currency C = new Currency();
        Time T = new Time();
        Distance D = new Distance();
        System.out.println("       ---Converter Program--- ");
        System.out.print("'C':Currency|'D':Distance|'T':Time: ");
        
        Scanner S = new Scanner(System.in); 
	    char CDT = S.next().charAt(0); 
        if (CDT=='C')
        {
            C.CC();
        }
        else if (CDT=='D')
        {
            D.CD();
        }
        else if (CDT=='T')
        {
            T.CT();
        }
        
    }
    
}
