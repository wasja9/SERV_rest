package ALL.transfer;

import ALL.models.Bren;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BrenchDto {

    private int id;

    private String name;
    private String peck;//Пакет
    private int level; //Уровень

    private int idpr;
    private int idus;
    //private int idms;
    //private int idvd;
    //private int idfil;


public static BrenchDto from(Bren brn) {
    return new BrenchDto
            (
                    brn.getId(),

                    brn.getName(),
                    brn.getPeck(),
                    brn.getLevel(),

                    brn.getIdpr(),
                    brn.getIdus()
            );
}


    public static List<BrenchDto> from(List<Bren> brenchs) {
        return brenchs.stream().map(BrenchDto::from).collect(Collectors.toList());
    }

   // public static List<PrjDto> from(List<Projects> projects) {
    //    return projects.stream().map(PrjDto::from).collect(Collectors.toList());
   // }

}


