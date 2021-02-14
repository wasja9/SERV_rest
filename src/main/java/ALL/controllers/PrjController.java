package ALL.controllers;

import ALL.forms.PrjForm;
import ALL.services.Prj_Service;
import ALL.transfer.Prj_Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ALL.transfer.Prj_Dto.from;

//import ALL.transfer.UserDto.from;

@RestController
public class PrjController {

    /*  */
    @Autowired
    private Prj_Service prj_Service;

    @GetMapping("/pr")
    public List<Prj_Dto> getPrj() {
        return from(prj_Service.findAll());
    }

    @PostMapping("/pr")
    public ResponseEntity<Object> addPrj(@RequestBody PrjForm prjForm,
                                            @RequestParam String token) { //получаем токен
        prj_Service.signUp(prjForm,token);
        return ResponseEntity.ok().build();
    }


   // @GetMapping("/prj/{prj-id}")
    //public Projects getUser(@PathVariable("prj-id") Long prjId) {
   //     return prjService.findOne(prjId);
    //}



}