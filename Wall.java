package ru.geekbrains.Lesson1.Obstacles;

public class Wall implements Obstaclable {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return (maxHeight <= height);
    }

    public String toString() {
        return "перепрыгнул стену высотой " + height + " метров";}
}
