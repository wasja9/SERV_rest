package ALL.repository;

import ALL.models.Mess;
import ALL.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wasja on 24.01.2021.
 */

    public interface VidRepository extends JpaRepository<Video,Integer> {
        // Optional<User> findOneByLogin(String login);
    }

