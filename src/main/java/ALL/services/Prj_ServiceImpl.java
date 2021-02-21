package ALL.services;

import ALL.forms.PrjForm;
import ALL.models.prj;
import ALL.repository.Prj_Repository;
import ALL.repository.TokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import ALL.models.role;
//import ALL.models.state;
//import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class Prj_ServiceImpl implements Prj_Service {

    @Autowired
    private Prj_Repository prj_Repository;

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<prj> findAll() {
        System.out.println("input all:");
        return prj_Repository.findAll();
        //return prj_Repository.
    }


    @Override
    public void signUp(PrjForm prjForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //System.out.println(token33.get().getValue());
        prj pr = new prj(
                    prjForm.getName(),
                    prjForm.getStr(),
                    prjForm.getNode(),
                    prjForm.getRow(),
                    prjForm.getIdRoot(),
                    tokensRepository.findOneByValue(token).get().getUser().getId()
            );
        prj_Repository.save(pr);
    }

    @Override
    public List<prj> findAllByIdRoot(int idRoot) {
        System.out.println("input all IdRoot:");
        return prj_Repository.findAllByIdRoot(idRoot);
        //return prj_Repository.findAllByIdRoot(1);
    }

   // List<prj> findAllId_root(int id_root);



}
