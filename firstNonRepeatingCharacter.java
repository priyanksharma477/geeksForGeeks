package strings;

import java.util.Scanner;

class xyz{
	int value;
	int index;
			
	xyz(int value, int index){  
		this.value=0;
		this.index=index;
	}
}

public class firstNonRepeatingCharacter {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		xyz count[]=new xyz[26];
		for(int i=0;i<26;i++)
			count[i]=new xyz(0,str.length()-1);
		int index=str.length()-1;
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)-'a'].value++;
			if(count[str.charAt(i)-'a'].value==1)
				count[str.charAt(i)-'a'].index=i;
		}
		for(int i=0;i<26;i++){
			if(count[i].value==1 && count[i].index < index)
				index=count[i].index;
		}
		System.out.println(str.charAt(index));
	}

}
