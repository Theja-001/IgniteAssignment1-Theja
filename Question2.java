//BubbleSort
package com.company;

public class Question2 {

	public static void main(String[] args) {
		int[]b_nums= {3};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}

