package ALL.repository;

import ALL.models.Bren;
import ALL.models.prj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface Prj_Repository extends JpaRepository<prj,Integer> {

    List<prj> findAllByName(String name);
    //List<prj> findAllById(Integer id);//str
    //List<prj> findAllByStr(Integer str);
    //List<prj> findAllByIdUs(Integer idUs);//id_us
    List<prj> findAllByIdRoot(Integer idRoot);//id_us


   //@Query("select b from Bren b where b.name=:name")
   //List<Bren> findAllByName(@Param("name") String name);


}
