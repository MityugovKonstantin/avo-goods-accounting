package ru.mityugov.avogoodsaccounting.ups.models;

import lombok.Data;

@Data
public class Ups {

    String name;

    String manufacture;

    String person;

    String location;

    String operationStatus;

    Long amortizationPeriod;

    int power;

    int maxRunTime;

    @Override
    public String toString() {
        return "Ups{" +
                "name='" + name + '\'' +
                ", person='" + person + '\'' +
                ", location='" + location + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", amortizationPeriod=" + amortizationPeriod +
                ", power=" + power +
                ", maxRunTime=" + maxRunTime +
                '}';
    }
}
