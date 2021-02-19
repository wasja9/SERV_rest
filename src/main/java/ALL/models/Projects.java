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

    private int id;

    private String name;
   // private String part;
   // private Data PrData;
    private int idus;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  //  public String getPart() {
  //      return part;
  //  }
  //  public void setPart(String part) {
  //      this.part = part;
  //  }
    public int getIdus() {
        return idus;
    }
    public void setIdus(int idus) {
        this.idus = idus;
    }

// public Projects(String prName, String prPart) {
   //     this.PrName = prName;
   //     this.PrPart = prPart;
  //  }

    public Projects(String name) {
             this.name = name;
           //  this.part = part;
    }

    public Projects(String name, int idus) {
        this.name = name;
      //  this.part = part;
        this.idus=idus;
    }

   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}