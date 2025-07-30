package practice;
import java.util.Scanner;
//counting number of vowels
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int counter=0;
		String[] vow= {"a","e","i","o","u","A","E","I","O","U"};
		System.out.println("Enter a string to count vowels");
		String ip=sc.next();
		for(int i=0;i<vow.length;i++) {
			for(int j=0;j<ip.length();j++) {
				if(vow[i].charAt(0) == ip.charAt(j))
					counter++;
			}
		}
		System.out.println("Number of vowels is "+counter);
//		for(int i=0;i<ip.length();i++) {
//			 for(int j = 0; j < vow.length; j++) {
//			        if(ip.charAt(i) == vow[j].charAt(0)) {
//			            counter++;
//			        }}}
	}

}
/*
Enter a string to count vowels
pneumonoultramicroscopicsilicovolcanoconiosis
Number of vowels is 20
*/