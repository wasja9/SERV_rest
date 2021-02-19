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
@Table(name = "Bren")


public class Bren {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String peck;//Пакет
    private int level; //Уровень
  //  private String part;//
   // private Data data;

    private int idpr;
    private int idus;
   // private int id_ms;
   // private int id_vd;
   // private int id_fil;

    // @OneToMany(mappedBy = "user")
    //List<Token> tokens;

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
    public String getPeck() {
        return peck;
    }
    public void setPeck(String peck) {
        this.peck = peck;
    }
    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}
    public int getIdpr() {
        return idpr;
    }
    public void setIdpr(int idpr) {
        this.idpr = idpr;
    }
    public int getIdus() {
        return idus;
    }
    public void setIdus(int idus) {
        this.idus = idus;
    }

   // public Bren() {}

    public Bren(String name, String peck, int level) {
        this.name = name;
        this.peck = peck;
        this.level = level;
    }

    public Bren(String name, String peck, int level, int idpr, int idus) {
       // this.id = id;
        this.name = name;
        this.peck = peck;
        this.level = level;

        this.idpr = idpr;
        this.idus = idus;
    }


}