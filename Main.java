package ru.geekbrains.Lesson1;

import ru.geekbrains.Lesson1.Obstacles.Obstaclable;
import ru.geekbrains.Lesson1.Obstacles.Treadmill;
import ru.geekbrains.Lesson1.Obstacles.Wall;
import ru.geekbrains.Lesson1.Participants.Cat;
import ru.geekbrains.Lesson1.Participants.Human;
import ru.geekbrains.Lesson1.Participants.Participants;
import ru.geekbrains.Lesson1.Participants.Robot;

public class Main {

    public static void main(String[] args) {

        Participants[] participants = {
                new Cat(5, 1000, "Begemot"),
                new Cat(7, 1253, "Fred"),
                new Human(2, 500, "Marusya"),
                new Human(3, 850, "Petya"),
                new Robot(10, 5000, "Walle")};

        Obstaclable[] obstaclables = {
                new Treadmill(800),
                new Treadmill(500),
                new Wall(2),
                new Wall(5)};

        for (Participants member : participants
        ) {
            for (Obstaclable obstactable : obstaclables
            ) {
                if (obstactable.toJump(member.getMaxHeight()) || obstactable.toRun(member.getMaxLength())) {
                    System.out.printf("%s успешно проходит дистанцию. %s %n", member, obstactable);
                } else System.out.printf("%s провалил дистанцию и не %s %n", member, obstactable);

            }

        }


    }
}
