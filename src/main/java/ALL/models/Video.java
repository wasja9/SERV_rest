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

    private int idus;
    private int idpr;
    private int idbr;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public byte[] getVideo() {return video;}
    public void setVideo(byte[] video) {this.video = video;}
    public int getIdus() {return idus; }
    public void setIdus(int idus) {this.idus = idus;}
    public int getIdpr() {return idpr;}
    public void setIdpr(int idpr) {this.idpr = idpr;}
    public int getIdbr() {return idbr;}
    public void setIdbr(int idbr) {this.idbr = idbr;}

  public Video(byte[] video, int idus, int idpr, int idbr) {
    this.video = video;
    this.idus = idus;
    this.idpr = idpr;
    this.idbr = idbr;
  }

  public Video(byte[] video) {
    this.video = video;
  }

// @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}