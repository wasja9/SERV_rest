package ALL.controllers;

import ALL.forms.BrenchForm;
import ALL.forms.MessForm;
import ALL.services.BrenchService;
import ALL.services.MessService;
import ALL.transfer.BrenchDto;
import ALL.transfer.MessDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ALL.transfer.MessDto.from;


@RestController
public class MsController {

    /*  */
    @Autowired
    private MessService messService;

    @GetMapping("/ms")

    public List<MessDto> getMs() {
        System.out.println(messService.findAll());
        return from(messService.findAll());
    }

    //@GetMapping("/prj")
   // public List<PrjDto> getPrj() {
   //    return from(prjService.findAll());
    //}


    @PostMapping("/ms")
    public ResponseEntity<Object> addMs(@RequestBody MessForm messForm,
                                         @RequestParam String token) { //получаем токен
        messService.signUp(messForm,token);
        return ResponseEntity.ok().build();
    }



}