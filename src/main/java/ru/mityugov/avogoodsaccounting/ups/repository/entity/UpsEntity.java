package ru.mityugov.avogoodsaccounting.ups.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "ups")
public class UpsEntity {

    @Id
    int id;

    String name;

    int personId;

    int locationId;

    Date startDate;

    String exploitationStatus;

    String technicalCondition;

    Date amortizationPeriod;

    Date registrationDate;

    Date writeOffDate;

    int power;

    int maxRunTime;

}
