package com.multidarray.java;

public class MuldSample1 {

	public static void main(String[] args) 
	{
		int[][] arr=new int[3][3];//3 row and 3 column  
		arr[0][0]=1;  
		arr[0][1]=2;  
		arr[0][2]=3;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		arr[2][0]=7;  
		arr[2][1]=8;  
		arr[2][2]=9;  
		
		int sum =0;
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+" ");
			
			sum+=arr[i][j];
			}
			System.out.println(); // new line
		}
		
		System.out.println(sum);

	}

}
