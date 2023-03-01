package ua.ithillel.lms.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.ithillel.lms.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findFirstByName(String name);
}
