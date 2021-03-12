package ru.geekbrains.Lesson1.Participants;

public class Cat implements Participants, Running, Jumping{

    private int maxHeight;
    private int maxLength;
    private String name;

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    public Cat(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public void running() {
        System.out.println("Кот пробежал");
    }

    @Override
    public void jumping() {
        System.out.println("Кот прыгнул");

    }
    @Override
    public String toString() {
        return "Кот " + name;}
}
