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

    private int idus;
    private int idpr;
    private int idbr;


    public static FilDto from(Files fl) {
    return new FilDto
            (
                    fl.getId(),

                    fl.getFile(),

                    fl.getIdus(),
                    fl.getIdpr(),
                    fl.getIdbr()
            );
}


    public static List<FilDto> from(List<Files> filess) {
        return filess.stream().map(FilDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


