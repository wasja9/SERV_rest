package ALL.controllers;

import ALL.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ALL.forms.UserForm;
import ALL.models.User;
import ALL.repository.UsersRepository;
import ALL.services.UsersService;
import ALL.transfer.UserDto;

import ALL.forms.UserForm;
//import ALL.transfer.UserDto.from;
import static ALL.transfer.UserDto.from;

import java.util.List;

@RestController
public class UsersController {

    /*  */
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
     public List<UserDto> getUsers() {
            return from(usersService.findAll());
     }

    @GetMapping("/users/{user-id}")
    public User getUser(@PathVariable("user-id") Long userId) {
        return usersService.findOne(userId);
    }

    @PostMapping("/users")
    //public ResponseEntity<Object> addUser(UserForm userForm) {
    public ResponseEntity<Object> addUser(@RequestBody UserForm userForm) {
        usersService.signUp(userForm);
        return ResponseEntity.ok().build();
    }


}