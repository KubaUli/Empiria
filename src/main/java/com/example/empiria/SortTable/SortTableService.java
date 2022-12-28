package com.example.empiria.SortTable;

import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonDtoMapper;
import com.example.empiria.Person.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortTableService {
     int sortingParametr;

    private final PersonRepository personRepository;
    private final PersonDtoMapper personDtoMapper;

    public SortTableService(PersonRepository personRepository, PersonDtoMapper personDtoMapper) {
        this.personRepository = personRepository;
        this.personDtoMapper = personDtoMapper;
    }


    public List<Person> sortClientList() {
        if (sortingParametr == 1 || sortingParametr == 2 || sortingParametr == 3) {


            switch (sortingParametr) {
                case 1:
                    return (List<Person>) personRepository.findAll();
                case 2:
                    List<Person> personListSortByName = (List<Person>) personRepository.findAll();
                    return personListSortByName.stream()
                            .sorted(Comparator.comparing(Person::getName))
                            .collect(Collectors.toList());
                case 3:
                    List<Person> personListSortByLastName = (List<Person>) personRepository.findAll();
                    return personListSortByLastName.stream()
                            .sorted(Comparator.comparing(Person::getLastName))
                            .collect(Collectors.toList());

            }
        }
            return (List<Person>) personRepository.findAll();
        }

    public int getSortingParametr() {
        return sortingParametr;
    }

    public void setSortingParametr(int sortingParametr) {
        this.sortingParametr = sortingParametr;
    }
}