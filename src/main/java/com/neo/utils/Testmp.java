package com.neo.utils;

/**
 * Created by Administrator on 2018/3/2.
 */
public class Testmp {
    public static void mp(int a[]) {
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] > a[i]) {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {3,5,4,21,8,9,7,6};
        mp(a);
        for (int i = 0 ;i < a.length ; i++){
            System.out.println(a[i]);
        }

    }
}
