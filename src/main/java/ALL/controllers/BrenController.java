package ALL.controllers;

import ALL.forms.BrenchForm;
import ALL.forms.ProjForm;
import ALL.models.Bren;
import ALL.models.Projects;
import ALL.services.BrenchService;
import ALL.services.BrenchService;
import ALL.transfer.BrenchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ALL.transfer.BrenchDto.from;


@RestController
public class BrenController {

    /*  */
    @Autowired
    private BrenchService brenchService;

    @GetMapping("/brn")
    public List<BrenchDto> getBr() {
        return from(brenchService.findAll());
    }

    public ResponseEntity<Object> addPrj(@RequestBody BrenchForm brenchForm,
                                         @RequestParam String token) { //получаем токен
        brenchService.signUp(brenchForm,token);
        return ResponseEntity.ok().build();
    }



//    @GetMapping("/prj")
//    public List<PrjDto> getUsers() {
//        return from(prjService.findAll());
//    }

   // @PostMapping("/brn")
    //public ResponseEntity<Object> addPrj(@RequestBody ProjForm projForm) {
        //  public ResponseEntity<Object> addPrj(ProjForm projForm) {
     //   prjService.signUp(projForm);
     //   return ResponseEntity.ok().build();
    //}


    // @GetMapping("/prj/{prj-id}")
    //public Projects getUser(@PathVariable("prj-id") Long prjId) {
    //     return prjService.findOne(prjId);
    //}



}