package ALL.repository;


import ALL.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by asu on 07.08.2020.
 */
public interface PrjRepository extends JpaRepository<Projects,Long> {
    //List<Projects> findAllByFirstName(String firstName);
    //Optional<Projects> findOneByPrName(String PrName);
   // User findOne(Long userId);
}
