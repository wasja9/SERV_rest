package ALL.services;

import ALL.forms.BrenchForm;
import ALL.forms.MessForm;
import ALL.models.Bren;
import ALL.models.Mess;

import java.util.List;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface MessService {

    List<Mess> findAll();

    void signUp(MessForm messForm, String token);

    List<Mess> findAllById(int id);

    List<Mess> findAllByIdbr(int idbr);

   // Mess findByIdMax();

}
