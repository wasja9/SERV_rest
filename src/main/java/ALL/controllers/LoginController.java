package ALL.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ALL.forms.LoginForm;
import ALL.services.LoginService;
import ALL.transfer.TokenDto;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    //ResponseEntity представляет полный HTTP-ответ: код состояния, заголовки и тело

    //Если вы аннотируете метод с помощью @ResponseBody, Spring попытается преобразовать
    // его возвращаемое значение и автоматически записать его в ответ http.
    // Если вы аннотируете параметр методов с помощью @RequestBody, Spring на лету
    // попытается преобразовать содержимое тела входящего запроса в ваш объект параметра

    public ResponseEntity<TokenDto> login(@RequestBody  LoginForm loginForm) {
        return ResponseEntity.ok(loginService.login(loginForm));//обновление
        //return ResponseEntity.
    }
}