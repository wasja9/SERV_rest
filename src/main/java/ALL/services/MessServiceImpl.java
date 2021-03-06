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
                messForm.getMessege(),

                tokensRepository.findOneByValue(token).get().getUser().getId(),
                111,
                111
                );
        messRepository.save(ms);
    }

    @Override
    public List<Mess> findAllById(int id) {
       // System.out.println("input all IdRoot:");
        return messRepository.findAllById(id);
        //return prj_Repository.findAllByIdRoot(1);
    }



}