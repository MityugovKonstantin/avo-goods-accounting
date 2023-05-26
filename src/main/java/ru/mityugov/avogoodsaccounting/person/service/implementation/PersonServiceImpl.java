package ru.mityugov.avogoodsaccounting.person.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mityugov.avogoodsaccounting.person.models.Person;
import ru.mityugov.avogoodsaccounting.person.repository.PersonRepository;
import ru.mityugov.avogoodsaccounting.person.repository.entity.PersonEntity;
import ru.mityugov.avogoodsaccounting.person.service.PersonService;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;

    @Override
    public List<Person> get() {
        List<Person> persons = new ArrayList<>();
        List<PersonEntity> personEntities = personRepository.get();
        for (PersonEntity p : personEntities) {
            persons.add(
                    Person.builder()
                            .firstName(p.getFirstName())
                            .secondName(p.getSecondName())
                            .patronymic(p.getPatronymic())
                            .jobTitle(p.getJobTitle())
                            .build()
            );
        }
        return persons;
    }
}
