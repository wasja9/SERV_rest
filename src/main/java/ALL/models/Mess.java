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
    private int id;

    private String messege;

    private int idus;
    private int idpr;
    private int idbr;

    public int getId() {return id; }
    public void setId(int id) {this.id = id;}
    public String getMessege() { return messege;}
    public void setMessege(String messege) {this.messege = messege; }
    public int getIdus() {return idus; }
    public void setIdus(int idus) { this.idus = idus;}
    public int getIdpr() { return idpr; }
    public void setIdpr(int idpr) { this.idpr = idpr; }
    public int getIdbr() { return idbr;}
    public void setIdbr(int idbr) { this.idbr = idbr; }

/*
    public Mess(int id, String messege, int id_us, int id_pr, int id_br) {
        this.id = id;
        this.messege = messege;
        this.id_us = id_us;
        this.id_pr = id_pr;
        this.id_br = id_br;
    }
*/

    public Mess(String messege, int idus, int idpr, int idbr) {
        this.messege = messege;
        this.idus = idus;
        this.idpr = idpr;
        this.idbr = idbr;
    }

    public Mess(String messege) {
        this.messege = messege;
    }


}