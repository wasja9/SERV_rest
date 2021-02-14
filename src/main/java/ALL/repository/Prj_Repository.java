package ALL.repository;

import ALL.models.prj;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Prj_Repository extends JpaRepository<prj,Integer> {
   // Optional<User> findOneByLogin(String login);
}
