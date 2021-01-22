package ALL.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ALL.forms.UserForm;
import ALL.models.role;
import ALL.models.state;
import ALL.models.User;
import ALL.repository.UsersRepository;

import  java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

/*        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(hashPassword)
                .login(userForm.getLogin())
                .role(role.USER)
                .state(state.ACTIVE)
                .build();*/
            User user = new User(
                    userForm.getLogin(),
                    hashPassword,
                    userForm.getFirstName(),
                    userForm.getLastName(),
                    role.USER, state.ACTIVE
            );

        usersRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public User findOne(Long userId) {
        System.out.println("OutPUT user="+userId);
        return usersRepository.findOne(Math.toIntExact(userId));
    }
}