package com.company;

public class Rover {
    int xCoordinates;
    int yCoordinates;
    String direction;

    Rover(int xCoordinates, int yCoordinates, String direction) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.direction = direction;
    }

    void setDirections(String direction) {
        this.direction = direction;
    }

    public void moveForward(int xMax, int yMax) {
        switch (direction) {
            case "north":
                yCoordinates = yCoordinates + 1;
                if (yCoordinates > yMax) {
                    System.out.println("limit exceeded");
                }
                break;
            case "south":
                yCoordinates = yCoordinates - 1;
                if (yCoordinates < 0) {
                    System.out.println("Under limit exceeded");
                }
                break;
            case "east":
                xCoordinates = xCoordinates + 1;
                if (xCoordinates > xMax) {
                    System.out.println("limit exceeded");
                }
                break;
            case "west":
                xCoordinates = xCoordinates - 1;
                if (xCoordinates < 0) {
                    System.out.println("Under limit exceeded");
                }
                break;
        }

    }
    void display() {
        System.out.println("xPosition :" + xCoordinates + "\n" + "yPosition : " + yCoordinates + "\n" + "direction : " + direction);
    }

}
