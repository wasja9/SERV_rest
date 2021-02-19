package ALL.forms;

import lombok.Data;

/**
 * Created by asu on 24.08.2020.
 */
@Data
public  class BrenchForm {
    //private int id;

    private String name;
    private String peck;//Пакет
    private int level; //Уровень

    private int idpr;
    private int idus;
   // private int id_ms;
   // private int id_vd;
   // private int id_fil;


    public String getName() {
        return name;
    }
    public String getPeck() {
        return peck;
    }
    public int getLevel() {return level;}

    public int getIdpr() {
        return idpr;
    }
    public int getIdus() {
        return idus;
    }

}
