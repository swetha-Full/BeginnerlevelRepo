package employee;
import java.io.*;

public class multiplesOf3Or5 {
	public boolean multipleOf3Or5Only(int n)
	{
		
		if(n%3==0&&n%5==0)
		return false;
		else if(n%3==0||n%5==0)
			return true;
		else
			return false;
		
		
		
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
	int number=Integer.parseInt(br.readLine());
	multiplesOf3Or5 n=new multiplesOf3Or5();
	boolean result=n.multipleOf3Or5Only(number);
		System.out.println(result);
	}

}
