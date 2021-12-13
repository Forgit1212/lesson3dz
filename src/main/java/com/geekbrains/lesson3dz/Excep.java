package com.geekbrains.lesson3dz;

public class Excep {

    public static void main(String[] args) {
        String [][] arr = {{"один", "два", "три", "четыре"},
                {"пять", "шесть", "семь", "восемь"},
                {"девять", "десять", "одиннадцать", "двенадцать"},
                {"тринадцать", "четырнадцать", "пятнадцать", "двадцать"}};
        String a = arr[0][5];
    }
}

class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    
}

