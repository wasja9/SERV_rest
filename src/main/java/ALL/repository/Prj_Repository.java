package ALL.repository;

import ALL.models.Bren;
import ALL.models.prj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Prj_Repository extends JpaRepository<prj,Integer> {
   // Optional<User> findOneByLogin(String login);
   //@Query("select b from Bren b where b.name=:name")
   //List<Bren> findAllByName(@Param("name") String name);

   //List<prj> findAllbyId_root(Integer id_root);
}
