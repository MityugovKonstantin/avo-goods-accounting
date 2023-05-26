package ru.mityugov.avogoodsaccounting.person.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.mityugov.avogoodsaccounting.person.repository.entity.PersonEntity;

import java.util.List;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

    @Query(
            value = "select new PersonEntity (p.id, p.firstName, p.secondName, p.patronymic, p.jobTitle)" +
                    "from PersonEntity p"
    )
    List<PersonEntity> get();
}
