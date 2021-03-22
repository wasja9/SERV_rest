package ALL.repository;

import ALL.models.Mess;
import ALL.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

/**
 * Created by wasja on 24.01.2021.
 */

    public interface VidRepository extends JpaRepository<Video,Integer> {
        // Optional<User> findOneByLogin(String login);

    //@Query(value = "SELECT id FROM ( (SELECT mess.id FROM `mess`) UNION (SELECT files.id FROM `files`) UNION (SELECT video.id FROM `video`) ) AS M ORDER BY id DESC LIMIT 1", nativeQuery = true)
    @Query(value = "SELECT id FROM ( (SELECT mess.id FROM `mess`) UNION (SELECT files.id FROM `files`) UNION (SELECT video.id FROM `video`) ) AS M ORDER BY id DESC LIMIT 1", nativeQuery = true)
    int findByIdMax();
    }

