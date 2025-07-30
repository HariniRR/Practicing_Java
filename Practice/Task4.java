package practice;

import java.util.ArrayList;
import java.util.Scanner; 

// sorting ArrayList 
public class Task4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 6 numbers to sort ");
        
        for (int i = 0; i < 6; i++) {
            list.add(s.nextInt());
        }
        
        // sorting in ascending order using Bubble Sort
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        
        // Print the sorted list
        System.out.println("Sorted numbers: " + list);
    }
}
/*Output
Enter 6 numbers to sort 
58
65
35
69
95
65
Sorted numbers: [35, 58, 65, 65, 69, 95]
*/