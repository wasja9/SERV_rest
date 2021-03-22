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
        System.out.println("JSON: ");
        System.out.println(messForm);
        messService.signUp(messForm,token);
        return ResponseEntity.ok().build();
        //return ResponseEntity.ok(loginService.login(loginForm));//обновление
    }

    @GetMapping("/msID/{id}")
    public List<MessDto> getId (@PathVariable("id") Integer id) {
        return from(messService.findAllById(id));//.findOne(userId);
    }

    @GetMapping("/msBR/{idbr}")
    public List<MessDto> getIdbr (@PathVariable("idbr") Integer idbr) {
        System.out.println("FFFFF:"+idbr);
        return from(messService.findAllByIdbr(idbr));//.findOne(userId);
    }

    //@GetMapping("/msIdMax")
   // public List<MessDto> getIdMax () {
    //    System.out.println(messService.findByIdMax());
       // return from(messService.findAllByIdMax());//.findOne(userId);
    //    return null;
   // }


}