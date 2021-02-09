package ALL.services;


import ALL.forms.BrenchForm;
import ALL.models.Bren;
import ALL.repository.BrenchRepository;
import ALL.repository.TokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrenchServiceImpl implements BrenchService{

    @Autowired
    private BrenchRepository brenchRepository;

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<Bren> findAll() {
        return brenchRepository.findAll();
    }

    @Override
    public void signUp(BrenchForm brenchForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //System.out.println(token33.get().getValue());
        Bren brn = new Bren(
                brenchForm.getName(),
                brenchForm.getPeck(),
                brenchForm.getLevel(),
                //projForm.getName(),
                //projForm.getPart(),
               111,//id_prj
                tokensRepository.findOneByValue(token).get().getUser().getId()//id_us
        );
        brenchRepository.save(brn);
    }

 //   @Override
   // public void signUp(BrenchForm brenchForm) {
       // String hashPassword = passwordEncoder.encode(userForm.getPassword());
    //        Brench brn = new Brench(
                    //"maibah",
                    //"mashina"
    //                brenchForm.getName(),
    //               brenchForm.getPeck()
    //        );
    //    brenchRepository.save(brn);
   // }

/*
    @Override
    public Projects findOne(Long prjId) {
        System.out.println("OutPUT user="+prjId);
        return prjRepository.findOne(Math.toIntExact(prjId));
    }
 */

}