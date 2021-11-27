package springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);
}
