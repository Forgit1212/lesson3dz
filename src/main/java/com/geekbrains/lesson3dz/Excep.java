package com.geekbrains.lesson3dz;

import java.lang.reflect.Array;

public class Excep {


    public static void main(String[] args) {

        String [][] arr2 = {{"1", "2", "3", "d"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        int sum;

        sum = arra(arr2);
        System.out.println("sum = "+sum);
    }

    public static int arra(String[][] arr3){
        String [][] arr1 = new String[4][4];
        int [][] summ = new int[4][4];
        int sm=0;
        int i=arr3.length;;
        int j=arr3[0].length;
        int sazerow = arr1.length;
        int sazecol = arr1[0].length;
        if (i==sazerow && j==sazecol){
            System.out.println("Массив имеет правильный размер ["+sazerow+", "+sazecol+"]");
        }else{
            try {
                throw new MyArraySizeException(i, j, arr3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int a=0; a<arr3.length; a++){
            for (int b=0; b<arr3[a].length; b++){
                try {
                    //System.out.println(a +" "+ b);
                    if (Integer.valueOf(arr3[a][b]) instanceof Integer) {
                        summ[a][b] = Integer.valueOf(arr3[a][b]);
                        sm = sm + summ[a][b];
                    }
                }catch (NumberFormatException | MyArrayDataException e){
                    summ[a][b] = 0;
                    sm = sm + summ[a][b];
                }
            }
        }
        return sm;
    }
}

