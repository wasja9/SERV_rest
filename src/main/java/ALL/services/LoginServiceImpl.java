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

        if (userCandidate.isPresent()) {
            User user = userCandidate.get();

            if (passwordEncoder.matches(loginForm.getPassword(), user.getHashPassword())) {
                Token token = new Token(RandomStringUtils.random(10, true, true),user);

                // Token token = Token.builder()
               //         .user(user)
               //         .value(RandomStringUtils.random(10, true, true))
                //        .build();

                tokensRepository.save(token);
                return from(token);
            }
        } throw new IllegalArgumentException("User not found");
    }
}