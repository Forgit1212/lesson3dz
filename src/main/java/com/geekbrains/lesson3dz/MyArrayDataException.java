package com.geekbrains.lesson3dz;

public class MyArrayDataException extends RuntimeException{
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    private int row;
    private int column;
    private Object value;

    public MyArrayDataException() {
    }

    public MyArrayDataException(int row, int column, Object[][] array) {
        super("Неверные данные в элементе массива ["+row+", "+column+"] = "+array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }

}
