package ALL.services;


import ALL.forms.LoginForm;
import ALL.forms.ProjForm;
import ALL.forms.UserForm;
import ALL.models.Projects;
//import ALL.models.role;
//import ALL.models.state;
import ALL.models.Token;
import ALL.models.User;
import ALL.repository.PrjRepository;
import ALL.repository.TokensRepository;
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

    @Autowired
    private TokensRepository tokensRepository;

    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public List<Projects> findAll() {
        return prjRepository.findAll();
    }

    //@Override
   // public void signUp(ProjForm prjForm, UserForm userForm) {

   // }


    @Override
    public void signUp(ProjForm projForm, String token) {
        //public void signUp(ProjForm projForm, LoginForm loginForm) {
       // String hashPassword = passwordEncoder.encode(userForm.getPassword());

       // Optional<User> userCandidate = usersRepository.findOneByLogin(loginForm.getLogin());

        //User user = null;
        //if (userCandidate.isPresent()) {//isPresent-Метод позволяет выполнить какое-то действие, если объект не пустой
        //    user = userCandidate.get();
        //}
        //Token token33 = TokensRepository.findOneByValue(token);
        System.out.println(token);
        Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //token33.
        System.out.println(token33.get().getValue());
        System.out.println(token33.get().getId());
       // System.out.println(token33.get().getUser());


        //System.out.println(token33);

      //  System.out.println(TokensRepository.findOneByUser_id(token));
       // TokensRepository.findOne((token));

       // user.setId(10);
        Projects prj = new Projects(
                    //"maibah",
                    //"mashina"
                    projForm.getName(),
                    projForm.getPart(),
                10
                //user
            //    user.getId()
               // projForm.getId_us()
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