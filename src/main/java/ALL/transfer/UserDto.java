package ALL.transfer;

import ALL.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private int id;
    private String login;
    private String firstName;
    private String lastName;

    public static UserDto from(User user) {
        return new UserDto(
                user.getId(),
                user.getLogin(),
                user.getFirstName(),
                user.getLastName());
    }

    public static List<UserDto> from(List<User> users) {
        return users.stream().map(UserDto::from).collect(Collectors.toList());
    }
}