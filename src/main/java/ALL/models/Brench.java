package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "Brench")


public class Brench {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int BrId;

   // private String BrName;
   // private Data BrData;

   // private int ID_pr;
   // private int ID_us;
   // private int ID_ms;
   // private int ID_vd;
   // private int ID_fil;


   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}