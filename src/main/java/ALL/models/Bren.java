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

    private int id_pr;
    private int id_us;
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
    public int getId_pr() {
        return id_pr;
    }
    public void setId_pr(int id_pr) {
        this.id_pr = id_pr;
    }
    public int getId_us() {
        return id_us;
    }
    public void setId_us(int id_us) {
        this.id_us = id_us;
    }

    public Bren(String name, String peck, int level) {
        this.name = name;
        this.peck = peck;
        this.level = level;
    }

    public Bren(String name, String peck, int level, int id_pr, int id_us) {
       // this.id = id;
        this.name = name;
        this.peck = peck;
        this.level = level;

        this.id_pr = id_pr;
        this.id_us = id_us;
    }


}