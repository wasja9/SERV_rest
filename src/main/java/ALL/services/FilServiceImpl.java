package ALL.services;


import ALL.forms.FilForm;
import ALL.models.Files;
import ALL.models.Mess;
import ALL.repository.FilRepository;
import ALL.repository.MessRepository;
import ALL.repository.TokensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilServiceImpl implements FilService{

    @Autowired
    private FilRepository filRepository;

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<Files> findAll() {
        return filRepository.findAll();
    }

    @Override
    public void signUp(FilForm filForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //System.out.println(token33.get().getValue());
        Files vd = new Files(
                filRepository.findByIdMax()+1,//Формируем ервый ID для
                //44,
                // vidForm.getMessege(),
                filForm.getPath(),
                filForm.getFile(),

                tokensRepository.findOneByValue(token).get().getUser().getId(),
                filForm.getIdpr(),
                filForm.getIdbr()
        );
        filRepository.save(vd);
    }


}