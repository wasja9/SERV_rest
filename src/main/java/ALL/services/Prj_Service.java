package ALL.services;


import ALL.forms.PrjForm;
import ALL.models.prj;

import java.util.List;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface Prj_Service {

    List<prj> findAll();

   // void signUp(ProjForm prjForm, LoginForm loginForm);

    void signUp(PrjForm prjForm, String token);

    List<prj> findAllByIdRoot(int idRoot);

    //Projects findOne(Long prjId);
}
