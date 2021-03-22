package ALL.services;


import ALL.forms.BrenchForm;
import ALL.forms.MessForm;
import ALL.models.Bren;
import ALL.models.Mess;
import ALL.repository.BrenchRepository;
import ALL.repository.MessRepository;
import ALL.repository.TokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessServiceImpl implements MessService{
    String TM;

    @Autowired
    private MessRepository messRepository;

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<Mess> findAll() {
        return messRepository.findAll();
    }

    @Override
    public void signUp(MessForm messForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        System.out.println("MESSAGE: "+messForm.getMessege());
        Mess ms = new Mess(
                messRepository.findByIdMax()+1,//Формируем ервый ID для

                messForm.getMessege(),

                tokensRepository.findOneByValue(token).get().getUser().getId(),
                messForm.getIdpr(),
                messForm.getIdbr()
                );
        messRepository.save(ms);
    }

    @Override
    public List<Mess> findAllById(int id) {
       // System.out.println("input all IdRoot:");
        return messRepository.findAllById(id);
        //return prj_Repository.findAllByIdRoot(1);
    }

    @Override
    public List<Mess> findAllByIdbr(int idbr) {
        return messRepository.findAllByIdbr(idbr);
    }

   // @Override
   // public Mess findByIdMax() {
        //return messRepository.findByIdMax();
    //    System.out.println(messRepository.findByIdMax());
   //     return null;
  //  }


}