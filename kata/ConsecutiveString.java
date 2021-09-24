package com.kata;

public class ConsecutiveString {

	
	public static String longestConsec(String[] strarr, int k) {
		
		int i,front = 0,size = 0,longSize = 0;
		String newString;
		String longString = "";
		for(i = k-1;i<strarr.length-k;i++,front++)
		{
			if(size == 0)
			{
			
				longString = strarr[front].concat(strarr[front+1]);
				longSize = longString.length();
				
			}
			else {
				
				newString= strarr[front].concat(strarr[front+1]);
				size = newString.length();
				if(size>longSize)
				{
					longString = newString;
					size = longSize;
				}
				
			}
		}
		return longString;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2);
		String str2 = longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1);
		String str3 = longestConsec(new String[] {}, 3);
		String str4 = longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	
	}

}
