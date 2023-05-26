package ru.mityugov.avogoodsaccounting.ups.service;

import ru.mityugov.avogoodsaccounting.ups.models.Ups;

public interface UpsService {

    void create(Ups ups);

    Ups[] get();
}
