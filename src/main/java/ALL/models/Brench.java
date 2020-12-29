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

    private int id;

    private String name;
   // private Data data;

    private int id_pr;
    private int id_us;
    private int id_ms;
    private int id_vd;
    private int id_fil;


   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}