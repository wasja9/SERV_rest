package ALL.transfer;

import ALL.models.Projects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PrjDto {

    private int id;

    private String name;
    //private String part;
    // private Data PrData;
    private int id_us;


    public static PrjDto from(Projects prj) {
        return new PrjDto
                (
                    prj.getId(),

                    prj.getName(),
                  //  prj.getPart(),
                    prj.getId_us()
                );
    }

    public static List<PrjDto> from(List<Projects> projects) {
        return projects.stream().map(PrjDto::from).collect(Collectors.toList());
    }
}