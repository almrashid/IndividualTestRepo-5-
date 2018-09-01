package LoopExample;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] temp=new int[4];
            sc.nextInt();

        for ( int i=0; i <= 2; i++) {
            System.out.println(sc.nextInt());

            int j=sc.nextInt();
            for (j=0;j<2;j++){
                System.out.println();
            }

        }
    }
}
