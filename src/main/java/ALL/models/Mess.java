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

    private int id_us;
    private int id_pr;
    private int id_br;

    public int getId() {return id; }
    public void setId(int id) {this.id = id;}
    public String getMessege() { return messege;}
    public void setMessege(String messege) {this.messege = messege; }
    public int getId_us() {return id_us; }
    public void setId_us(int id_us) { this.id_us = id_us;}
    public int getId_pr() { return id_pr; }
    public void setId_pr(int id_pr) { this.id_pr = id_pr; }
    public int getId_br() { return id_br;}
    public void setId_br(int id_br) { this.id_br = id_br; }

/*
    public Mess(int id, String messege, int id_us, int id_pr, int id_br) {
        this.id = id;
        this.messege = messege;
        this.id_us = id_us;
        this.id_pr = id_pr;
        this.id_br = id_br;
    }
*/

    public Mess(String messege, int id_us, int id_pr, int id_br) {
        this.messege = messege;
        this.id_us = id_us;
        this.id_pr = id_pr;
        this.id_br = id_br;
    }

    public Mess(String messege) {
        this.messege = messege;
    }


}