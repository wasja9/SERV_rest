package ALL.repository;

import ALL.models.Mess;
import ALL.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wasja on 24.01.2021.
 */

    public interface MessRepository extends JpaRepository<Mess,Integer> {
        // Optional<User> findOneByLogin(String login);
    }
