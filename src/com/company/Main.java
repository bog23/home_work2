package com.company;

public class Main {

    public static void main(String[] args) {


        //Exercise 1
    int [] a = {1, 0, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                a[i] = 0;
                System.out.print(a[i] + " ");
            } else if (a[i] == 0){
                a[i] = 1;
                System.out.print(a[i] + " ");
            }
        }

        //Exercise 2
        int [] b = new int [8];
        for (int i = 0, j = 0; i < b.length; i++, j+=3) {
            b[i] += j;
            System.out.print(b[i]+" ");
            }



        //Exercise 3

        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
                System.out.print(c[i]+" ");
            } else {
                System.out.print(c[i]+" ");
            }

        }

        //Exercise 4

        int [][] d = new int [3][3];


        for (int i = 0, counter = 0; i < d.length; i++, counter ++) {

            for (int j = 0; j < d.length; j++) {
                if (j == counter){
                    d[i][j] = 1;
                    d[d.length-i-1][j]=1;
                    d[i][d.length-j-1] = 1;
                }

                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

}