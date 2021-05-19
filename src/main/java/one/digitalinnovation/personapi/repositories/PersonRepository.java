package one.digitalinnovation.personapi.repositories;

import one.digitalinnovation.personapi.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
