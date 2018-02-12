package employee;
import java.io.*;
import java.util.*;
public class sudokoValidator {
	public boolean validateSudoku (int[][] board,int rows,int cols)
	{
		if (board == null || board.length != rows || board[0].length != cols)
			return false;
		// check each column
		for (int i = 0; i < cols; i++) {
			boolean[] m = new boolean[cols];
			for (int j = 0; j < cols; j++) {
				if (board[i][j] != '.') {
					if (m[(int) (board[i][j] - '1')]) {
						return false;
					}
					m[(int) (board[i][j] - '1')] = true;
				}
			}
		}
	 
		//check each row
		for (int j = 0; j < rows; j++) {
			boolean[] m = new boolean[rows];
			for (int i = 0; i < rows; i++) {
				if (board[i][j] != '.') {
					if (m[(int) (board[i][j] - '1')]) {
						return false;
					}
					m[(int) (board[i][j] - '1')] = true;
				}
			}
		}
	 
		//check each 3*3 matrix
		for (int block = 0; block < rows; block++) {
			boolean[] m = new boolean[rows];
			for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
				for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
					if (board[i][j] != '.') {
						if (m[(int) (board[i][j] - '1')]) {
							return false;
						}
						m[(int) (board[i][j] - '1')] = true;
					}
				}
			}
		}
	 
		return true;
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int m=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows: ");
	m=Integer.parseInt(br.readLine());
	
int [][] a= new int[m][m];
int newRow=m*m;
int newCol=m*m;
System.out.println("Enter the values to validate in matrix:");
for(int i=0;i<newRow;i++)
{
	for(int j=0;j<newCol;j++)
	{
		a[i][j]=Integer.parseInt(br.readLine());
	}
}
sudokoValidator s=new sudokoValidator();
boolean result=s.validateSudoku(a);
if(result==true)
	System.out.println("The values of sudoko is valid");
else 
	System.out.println("The value of the sudoko is invalid");
	}

}
