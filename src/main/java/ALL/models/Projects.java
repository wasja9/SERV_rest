package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "Projects")


public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int PrId;

    private String PrName;
    private String PrPart;
    private Data PrData;

    private int ID_us;









   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}