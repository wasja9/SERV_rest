package ALL.transfer;

import ALL.models.prj;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prj_Dto {

    private int id;
    private String name;
    ///////////////////////////////////положение элемента в дереве///////////
    private int str;//номер строки в дереве
    private int node;//Номер от которого наследуется объект
    private int row;//порядковый номер объекта в конкретной строке
    /////////////////////////////////////////
    // private Data PrData;
    private int id_root;
    private int id_us;


    public static Prj_Dto from(prj pr) {
        return new Prj_Dto
                (
                    pr.getId(),
                    pr.getName(),
                    pr.getStr(),
                    pr.getNode(),
                    pr.getRow(),
                    pr.getId_root(),
                    pr.getId_us()
                );
    }

    public static List<Prj_Dto> from(List<prj> projects) {
        return projects.stream().map(Prj_Dto::from).collect(Collectors.toList());
    }
}