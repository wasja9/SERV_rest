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
   // private Data PrData;
    private int ID_us;


    public int getPrId() {return PrId;}
    public void setPrId(int prId) {  PrId = prId; }
    public String getPrName() {return PrName; }
    public void setPrName(String prName) {  PrName = prName;}
    public String getPrPart() {return PrPart;}
    public void setPrPart(String prPart) {PrPart = prPart;}

    public Projects(String pr_name, String pr_part) {
        this.PrName = pr_name;
        this.PrPart = pr_part;
    }





   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}