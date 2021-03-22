package ALL.repository;

import ALL.models.Mess;
import ALL.models.Projects;
import ALL.models.prj;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Created by wasja on 24.01.2021.
 */

    public interface MessRepository extends JpaRepository<Mess,Integer> {
    //String TM;
    // Optional<User> findOneByLogin(String login);
        List<Mess> findAllById(Integer id);
        List<Mess> findAllByIdbr(Integer idbr);

        //@Query(value = "SELECT id FROM ( (SELECT mess.id FROM `mess`) UNION (SELECT files.id FROM `files`) UNION (SELECT video.id FROM `video`) ) AS M ORDER BY id DESC LIMIT 1", nativeQuery = true)
        @Query(value = "SELECT id FROM ( (SELECT mess.id FROM `mess`) UNION (SELECT files.id FROM `files`) UNION (SELECT video.id FROM `video`) ) AS M ORDER BY id DESC LIMIT 1", nativeQuery = true)
        int findByIdMax();

    }

