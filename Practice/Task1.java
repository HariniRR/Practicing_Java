package practice;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int i=0;
		int sum=0;
		System.out.println("Enter the elements for the array:");
		while(i<arr.length) {
			arr[i]=sc.nextInt();
			i++;
		}
		for(i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the elements in the array is "+sum);
	}

}
// Adding the elements n an array
/*Output : 
Enter the elements for the array:
2
9
3
1
4
Sum of the elements in the array is 19
*/