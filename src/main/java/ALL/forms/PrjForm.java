package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class PrjForm {

    private String name;
    ///////////////////////////////////положение элемента в дереве///////////
    private int str;//номер строки в дереве
    private int node;//Номер от которого наследуется объект
    private int row;//порядковый номер объекта в конкретной строке
    /////////////////////////////////////////
    // private Data PrData;
    private int idroot;
    private int idus;

    public String getName() {return name;}
    public int getStr() { return str;  }
    public int getNode() { return node; }
    public int getRow() { return row; }
    public int getIdroot() {return idroot;}
    public int getIdus() { return idus; }

}
