package ALL.controllers;

import ALL.forms.ProjForm;
import ALL.models.Projects;
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
    public List<PrjDto> getUsers() {
        return from(prjService.findAll());
    }

    @GetMapping("/prj/{prj-id}")
    public Projects getUser(@PathVariable("prj-id") Long prjId) {
        return prjService.findOne(prjId);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> addPrj(@RequestBody ProjForm projForm) {
        prjService.signUp(projForm);
        return ResponseEntity.ok().build();
    }

}