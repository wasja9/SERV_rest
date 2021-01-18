package ALL.services;


import ALL.forms.LoginForm;
import ALL.forms.ProjForm;
import ALL.models.Projects;
//import ALL.models.role;
//import ALL.models.state;
import ALL.models.User;
import ALL.repository.PrjRepository;
import ALL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrjServiceImpl implements PrjService {

    @Autowired
    private PrjRepository prjRepository;

    @Autowired
    private UsersRepository usersRepository;

    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public List<Projects> findAll() {
        return prjRepository.findAll();
    }


    //@Override
    public void signUp(ProjForm projForm, LoginForm loginForm) {
       // String hashPassword = passwordEncoder.encode(userForm.getPassword());

        Optional<User> userCandidate = usersRepository.findOneByLogin(loginForm.getLogin());

        if (userCandidate.isPresent()) {//isPresent-Метод позволяет выполнить какое-то действие, если объект не пустой
            User user = userCandidate.get();
        }

        Projects prj = new Projects(
                    //"maibah",
                    //"mashina"
                    projForm.getName(),
                    projForm.getPart(),
                projForm.getId_us()
                //this.user
            );
        prjRepository.save(prj);
    }

/*
    @Override
    public Projects findOne(Long prjId) {
        System.out.println("OutPUT user="+prjId);
        return prjRepository.findOne(Math.toIntExact(prjId));
    }
 */

}