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

    private int id_us;
    private int id_pr;
    private int id_br;


    public static VidDto from(Video vd) {
    return new VidDto
            (
                    vd.getId(),

                    vd.getVideo(),

                    vd.getId_us(),
                    vd.getId_pr(),
                    vd.getId_br()
            );
}


    public static List<VidDto> from(List<Video> videoss) {
        return videoss.stream().map(VidDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


