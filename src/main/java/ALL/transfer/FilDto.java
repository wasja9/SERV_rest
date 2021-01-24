package ALL.transfer;

import ALL.models.Files;
import ALL.models.Mess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FilDto {

    private int id;

    private byte[] file;
   // private String messege;

    private int id_us;
    private int id_pr;
    private int id_br;


    public static FilDto from(Files fl) {
    return new FilDto
            (
                    fl.getId(),

                    fl.getFile(),

                    fl.getId_us(),
                    fl.getId_pr(),
                    fl.getId_br()
            );
}


    public static List<FilDto> from(List<Files> filess) {
        return filess.stream().map(FilDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


