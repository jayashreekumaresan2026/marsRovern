package com.company;

public class Direction {
    String[] directions = {"North", "south", "east", "west"};

    String leftRotation(String roverDirection) {
        String currentDirection = "";
        for (int i = 0; i < directions.length; i++) {
            if (roverDirection.equalsIgnoreCase(directions[i])) {
                int index = i - 1;
                if (index < 0) {
                    currentDirection = directions[3];
                } else {
                    currentDirection = directions[index];
                }
            }
        }
        return currentDirection;
    }

    String rightRotation(String roverDirection) {
        String currentDirection = "";
        for (int i = 0; i < directions.length; i++) {
            if (roverDirection.equalsIgnoreCase(directions[i])) {
                int index = i - 1;
                if (index < 0) {
                    currentDirection = directions[3];
                } else {
                    currentDirection = directions[index];
                }
            }
        }
        return currentDirection;
    }
}
