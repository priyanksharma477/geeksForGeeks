package strings;

import java.util.Scanner;
 
public class Rearrange_d_distance {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int d=in.nextInt();
		char[] o=new char[s.length()];
		int count[]=new int[127];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
		int max;
		for(int i=0;i<s.length()-1;i++){
			max=0;
			for(int j=0;j<127;j++){
				if(count[j]>max)
					max=j;
			}
			System.out.println((char)max);
			count[max]=0;
			for(int j=i;j<s.length();j=j+d){
				o[j]=(char)max;
			}
		}
		System.out.println(String.valueOf(o));
	}

}
