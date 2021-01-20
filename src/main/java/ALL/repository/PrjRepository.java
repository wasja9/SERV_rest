package ALL.repository;


import ALL.models.Projects;
import ALL.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by asu on 07.08.2020.
 */
public interface PrjRepository extends JpaRepository<Projects,Integer> {
   // Optional<User> findOneByLogin(String login);
}
