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
@Table(name = "Mess")


public class Mess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int MsId;

    //private String MsMessege;

  //  private int ID_br;
 //   private int ID_us;






}