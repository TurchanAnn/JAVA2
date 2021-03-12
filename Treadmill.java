package ru.geekbrains.Lesson1.Obstacles;

public class Treadmill implements Obstaclable {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength <= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    public String toString() {
        return "пробежал " + length + " метров";}
}
