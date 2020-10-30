import java.util.Scanner;
public class Electricity_Bill 
{
	public static void main(String[] args) 
	{
		Scanner A = new Scanner(System.in);
		int Consumer_no, Previous_Month, Current_Month,Total_Units;
		double Unit1=1, Unit2=2.5, Unit3=4, Unit4=6,Bill_Amount;
		char Connection_Type;
		System.out.println("		~~~Electricity Bill Generator~~~\n");
		System.out.print  ("		Consumer Number 	: ");
		Consumer_no= A.nextInt();
		System.out.print  ("		Connection Type (D/C) 	: ");
		Connection_Type=A.next().charAt(0);
		System.out.print  ("		Previous Month Reading 	: ");
		Previous_Month= A.nextInt();
		System.out.print  ("		Current Month Reading 	: ");
		Current_Month= A.nextInt();
		if (Connection_Type=='C')
		{
			Unit1=2;
			Unit2=4.5;
			Unit3=6;
			Unit4=7;
		}
		Total_Units=Current_Month-Previous_Month;
		if (Total_Units<101)
		{
			Bill_Amount=Total_Units*Unit1;
		}
		else
		{
			Bill_Amount=100*Unit1;
			if(Total_Units<201)
			{
				Bill_Amount=Bill_Amount+(Total_Units-100)*Unit2;
			}
			else
			{
				Bill_Amount=Bill_Amount+100*Unit2;
				if(Total_Units<501)
				{
					Bill_Amount=Bill_Amount+ (Total_Units-200)*Unit3;

				}
				else
				{
					Bill_Amount=Bill_Amount+300*Unit3;
					Bill_Amount=Bill_Amount=(Total_Units-500)*Unit4;
				}
			}
		}
		System.out.println("		Bill Amount   		: "+Bill_Amount);
		System.out.println("		     	~~~~Thank You~~~~		");
		System.out.println("	    Project Done by Nithya Narayanan C VR");
	}

}
