package Av2;
import java.util.Scanner;
import java.util.ArrayList;
public class questão2 {

	public static void main(String[] args) 
	{
		
			
			int m[][] = new int[2][2];
		
			m[0][0]=1;
			m[0][1]=2;
			m[1][0]=3;
			m[1][1]=4;
			
		for(int i=0; i<m.length; i++) {
			//System.out.print(m[i]+" ");
		for(int j=0;j<m[i].length;j++)
			System.out.println(m[i][j]+ " ");
					}
		System.out.println();
		}

}
