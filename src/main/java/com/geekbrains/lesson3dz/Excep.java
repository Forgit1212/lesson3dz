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

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private int row;
    private int column;
    private Object[][] array = new Object[column][row];

    public MyArraySizeException (int row, int column, Object value){
        super ("Invalid massiv size. Length "+array.length);
        Object[][] array = new Object[column][row];
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }
    
}

