package employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstReversal {
	static int i,c=0,res; 
	static void stringreverse(String s) 
	{ 
	char ch[]=new char[s.length()]; 
	for(i=0;i < s.length();i++) 
	ch[i]=s.charAt(i); 
	char temp;
	temp=ch[0];
	ch[0]=ch[1];
	ch[1]=temp;
	temp=ch[s.length()-1];
	ch[s.length()-1]=ch[s.length()-2];
	ch[s.length()-2]=temp;
	//for(i=s.length()-1;i>=0;i--)
	for(i=0;i < s.length();i++) 
	System.out.print(ch[i]); 
	} 
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to be reversed: ");
		String str=br.readLine();
		firstReversal.stringreverse(str);
	}

}
