package com.geekbrains.lesson3dz;

public class MyArraySizeException extends RuntimeException{
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public MyArraySizeException (int row, int column, String [][] array){
        super("Неправильный размер массива ["+array.length+", "+array[0].length+"]");
        this.row = row;
        this.column = column;
    }
}
