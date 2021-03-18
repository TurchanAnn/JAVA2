package Lesson2;

public class MyArrayDataException extends RuntimeException{
    int i, j;

    public MyArrayDataException(int i, int j) {
        super(String.format("Неверные данные находятся в ячейке [%s, %s]\n", i, j));
        this.i = i;
        this.j = j;
    }
}
