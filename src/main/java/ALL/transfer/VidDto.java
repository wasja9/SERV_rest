package ALL.transfer;

import ALL.models.Files;
import ALL.models.Mess;
import ALL.models.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VidDto {

    private int id;

    //private String messege;
    private byte[] video;

    private int idus;
    private int idpr;
    private int idbr;


    public static VidDto from(Video vd) {
    return new VidDto
            (
                    vd.getId(),

                    vd.getVideo(),

                    vd.getIdus(),
                    vd.getIdpr(),
                    vd.getIdbr()
            );
}


    public static List<VidDto> from(List<Video> videoss) {
        return videoss.stream().map(VidDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


