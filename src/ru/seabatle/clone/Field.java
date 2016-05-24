package ru.seabatle.clone;

/**
 * Created by Дом on 22.05.2016.
 */
public class Field {
    final int SIZE = 10;
    char[][] cells = new char[SIZE][SIZE];
    char[] title = new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'К'};
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.positionLine][ship.positionColumn] = '#';
    }

    void doShoot(String shoot) {
        int line = Integer.parseInt(String.valueOf(shoot.charAt(0)));
        int count = Integer.parseInt(String.valueOf(shoot.charAt(1)));
        switch (cells[line][count]) {
            case '.':
                System.out.println("Промах");
                cells[line][count] = '*';
                break;
            case '#':
                System.out.println("Попадание!");
                cells[line][count] = 'X';
                System.out.println(cells[line][count]);
                show();
                break;
            case '*':
                System.out.println("Уже стреляли");
                break;
            default:
                System.out.println("ERROR");
        }
    }


    void show() {
        for (int i = 0; i < title.length; i++) System.out.print(title[i] + "\t");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(cells[i][j] + "\t");
                if (j == SIZE - 1) {
                    System.out.print(i + 1);
                }
            }
            System.out.println();
        }
    }

    boolean isNotGameOver() {
        return cells[ship.positionLine][ship.positionColumn] == '#';
    }
}

