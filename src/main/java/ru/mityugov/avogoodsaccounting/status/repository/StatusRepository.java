package ru.mityugov.avogoodsaccounting.status.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.mityugov.avogoodsaccounting.status.repository.entity.StatusEntity;

import java.util.List;


public interface StatusRepository extends CrudRepository<StatusEntity, Long> {

    @Query (
            value = "select new StatusEntity (s.status) from StatusEntity s"
    )
    List<StatusEntity> get();
}
