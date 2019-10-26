package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0, maxX = 0, maxY = 0;
        int number = 0;
        int n = scan.nextInt(), m = scan.nextInt();
        int[][] a = new int[n][m];
        while (maxX < m || maxY < n) {
            x = maxX;
            y = maxY;
            do {
                a[y][x] = number;
                number++;

                x++;
                y++;
            } while ( x < m && y < n);
            if (maxX == m - 1) {
                maxY++;

            } else {
                maxX++;
            }
        }
        for(int i = 0;i < n; ++i){
            for(int j = 0;j < m; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}