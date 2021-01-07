package practice11;
import java.util.Scanner;

public class practice11_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();
		System.out.println("The random array is");
		int [][] ary = new int [n][n];
		for (int i=0;i<ary.length;i++) {
			for (int j=0;j<ary.length;j++) {
				ary[i][j]=(int)(Math.random()*2);
				System.out.print(ary[i][j]);
			}
			System.out.println();
		}
		int maxR=0;
		int maxC=0;
		int row=0;
		int col=0;
		for (int i=0;i<ary.length;i++) {
			int numR=0;
			int numC=0;
			for (int j=0;j<ary.length;j++) {
				if(ary[i][j]==1) {
					numR++;
				}
				if(ary[j][i]==1) {
					numC++;
				}
			}
			if(numR>maxR) {
				maxR=numR;
				row=i;
			}
			if(numC>maxC) {
				maxC=numC;
				col=i;
			}
		}
		System.out.println("The largest row index: "+row);
		System.out.println("The largest column index: "+col);
	}

}
