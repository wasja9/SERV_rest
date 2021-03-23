package ALL.controllers;

import ALL.forms.FilForm;
import ALL.forms.MessForm;
import ALL.services.FilService;
import ALL.services.MessService;
import ALL.transfer.FilDto;
import ALL.transfer.MessDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static ALL.transfer.FilDto.from;


@RestController
public class FilController {

    /*  */
    @Autowired
    private FilService filService;

    @GetMapping("/fl")
    public List<FilDto> getMs() {
        return from(filService.findAll());
    }

   // @GetMapping("/prj")
    //public List<PrjDto> getPrj() {
    //    return from(prjService.findAll());
    //}

    @PostMapping("/fl")
    public ResponseEntity<Object> addFl(@RequestBody FilForm filForm,
                                        @RequestParam String token,
                                        @RequestParam("file") MultipartFile file
                                        ) { //получаем токен
        filService.signUp(filForm,token);
        return ResponseEntity.ok().build();
    }


}