package backtracking;

import java.util.Scanner;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn =  new Scanner(System.in);
      String str = scn.next();
      // string, left boundry, right boundry
      findPermutation(str,0,str.length()-1);
	}
	private static void findPermutation(String str, int left, int right)
	{
		if(left == right)
		{
			System.out.println(str);
		}
		else
		{
			for(int i = left; i<=right; i++)
			{
				// do
				str = swap(str,left,i);
				// recursion
				findPermutation(str,left + 1,right);
				//undo
				str = swap(str,left,i);
			}
		}
		
	}
	private static String swap(String str,int left,int i)
	{
		char t;
		char[] charA = str.toCharArray();
		t = charA[left];
		charA[left] = charA[i];
		charA[i]=t;
		
		return String.valueOf(charA);
	}

}
