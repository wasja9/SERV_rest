package ALL.repository;


import ALL.models.Bren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


/**
 * Created by asu on 07.08.2020.
 */
public interface BrenchRepository extends JpaRepository<Bren,Integer> {
    @Query("select b from Bren b where b.name=:name")
    List<Bren> findAllByName(@Param("name") String name);



}



