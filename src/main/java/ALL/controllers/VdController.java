package ALL.controllers;

import ALL.forms.FilForm;
import ALL.forms.VidForm;
import ALL.models.Video;
import ALL.services.FilService;
import ALL.services.MessService;
import ALL.services.VidService;
import ALL.transfer.FilDto;
import ALL.transfer.MessDto;
import ALL.transfer.VidDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ALL.transfer.VidDto.from;


@RestController
public class VdController {

    /*  */
    @Autowired
    private VidService vidService;

    @GetMapping("/vd")
    public List<VidDto> getVd() {
        return from(vidService.findAll());
    }


    // @GetMapping("/prj")
    //public List<PrjDto> getPrj() {
    //    return from(prjService.findAll());
    //}

    @PostMapping("/vd")
    public ResponseEntity<Object> addVd(@RequestBody VidForm vidForm,
                                        @RequestParam String token) { //получаем токен
        vidService.signUp(vidForm,token);
        return ResponseEntity.ok().build();
    }


}