package ALL.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import  java.awt.List;
import java.util.ArrayList;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "prj")


public class prj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    ///////////////////////////////////положение элемента в дереве///////////
    private int str;//номер строки в дереве
    private int node;//Номер от которого наследуется объект
    private int row;//порядковый номер объекта в конкретной строке
    /////////////////////////////////////////
    // private Data PrData;
    private int idroot;
    private int idus;

    public int getId() {return id; }
    public void setId(int id) { this.id = id;  }
    public String getName() { return name;  }
    public void setName(String name) { this.name = name;}
    public int getStr() {  return str;  }
    public void setStr(int str) { this.str = str;  }
    public int getNode() { return node; }
    public void setNode(int node) {this.node = node;  }
    public int getRow() { return row; }
    public void setRow(int row) {  this.row = row;  }
    public int getIdroot() { return idroot;  }
    public void setIdroot(int idroot) {  this.idroot = idroot; }
    public int getIdus() { return idus; }
    public void setIdus(int idus) { this.idus = idus;  }

    public prj() {}

    public prj(String name) {
        this.name = name;
        //  this.part = part;
    }

    public prj(String name,int str,int node,int row,int idroot,int idus) {
        this.name = name;
        this.str = str;
        this.node = node;
        this.row = row;
        this.idroot = idroot;
        this.idus=idus;
    }




   // @OneToMany(mappedBy = "user")
    //List<Token> tokens;
}