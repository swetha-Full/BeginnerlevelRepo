package employee;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class RandomNumberGen {
public static int counting6(int n)
{
	int rem=0;
	int count=0;
	while(n!=0)
	{
		rem=n%10;
		n=n/10;
		if(rem==6)
			count++;
	}
	return count;
}
public static int counting9(int n)
{
	int rem=0;
	int count=0;
	while(n!=0)
	{
		rem=n%10;
		n=n/10;
		if(rem==9)
			count++;
	}
	return count;
}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int count6=0,count9=0,count1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Random rand = new Random();
		System.out.println("Enter the total number of rando numbers that you want to generate:");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
		int ran=rand.nextInt(100);
		System.out.println(ran);
		int count=RandomNumberGen.counting6(ran);
	    count6=count6+count;
	     count1=RandomNumberGen.counting9(ran);
		count9=count9+count1;
		}
		System.out.println("Total number 6 is "+count6);
		System.out.println("The total number of 9 is "+count9);
	}

}
