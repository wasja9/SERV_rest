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

    List<prj> findAllByName(String name);

    List<prj> findAllByIdRoot(int idRoot);

    List<prj> findAllById(int id);

    List<prj> findAllByIdNode(int idNode);

    //Projects findOne(Long prjId);
}
