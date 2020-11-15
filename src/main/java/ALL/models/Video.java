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

    private int VidId;

   // private String BrName;
    //private String Status;







   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}