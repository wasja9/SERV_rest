package ALL.services;

import ALL.forms.BrenchForm;
import ALL.models.Bren;
import java.util.List;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface BrenchService {

    List<Bren> findAll();

    void signUp(BrenchForm brenchForm, String token);

    //Projects findOne(Long prjId);
}
