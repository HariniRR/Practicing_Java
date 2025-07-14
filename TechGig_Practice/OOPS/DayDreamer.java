import java.io.*;
import java.util.*;

public class DayDreamer {
    static class Cell {
        int x, y, time;
        Cell(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[][] grid = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }
        
        System.out.println(minTime(grid, M, N));
    }

    private static int minTime(int[][] grid, int M, int N) {
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        Map<Integer, List<int[]>> jumpMap = new HashMap<>();
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] > 0) {
                    jumpMap.computeIfAbsent(grid[i][j], k -> new ArrayList<>()).add(new int[]{i,j});
                }
            }
        }
        
        PriorityQueue<Cell> pq = new PriorityQueue<>((a,b) -> a.time - b.time);
        boolean[][] visited = new boolean[M][N];
        pq.add(new Cell(0, 0, 0));
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            
            if (curr.x == M-1 && curr.y == N-1) {
                return curr.time;
            }
            
            for (int[] dir : dirs) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];
                
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    int newTime = curr.time + (grid[nx][ny] < 0 ? -grid[nx][ny] : 1);
                    pq.add(new Cell(nx, ny, newTime));
                }
            }
            
            if (grid[curr.x][curr.y] > 0) {
                List<int[]> jumps = jumpMap.get(grid[curr.x][curr.y]);
                if (jumps != null) {
                    for (int[] jump : jumps) {
                        if (!visited[jump[0]][jump[1]]) {
                            visited[jump[0]][jump[1]] = true;
                            pq.add(new Cell(jump[0], jump[1], curr.time + 1));
                        }
                    }
                    jumpMap.remove(grid[curr.x][curr.y]);
                }
            }
        }
        
        return -1;
    }
}


/*
Ritik is a man of dreams, he keeps dreaming day and night, wondering about space and time, sci-fi and a lot more. Today is yet another day when he dreamed about a Galactic Grid where he was supposed to rescue his friend Kriti. Now this Grid is slightly unusual consisting of two species Vilgax and Arkaknight.


Vilgax is bad and can freeze you for some time whereas Arkaknight is good and lets you jump from one place to another.


The Grid is made up of m rows and n columns. Each cell consists of an integer either positive, negative or zero.There are exactly two zeroes one at top-left corner and the other at bottom-right corner of the grid representing initial positions of Ritik and Kriti respectively.


A positive integer represents an Arkaknight. It gives you the power to jump from cell to another containing the same integer anywhere within the grid. For example - a cell containing 2 can let you jump to any other cell containing 2 in the grid if there is one.


A negative integer represents a Vilgax. It freezes for a certain period of time that is you cannot move for certain units of time represented by the absolute value of the integer present in that cell.For example , a cell containing -3 makes you freeze for 3 units of time in that cell i.e you cannot move or jump to any other cell.


Ritik can also move to any cell that share a common wall i.e adjacent to each other ( top, left, right and bottom ) within the grid. It takes one unit of time to jump from one cell to another.

Your task is to tell the minimum units of time taken by Ritik to reach Kriti given the grid of m x n.
Input Format
First line of input contains number of rows  - M.

Second line of input contains number of columns  - N.

Then M lines of input follows each containing N integers respectively.

Note : The Positive integers will range from [ 1, M * N ] both inclusive and negative integers can range from [-1 , -( M * N ) ] both inclusive.


Constraints
1 <= M <= 1000 

1 <= N <= 1000


Output Format
Print the minimum units of time taken by Ritik to reach Kriti.
*/