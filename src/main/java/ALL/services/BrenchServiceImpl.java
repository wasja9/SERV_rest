package ALL.services;


import ALL.forms.BrenchForm;
import ALL.models.Bren;
import ALL.repository.BrenchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrenchServiceImpl implements BrenchService{

    @Autowired
    private BrenchRepository brenchRepository;

    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public List<Bren> findAll() {
        return brenchRepository.findAll();
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