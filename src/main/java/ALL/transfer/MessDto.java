package ALL.transfer;

import ALL.models.Bren;
import ALL.models.Mess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MessDto {

    private int id;

    private String messege;

    private int id_us;
    private int id_pr;
    private int id_br;


    public static MessDto from(Mess ms) {
    return new MessDto
            (
                    ms.getId(),

                    ms.getMessege(),

                    ms.getId_us(),
                    ms.getId_pr(),
                    ms.getId_br()
            );
}


    public static List<MessDto> from(List<Mess> messages) {
        return messages.stream().map(MessDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


