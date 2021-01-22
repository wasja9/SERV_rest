package ALL.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ALL.models.Token;

import java.util.Optional;

/**
 * 25.04.2018
 * TokensRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface TokensRepository extends JpaRepository<Token, Long> {
     Optional<Token> findOneByValue(String value);
   // static int findOneByUser_id(String value);


}