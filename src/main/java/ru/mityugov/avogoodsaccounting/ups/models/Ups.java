package ru.mityugov.avogoodsaccounting.ups.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Ups {

    String name;

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
