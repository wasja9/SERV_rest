package ALL.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ALL.models.Token;


@Data
@AllArgsConstructor

public class TokenDto {
    private String value;

   // public TokenDto(String value) {
   // }



   public static TokenDto from(Token token) {
       return new TokenDto(token.getValue());
    }

}
