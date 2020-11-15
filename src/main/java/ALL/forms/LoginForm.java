package ALL.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginForm {
    private String login;
    private String password;

    public String getPassword() {
        return password;
    }
    public String getLogin() {
        return login;
    }
}