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

    private int id;

  //  @Expose(serialize = false)
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] file;

    private int idus;
    private int idpr;
    private int idbr;

    public int getId() { return id;}
    public void setId(int id) {this.id = id;}
    public byte[] getFile() {return file;}
    public void setFile(byte[] file) {this.file = file;}
    public int getIdus() {return idus;}
    public void setIdus(int idus) {this.idus = idus;}
    public int getIdpr() { return idpr; }
    public void setIdpr(int idpr) {this.idpr = idpr;}
    public int getIdbr() {return idbr;}
    public void setIdbr(int idbr) {this.idbr = idbr;}

// @OneToMany(mappedBy = "user")
    //List<Token> tokens;

  public Files(byte[] file, int idus, int idpr, int idbr) {
    this.file = file;
    this.idus = idus;
    this.idpr = idpr;
    this.idbr = idbr;
  }

  public Files(byte[] file) {
    this.file = file;
  }


}