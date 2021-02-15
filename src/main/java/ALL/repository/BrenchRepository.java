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

    // Optional<Bren> findOneByLogin(String login);
    //@Query(value = "SELECT * FROM bren WHERE level=1", nativeQuery = true)
   // List<Bren> findAllUserByBrenId(int level);

// Optional<User> findOneByLogin(String login);
    //@Query("SELECT c.fullname_client FROM Click c WHERE c.id_bannners = :idbanners AND c.fullname_client = :fullnameClient")
    //String sent(@Param("fullname_client") String fullnameClient, @Param("id_banner") long idbanners);

    //@Query("SELECT b FROM Bten b WHERE b.level:=level");
    //(@Param("fullname_client") String fullnameClient, @Param("id_banner") long idbanners);
    //List<Bren> findAllBrenLevel  (@Param("level") long level);

}



