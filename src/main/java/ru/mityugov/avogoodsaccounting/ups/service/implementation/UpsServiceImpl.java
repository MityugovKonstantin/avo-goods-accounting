package ru.mityugov.avogoodsaccounting.ups.service.implementation;

import org.springframework.stereotype.Service;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;
import ru.mityugov.avogoodsaccounting.ups.repository.entity.UpsEntity;
import ru.mityugov.avogoodsaccounting.ups.service.UpsService;

@Service
public class UpsServiceImpl implements UpsService {

    UpsEntity upsEntity;

    @Override
    public void create(Ups ups) {

    }

    @Override
    public Ups[] get() {

        return new Ups[0];
    }
}
