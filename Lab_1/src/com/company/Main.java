package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Train> trains = new ArrayList<Train>();
        ArrayList<Train> result = new ArrayList<Train>();
        trains.add(new Train("Kiev", 153, new BigDecimal(100), 12, 43, 12, 34));
        trains.add(new Train("Kiev", 123, new BigDecimal(100), 21, 23, 1, 35));
        trains.add(new Train("Odessa", 111, new BigDecimal(100), 21, 23, 3, 32));
        System.out.println("The list of trains:\n");
        for (Train i : trains) {
            System.out.println(i);
        }

        System.out.println("Enter the direction;");
        String request = input.next();

        for (Train train : trains) {
            if (train.getDestination_station().equals(request)) {
                result.add(train);
            }
        }
        if (result.isEmpty())
            System.out.println("There are no records in the database for this request");
        else
            System.out.println(result);
        System.out.println("Enter your desired route to get the arrival times of all its trains;");
        request = input.next();
        for (Train train : trains) {
            if (train.getDestination_station().equals(request)) {
                result.add(train);
                System.out.println(train.getTime_of_arrival());
            }
        }
        try {
            result.clear();
            System.out.println("Enter the train number to get the departure time;");
            int request_number = input.nextInt();
            for (Train train : trains) {
                if (train.getTrain_number() == request_number) {
                    result.add(train);
                    System.out.println(train.getTime_of_departure());
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Number is set incorrectly");
        }
    }
}
