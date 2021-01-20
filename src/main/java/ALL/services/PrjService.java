package ALL.services;


import ALL.forms.LoginForm;
import ALL.forms.UserForm;
import ALL.forms.ProjForm;
import ALL.models.Projects;

import java.util.List;

/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface PrjService {

    List<Projects> findAll();

    void signUp(ProjForm prjForm, LoginForm loginForm);

   // void signUp(ProjForm projForm);

    //Projects findOne(Long prjId);
}
