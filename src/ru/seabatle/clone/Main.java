package ru.seabatle.clone;

import java.util.Random;

/**
 * Created by Дом on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Field field = new Field();
        Player player = new Player();
        //корабли
        Ship ship = new Ship(random.nextInt(10), random.nextInt(10));//TODO и тут
        field.init();
        field.setShip(ship);
        System.out.println("Game Start!");
        do {
            field.show();
            String  shoot= player.getShoot();
            field.doShoot(shoot);
        } while (field.isNotGameOver());
    }
}
