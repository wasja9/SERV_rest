package ALL.controllers;

import ALL.forms.ProjForm;
import ALL.forms.LoginForm;

import ALL.services.PrjService;
import ALL.transfer.PrjDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static ALL.transfer.PrjDto.from;

//import ALL.transfer.UserDto.from;

@RestController
public class PrViwController {

    /*  */
    @Autowired
    private PrjService prjService;

    @GetMapping("/prj")
    public List<PrjDto> getPrj() {
        return from(prjService.findAll());
    }

        @PostMapping("/prj")
      //public ResponseEntity<Object> addPrj(@RequestBody ProjForm projForm, LoginForm loginForm) {
        public ResponseEntity<Object> addPrj(@RequestBody ProjForm projForm,
                                            @RequestParam String token//получаем токен
                                            ) {
            System.out.println(token);//Выводим значение токена

        prjService.signUp(projForm,token);
        return ResponseEntity.ok().build();
    }


   // @GetMapping("/prj/{prj-id}")
    //public Projects getUser(@PathVariable("prj-id") Long prjId) {
   //     return prjService.findOne(prjId);
    //}



}