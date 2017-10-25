package strings;

import java.util.Arrays;
import java.util.Scanner;

public class RepetivePermute {
	public static void main(String args[]){ 
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char data[]=new char[s.length()+1];
		data[s.length()]='\0';
		char input[]=s.toCharArray();
		Arrays.sort(input);
		permute(String.valueOf(input), data, 0, s.length()-1);
	}

	private static void permute(String s, char[] data, int index, int last) {
		for(int i=0;i<s.length();i++){ 
			data[index]=s.charAt(i);
			if(index==last)
				System.out.println(String.valueOf(data));
			else
				permute(s, data, index+1, last);
		}
	}

}
