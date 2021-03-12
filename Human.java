package ru.geekbrains.Lesson1.Participants;

public class Human implements Participants, Running, Jumping {

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

    public Human(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public void running() {
        System.out.println("Человек пробежал");
    }

    @Override
    public void jumping() {
        System.out.println("Человек прыгнул");
    }
    @Override
    public String toString() {
        return "Человек " + name;}
}
