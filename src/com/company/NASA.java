package com.company;

import java.util.Scanner;

public class NASA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Direction directions=new Direction();
        System.out.println("Enter the Limited Axis :");
        String[] userConstrains = scanner.nextLine().split(" ");
        int xAxis = Integer.parseInt(userConstrains[0]);
        int yAxis = Integer.parseInt(userConstrains[1]);
        System.out.println("Enter the rover position and direction");
        String[] userInput = scanner.nextLine().split(" ");
        int xPosition = Integer.parseInt(userInput[0]);
        int yPosition = Integer.parseInt(userInput[1]);
        String direction=userConstrains[2];
        Rover rover=new Rover(xPosition,yPosition,direction);
        System.out.println("Enter the your instruction");
        String input=scanner.nextLine();
        char[] charArray=input.toCharArray();
        for (char character:charArray) {
            if(character=='L' ||character=='l')
            {
               String currentDirection= directions.leftRotation(input);
                rover.setDirections(currentDirection);
            }
            else if(character=='R' ||character=='r')
            {
                String currentDirection= directions.rightRotation(input);
                rover.setDirections(currentDirection);
            }
            else if(character=='m'||character=='M')
            {
                rover.moveForward(xAxis,yAxis);
            }
        }
        rover.display();
    }
}
