package employee;
import java.io.*;
public class Employeedetails {

	public static boolean isOneOrSum10(int a, int b)
	{
		if(a==10||b==10)
			return true;
		else if(a+b==10)
			return true;
		else 
			return false;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a: ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter b: ");
		int b=Integer.parseInt(br.readLine());
		boolean result=Employeedetails.isOneOrSum10(a, b);
		System.out.println(result);
	}

}
