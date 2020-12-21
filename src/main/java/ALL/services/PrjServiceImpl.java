package ALL.services;


import ALL.forms.ProjForm;
import ALL.models.Projects;
//import ALL.models.role;
//import ALL.models.state;
import ALL.repository.PrjRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrjServiceImpl implements PrjService {

    @Autowired
    private PrjRepository prjRepository;

    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public List<Projects> findAll() {
        return prjRepository.findAll();
    }


    @Override
    public void signUp(ProjForm projForm) {
       // String hashPassword = passwordEncoder.encode(userForm.getPassword());
            Projects prj = new Projects(
                    //"maibah",
                    //"mashina"
                    projForm.getPrName(),
                    projForm.getPrPart()
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