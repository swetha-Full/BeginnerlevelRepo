package employee;
import java.io.*;
import java.util.Random;
public class RandomNumberGenerator {
	private static final String CHAR_LIST="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	 private static final int RANDOM_STRING_LENGTH = 10;
	  public String generateRandomString(){
	         
	        StringBuffer randStr = new StringBuffer();
	        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
	            int number = getRandomNumber();
	            char ch = CHAR_LIST.charAt(number);
	            randStr.append(ch);
	        }
	        return randStr.toString();
	    }
			
	  private int getRandomNumber() {
	        int randomInt = 0;
	        Random randomGenerator = new Random();
	        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
	        if (randomInt - 1 == -1) {
	            return randomInt;
	        } else {
	            return randomInt - 1;
	        }
	  }
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		RandomNumberGenerator msr = new RandomNumberGenerator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of string you wany to generate: ");
		int count=Integer.parseInt(br.readLine());
		for(int i=1;i<=count;i++)
		{
        System.out.println(msr.generateRandomString());
		}

	}

}
