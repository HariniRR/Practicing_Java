MonkeysInGarden
/*
-The problem involves a garden with 30 trees.
-Monkeys cannot jump directly from one tree to another.
-Each tree has a height denoted by H, which affects the monkey's ability to traverse.
-Monkeys can only move to adjacent trees.
*/

import java.util.*;

public class MonkeysInGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of trees
        int[] trees = new int[n];
        
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt(); // Monkeys on each tree
        }
        
        // Find the index we want all monkeys to gather at
        int optimalIndex = n / 2; // Middle tree
        
        // Calculate max jumps needed (distance from farthest tree)
        int maxJumps = 0;
        for (int i = 0; i < n; i++) {
            if (trees[i] > 0) { // If tree has monkeys
                int jumps = Math.abs(i - optimalIndex);
                if (jumps > maxJumps) {
                    maxJumps = jumps;
                }
            }
        }
        
        System.out.println(maxJumps);
    }
}
