package ru.mityugov.avogoodsaccounting.ups.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mityugov.avogoodsaccounting.ups.repository.entity.UpsEntity;

public interface UpsRepository extends CrudRepository<UpsEntity, Long> {

}
