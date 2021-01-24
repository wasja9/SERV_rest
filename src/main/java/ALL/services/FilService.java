package ALL.services;

import ALL.models.Files;
import ALL.models.Mess;

import java.util.List;
import ALL.forms.FilForm;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface FilService {

    List<Files> findAll();

    void signUp(FilForm filForm, String token);

    //Projects findOne(Long prjId);
}
