package ALL.services;


import ALL.models.Video;

import java.util.List;
import ALL.forms.VidForm;
/**
 * 25.04.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

public interface VidService {

    List<Video> findAll();

    void signUp(VidForm vidForm, String token);

    //Projects findOne(Long prjId);
}
