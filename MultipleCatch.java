import java.util.Scanner;
import java.util.InputMismatchException;


public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] =new Integer[3];
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter the first element");
		array[0]=sc.nextInt();
		System.out.println("enter the second element");
		array[1]=sc.nextInt();
		for(Integer i:array)
		{
			System.out.println(i);
		}
		
		float result=array[0]/array[1];
		
		System.out.println(result);
		}	
		catch(ArithmeticException ae)
		{
			System.out.println("The exception is" +ae);
		}
        catch(InputMismatchException ime)
		{
        	System.out.println("enter only integers");
        	System.out.println(ime);
		}
	}

}
