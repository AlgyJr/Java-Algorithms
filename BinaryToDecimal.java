/*
Este codigo foi criado por Almeida Joao de Almeida
11:41:40 PM  Jun 22, 2019
*/

/**
 * @author Almeida Joao de Almeida
 *22/03/2001 Save the date
 * May the force be with you Jun 22, 2019
 */
import java.io.*;
public class BinaryToDecimal
{

	public static void main(String[]args)
	{
	  String numero=number();
	  conversao(numero);
	}
	public static void conversao(String n)
	{
	  int sum=0,value;
	  int cont=0;
		for(int i=n.length()-1;i>=0;i--)
	  {
	    if(n.charAt(i)=='1')
	      sum+=Math.pow(2, cont);  
	    cont++;
	  }
	  System.out.println("O valor em decimal e:"+sum);
	}
	
	public static String number()
	{
	  BufferedReader y=new BufferedReader(new InputStreamReader(System.in));	
	  String m="";
	  boolean ok=false;
	  do 
	  {
	  	System.out.println("Introduza um numero binario");
	  	try
	  	{
	  		m=y.readLine();
	  		ok=true;
	  		for(int i=0;i<m.length();i++)
	  		{
	  			if(m.charAt(i)!='0' && m.charAt(i)!='1')
	  				ok=false;
	  		}
	  		if(!ok)
	  			System.err.println("Nao e decimal");
	  	}catch(IOException u) {System.out.println(u.getMessage());}
	  }while(!ok);
	  return m;
	}
}
