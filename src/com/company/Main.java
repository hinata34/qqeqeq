package com.company;

import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        int k = scan.nextInt();
        String s = scan.nextLine();
        System.out.println(s);
        StringBuilder s1 = new StringBuilder(s);
        for(int i = 0,j = 0;i < s.length();++i){
            if(s.charAt(i)>= 'a'&& s.charAt(i) <= 'z'){
                ++j;
                if(j == k){
                    s1.setCharAt(i, c);
                }
            }else{
                j = 0;
            }
        }
        System.out.print(s1);

    }

}
