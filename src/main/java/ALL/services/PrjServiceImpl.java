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
    private TokensRepository tokensRepository;

    @Override
    public List<Projects> findAll() {
        return prjRepository.findAll();
    }

    @Override
    public void signUp(ProjForm projForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //System.out.println(token33.get().getValue());
        Projects prj = new Projects(
                    projForm.getName(),
                   // projForm.getPart(),
                    tokensRepository.findOneByValue(token).get().getUser().getId()
            );
        prjRepository.save(prj);
    }



}