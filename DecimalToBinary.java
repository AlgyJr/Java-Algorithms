/**
 * @author Almeida Joao de Almeida
 *22/03/2001 Save the date
 * May the force be with you Jun 13, 2019
 */
import java.io.*;
public class DecimalToBinary 
{
	public static void main(String[]args) { decimal();}

	public static int number()
	{
		BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		do 
		{
			System.out.println("Insert a decimal number!");
			try
			{
				n=Integer.parseInt(y.readLine());
			}catch(NumberFormatException i) {System.out.println(i.getMessage());}
			catch(IOException ie) {System.out.println(ie.getMessage());}
			if(n<0)
				System.err.println("Invalid number");
		}while(n<0);
		return n;
	}
	public static void decimal()
	{
		int n=0,remain,k;
		String binary=" ";
		String binary2="";
		n=number();
		do
		{
			remain=n%2; //to get the remainder from the division
			n=n/2; //to reduce the number
			binary+=remain; 
		}while(n>=1);
		//System.out.println(binary);

		//para inverter a string
		for(int i=binary.length()-1;i>0;i--)
		{
			//System.out.print(binary.charAt(i));
		  binary2+=binary.charAt(i);
		}
		System.out.println(binary2);
	}
}
