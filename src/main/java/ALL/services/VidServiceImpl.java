package ALL.services;


import ALL.forms.VidForm;
import ALL.models.Files;

import ALL.models.Video;
import ALL.repository.FilRepository;

import ALL.repository.TokensRepository;
import ALL.repository.VidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VidServiceImpl implements VidService{

    @Autowired
    private VidRepository vidRepository;

    @Autowired
    private TokensRepository tokensRepository;

    @Override
    public List<Video> findAll() {
        return vidRepository.findAll();
    }


    @Override
    public void signUp(VidForm vidForm, String token) {
        //Optional<Token> token33 = tokensRepository.findOneByValue(token);
        //System.out.println(token33.get().getValue());
        Video vd = new Video(
                //44,
                vidRepository.findByIdMax()+1,//Формируем ервый ID для
                // vidForm.getMessege(),
                vidForm.getPath(),
                vidForm.getVideo(),

                tokensRepository.findOneByValue(token).get().getUser().getId(),
                vidForm.getIdpr(),
                vidForm.getIdbr()
        );
        vidRepository.save(vd);
    }


}