package ru.mityugov.avogoodsaccounting.person.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Person {

    String firstName;

    String secondName;

    String patronymic;

    String jobTitle;

    public String getFullName() {
        return secondName + firstName + patronymic;
    }
}
