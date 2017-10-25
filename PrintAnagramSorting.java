package strings;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAnagramSorting {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String[] s={"cat", "tac", "dog", "act", "god"};
		int index[]=new int[5];
		for(int i=0;i<5;i++){
			char c[]=s[i].toCharArray();
			Arrays.sort(c); 
			s[i]=String.valueOf(c);
			index[i]=i;
		}
		
		for(int i=0;i<5;i++)
			System.out.println(s[i]);
		int k=1;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(s[i].compareTo(s[j])==0)
					;
				
			}
		}
	}

}
