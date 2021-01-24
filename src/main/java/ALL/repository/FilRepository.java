package ALL.repository;

import ALL.models.Files;
import ALL.models.Mess;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by wasja on 24.01.2021.
 */

    public interface FilRepository extends JpaRepository<Files,Integer> {
        // Optional<User> findOneByLogin(String login);
    }

