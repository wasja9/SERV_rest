package ALL.services;


import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ALL.forms.LoginForm;
import ALL.models.Token;
import ALL.models.User;
import ALL.repository.TokensRepository;
import ALL.repository.UsersRepository;
import ALL.transfer.TokenDto;

import java.util.Optional;

import static ALL.transfer.TokenDto.from;

/**
 * 25.04.2018
 * LoginServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TokensRepository tokensRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public TokenDto login(LoginForm loginForm) {
        Optional<User> userCandidate = usersRepository.findOneByLogin(loginForm.getLogin());

        if (userCandidate.isPresent()) {//isPresent-Метод позволяет выполнить какое-то действие, если объект не пустой
            User user = userCandidate.get();
//Метод matches() — в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению
            if (passwordEncoder.matches(loginForm.getPassword(), user.getHashPassword())) {
                Token token = new Token(RandomStringUtils.random(10, true, true),user);

                tokensRepository.save(token);
                return from(token);
            }
        } throw new IllegalArgumentException("User not found");
    }
}