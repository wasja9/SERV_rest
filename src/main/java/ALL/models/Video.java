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
@Table(name = "Video")


public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

  //  @Expose(serialize = false)
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] video;

    private int id_br;
    private int id_us;








   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}