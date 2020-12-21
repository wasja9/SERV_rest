package ALL.repository;


import ALL.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by asu on 07.08.2020.
 */
public interface PrjRepository extends JpaRepository<Projects,Integer> {
    List<Projects> findAllByFirstName(String firstName);

    Optional<Projects> findOneByLogin(String login);


   // User findOne(Long userId);
}
