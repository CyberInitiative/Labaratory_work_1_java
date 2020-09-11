package com.company;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Train {
    private String destination_station;
    private int train_number;
    private LocalTime time_of_departure;
    private LocalTime time_of_arrival;
    private BigDecimal cost_of_travel;

    public void setDestination_station(String destination_station) {
        if (destination_station.equals("")) {
            this.destination_station = "Hell";
        } else {
            this.destination_station = destination_station;
        }
    }

    public String getDestination_station() {
        return destination_station;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number >= 0 && train_number < 999 ? train_number : -666;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTime_of_departure(int d_hour, int d_minute) {
        this.time_of_departure = LocalTime.of(d_hour, d_minute);
    }

    public LocalTime getTime_of_departure() {
        return time_of_departure;
    }

    public void setTime_of_arrival(int a_hour, int a_minute) {
        this.time_of_arrival = LocalTime.of(a_hour, a_minute);
    }

    public LocalTime getTime_of_arrival() {
        return time_of_arrival;
    }

    public void setCost_of_travel(BigDecimal cost_of_travel) {
        if (cost_of_travel.compareTo(BigDecimal.ZERO) < 0) {
            cost_of_travel.equals(666);
        } else {
            this.cost_of_travel = cost_of_travel;
        }
    }

    public BigDecimal getCost_of_travel() {
        return cost_of_travel;
    }

    public Train(String destination_station, int train_number, BigDecimal cost_of_travel, int d_hour, int d_minute, int a_hour, int a_minute) {
        this.setDestination_station(destination_station);
        this.setTrain_number(train_number);
        this.setTime_of_departure(d_hour, d_minute);
        this.setTime_of_arrival(a_hour, a_minute);
        this.setCost_of_travel(cost_of_travel);
    }

    @Override
    public String toString(){
        return ("Station of destination: " + destination_station + "; Train number: " + train_number +
                "; Time of departure: " + time_of_departure + "; Time of arrival: " + time_of_arrival +
                "; Cost of travel: " + cost_of_travel + ".\n");
    }
}