package ru.seabatle.clone;

import java.util.Scanner;

/**
 * Created by Дом on 22.05.2016.
 */
public class Player {
    final int RANGE = 10;

    String getShoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Куда стрелять:");
        System.out.print(" строка: ");
        //TODO условие на ввод только цифры
        String line = scanner.nextLine();
        System.out.print("\nстолбец: ");
        String count = scanner.nextLine();
        System.out.printf("Вы ввелии строчку: %s, столбец: %s", line, count);
        line = "" + (Integer.parseInt(String.valueOf(line)) - 1);
        count = "" + (Integer.parseInt(String.valueOf(count)) - 1);
        String shoot = line + count;
        return shoot;
    }
}



