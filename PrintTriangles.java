package java_project;

import java.util.Scanner;
class PrintTriangles 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Rows : ");
		int rows=sc.nextInt();
		printMultipleOfTwoTriangle(rows);
		sc.close();
	}
	
	public static void printMultipleOfTwoTriangle(int rows)
	{
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=2*rows;j++) 
			{
				if (j==rows+1) {
					continue;
				}

				int k=(j<rows+1) ? j : 2*rows-j+1;
				if (k >= rows+1-i) {
					int x = (int) Math.pow(2, (i+k-rows - 1));
					System.out.printf("%3d", x);
				}
				else {
					System.out.print("   ");
				}
				System.out.print(" ");                
			}
			System.out.println();
		}
	}
}
