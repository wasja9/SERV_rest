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
//@Builder
public class PrjDto {

    private int PrId;

    private String PrName;
    private String PrPart;
    // private Data PrData;
   // private int ID_us;


    public static PrjDto from(Projects prj) {
        return new PrjDto(
                prj.getPrId(),
                prj.getPrName(),
                prj.getPrPart()
        );
    }

    public static List<PrjDto> from(List<Projects> users) {
        return users.stream().map(PrjDto::from).collect(Collectors.toList());
    }
}