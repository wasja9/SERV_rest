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
@Table(name = "Files")


public class Files {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int FlId;

  //  @Expose(serialize = false)
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[]File;

    private int ID_br;
    private int ID_us;








   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}