package GeeksForGeeks;

/*The reverse and add function starts with a number, reverses its digits, and adds the reverse to the original. If the sum is not a palindrome, repeat this procedure until it does. 

Write a program that takes number and gives the resulting palindrome (if one exists). If it took more than 1,000 iterations (additions) or yield a palindrome that is greater than 4,294,967,295, assume that no palindrome exist for the given number.

Examples: 

Input : 195
Output : 9339

Input : 265
Output: 45254

Input : 196
Output : No palindrome exist  */

public class ReverseAddPalindrome {
	
	static int count =0;
	
	public static void main(String[] args) {
		long n =195l;
		System.out.println(reverseAddNums(n));
	}
	
	
	
	public static long reverseAddNums(long n) {
		
			long sum = n+getReverse(n);
			//check if palindrome -yes then return 
			//else - pass sum to reverseAddNums
			//if sum ==max ..return fail
			//if count == 1000 return fail
			if(isPalindrome(sum))
				return sum;
			else if(isPalindrome(sum) == false)
				reverseAddNums(sum);
			
			else if(count++>=1000 || sum > 4294967295l)
				return -1;
				
	return -1;
	}
	
	public static boolean isPalindrome(long a) {
		StringBuilder a1 = new StringBuilder(String.valueOf(a));
		if(a1.equals(a1.reverse()))
			return true;
		else
			return false;
	}
	
	
	public static long getReverse(long n) {
		
		long rev_n =0;
		while(n>0) {
			rev_n = rev_n*10+n%10;
			n=n/10;
		}
		return rev_n;
	}

}
